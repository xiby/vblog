package tech.xiby.vueblog.service;

import com.github.pagehelper.PageInfo;
import tech.xiby.vueblog.domain.dto.ArticalSearchParam;
import tech.xiby.vueblog.domain.po.ArticalInfo;

/**
 * 文章服务抽象
 *
 * @author xiby
 */
public interface IArticalService {
    /**
     * 根据文章编码获取文章具体内容
     *
     * @param id
     * @return
     */
    ArticalInfo get(Long id);

    /**
     * 获取文章列表
     *
     * @param param
     * @return
     */
    PageInfo<ArticalInfo> list(ArticalSearchParam param);

    /**
     * 新增文章
     *
     * @param articalInfo
     */
    void save(ArticalInfo articalInfo);

    /**
     * 修改文章
     *
     * @param articalInfo
     */
    void update(ArticalInfo articalInfo);

    void delete(Long id);
}
