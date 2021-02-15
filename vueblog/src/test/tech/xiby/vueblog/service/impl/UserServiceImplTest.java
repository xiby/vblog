package tech.xiby.vueblog.service.impl;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import tech.xiby.vueblog.TestBase;
import tech.xiby.vueblog.domain.po.UserInfo;
import tech.xiby.vueblog.service.IUserService;

/**
 * 用户服务测试类
 * @author xiby
 */
public class UserServiceImplTest extends TestBase {

    @Autowired
    private IUserService userService;

    @Test
    public void login() {
        String email = "1111@123.com";
        String password = "123";
        UserInfo userInfo = new UserInfo();
        userInfo.setEmail(email);
        userInfo.setPwd(password);
        UserInfo ret = userService.login(userInfo);
        Assert.assertNotNull(ret);
    }
}