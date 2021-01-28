package tech.xiby.vueblog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tech.xiby.vueblog.domain.ResponseInfo;
import tech.xiby.vueblog.domain.po.UserInfo;
import tech.xiby.vueblog.service.IUserService;

/**
 * 用户信息对外接口
 * @author xiby
 */
@RestController
@RequestMapping("/user")
@Service
public class UserController {
    @Autowired
    private IUserService userService;

    @PostMapping("/login")
    public ResponseInfo<UserInfo> login(@RequestBody UserInfo user){
        return ResponseInfo.OK(userService.login(user));
    }

    @PostMapping("/registe")
    public ResponseInfo registe(@RequestBody UserInfo user){
        userService.register(user);
        return ResponseInfo.EMPTY_RESPONSE();
    }
}
