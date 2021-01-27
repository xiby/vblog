package tech.xiby.vueblog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import tech.xiby.vueblog.domain.ResponseInfo;
import tech.xiby.vueblog.domain.dto.User;
import tech.xiby.vueblog.service.IUserService;

/**
 * 用户信息对外接口
 * @author xiby
 */
@RequestMapping("/user")
@Service
public class UserController {
    @Autowired
    private IUserService userService;

    @PostMapping("/login")
    public ResponseInfo<User> login(@RequestBody User user){
        return ResponseInfo.OK(userService.login(user));
    }
}
