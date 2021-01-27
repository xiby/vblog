package tech.xiby.vueblog.service;

import tech.xiby.vueblog.domain.dto.User;

/**
 * 用户服务接口
 * @author xiby
 */
public interface IUserService {
    /**
     * 登录接口
     */
    User login(User user);
}
