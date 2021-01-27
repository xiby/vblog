package tech.xiby.vueblog.domain.po;

import java.util.Date;

/**
 * 用户信息定义
 * @author xiby
 */
public class UserInfo {
    /**
     * 用户id
     */
    private long id;

    /**
     * 登录用户名
     */
    private String name;

    /**
     * 密码
     */
    private String pwd;

    /**
     * 上次登录时间
     */
    private Date lastLoginDate;


}
