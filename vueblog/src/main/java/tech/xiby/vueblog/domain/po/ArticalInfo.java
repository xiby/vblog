package tech.xiby.vueblog.domain.po;

import java.util.Date;

/**
 * 文章信息
 *
 * @author xiby
 */
public class ArticalInfo {
    /**
     * 文章id
     */
    private Long id;

    /**
     * 作者id;
     */
    private Long user;

    /**
     * 作者姓名
     */
    private String userName;

    /**
     * 文章标题
     */
    private String title;

    /**
     * 摘要
     */
    private String summary;

    /**
     * 简介图片地址
     */
    private String image;

    /**
     * 文章内容
     */
    private String content;

    /**
     * 点赞数
     */
    private int liked;

    /**
     * tagid
     */
    private Long tag;

    /**
     * tag名称
     */
    private String tagName;

    /**
     * 上次编辑时间
     */
    private Date lastEdit;

    /**
     * 新增时间
     */
    private Date createTime;

    /**
     * 删除标志
     */
    private String deleted;

    /**
     * 浏览量
     */
    private Long reviewed;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUser() {
        return user;
    }

    public void setUser(Long user) {
        this.user = user;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getLiked() {
        return liked;
    }

    public void setLiked(int liked) {
        this.liked = liked;
    }

    public Date getLastEdit() {
        return lastEdit;
    }

    public void setLastEdit(Date lastEdit) {
        this.lastEdit = lastEdit;
    }

    public String getDeleted() {
        return deleted;
    }

    public void setDeleted(String deleted) {
        this.deleted = deleted;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Long getReviewed() {
        return reviewed;
    }

    public void setReviewed(Long reviewed) {
        this.reviewed = reviewed;
    }

    public Long getTag() {
        return tag;
    }

    public void setTag(Long tag) {
        this.tag = tag;
    }

    public String getTagName() {
        return tagName;
    }

    public void setTagName(String tagName) {
        this.tagName = tagName;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
