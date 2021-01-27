package tech.xiby.vueblog.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tech.xiby.vueblog.domain.dto.User;
import tech.xiby.vueblog.domain.po.UserInfo;
import tech.xiby.vueblog.mappers.UserMapper;
import tech.xiby.vueblog.service.IUserService;

/**
 * 用户服务实现
 * @author xiby
 */
@Service
public class UserServiceImpl implements IUserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public UserInfo login(User user) {
        return userMapper.getByUser(user);
    }
}
