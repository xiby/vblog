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
     * 邮箱
     */
    private String email;
    /**
     * 上次登录时间
     */
    private Date lastLoginDate;

    private String token;

    private Long liked;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public Date getLastLoginDate() {
        return lastLoginDate;
    }

    public void setLastLoginDate(Date lastLoginDate) {
        this.lastLoginDate = lastLoginDate;
    }

    public Long getLiked() {
        return liked;
    }

    public void setLiked(Long liked) {
        this.liked = liked;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
