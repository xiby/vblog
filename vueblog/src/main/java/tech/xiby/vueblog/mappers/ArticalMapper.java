package tech.xiby.vueblog.mappers;

import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Repository;
import tech.xiby.vueblog.domain.dto.ArticalSearchParam;
import tech.xiby.vueblog.domain.po.ArticalInfo;

/**
 * 文章mapper
 *
 * @author xiby
 */
@Repository
public interface ArticalMapper {
    /**
     * 根据id获取文章详情
     *
     * @param id
     * @return
     */
    ArticalInfo get(Long id);

    /**
     * 新增文章信息
     *
     * @param articalInfo
     */
    void save(ArticalInfo articalInfo);

    /**
     * 根据条件查询列表
     *
     * @param param
     * @return
     */
    PageInfo<ArticalInfo> list(ArticalSearchParam param);

    /**
     * 更新文章信息
     *
     * @param articalInfo
     */
    void update(ArticalInfo articalInfo);

    /**
     * 删除文章信息
     *
     * @param id
     */
    void delete(Long id);


}
