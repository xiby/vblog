package tech.xiby.vueblog.domain.dto;

/**
 * 文章搜索参数
 * @author xiby
 */
public class ArticalSearchParam {
    /**
     * 页号
     */
    private int pageNum;

    /**
     * 分页大小
     */
    private int pageSize;

    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }
}
