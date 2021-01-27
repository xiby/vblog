package tech.xiby.vueblog.domain.dto;

import java.util.Date;

/**
 * 与前端交互的用户信息
 * @author xiby
 */
public class User {
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

    private Long liked;

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
}
