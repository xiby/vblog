package tech.xiby.vueblog.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;
import tech.xiby.vueblog.common.utils.ThreadPoolUtils;
import tech.xiby.vueblog.domain.po.UserInfo;
import tech.xiby.vueblog.exception.AuthException;
import tech.xiby.vueblog.exception.RegisterException;
import tech.xiby.vueblog.mappers.UserMapper;
import tech.xiby.vueblog.service.IUserService;

import javax.annotation.PostConstruct;
import java.util.UUID;
import java.util.concurrent.ExecutorService;

import static tech.xiby.vueblog.common.Constants.CODE_REG_DUPLICATED_EMAIL;
import static tech.xiby.vueblog.common.Constants.CODE_REG_MISSING_PARAM;

/**
 * 用户服务实现
 *
 * @author xiby
 */
@Service
public class UserServiceImpl implements IUserService {
    private static Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

    @Autowired
    private UserMapper userMapper;

    /**
     * 线程池，用于执行
     */
    private ExecutorService executorService;

    @PostConstruct
    public void init() {
        executorService = ThreadPoolUtils.build(5, 10, 1);
    }

    @Override
    public UserInfo login(UserInfo user) {
        if (null == user || StringUtils.isEmpty(user.getEmail()) || StringUtils.isEmpty(user.getPwd())) {
            throw new AuthException("必填信息为空");
        }
        UserInfo ret = userMapper.getByUser(user);
        if (ret == null) {
            throw new AuthException("用户名或密码错误");
        }
        String token = UUID.randomUUID().toString();
        ret.setToken(token);
        logger.debug(String.format("generate token: {} for user: {}", token, ret.getId()));
        updateToken(ret.getId(), token);
        return ret;
    }

    /**
     * 更新token
     * todo 添加redis缓存
     *
     * @param id    用户id
     * @param token token
     */
    private void updateToken(long id, String token) {
        userMapper.updateToken(id, token);
    }

    @Override
    public void register(UserInfo user) {
        if (null == user || StringUtils.isEmpty(user.getEmail()) || StringUtils.isEmpty(user.getPwd())) {
            throw new RegisterException(CODE_REG_MISSING_PARAM);
        }
        UserInfo u = userMapper.getByEmail(user.getEmail());
        if(u != null){
            throw new RegisterException(CODE_REG_DUPLICATED_EMAIL);
        }
        userMapper.insert(user);
    }
}
