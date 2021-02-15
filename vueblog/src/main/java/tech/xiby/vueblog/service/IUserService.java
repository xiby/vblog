package tech.xiby.vueblog.service;

import tech.xiby.vueblog.domain.po.UserInfo;

/**
 * 用户服务接口
 * @author xiby
 */
public interface IUserService {
    /**
     * 登录接口
     * @param user 登录的用户信息
     * @return UserInfo 返回登陆成功的用户信息
     */
    UserInfo login(UserInfo user);

    /**

     * 用户注册
     * @param user 注册的用户信息
     */
    void register(UserInfo user);
}
