package tech.xiby.vueblog.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tech.xiby.vueblog.domain.dto.ArticalSearchParam;
import tech.xiby.vueblog.domain.po.ArticalInfo;
import tech.xiby.vueblog.mappers.ArticalMapper;
import tech.xiby.vueblog.service.IArticalService;

import java.util.List;

/**
 * 文章服务实现
 *
 * @author xiby
 */
@Service
public class ArticalServiceImpl implements IArticalService {
    @Autowired
    private ArticalMapper articalMapper;

    /**
     * TODO 增加未获取到文章的处理
     *
     * @param id
     * @return
     */
    @Override
    public ArticalInfo get(Long id) {
        ArticalInfo ret = articalMapper.get(id);
        return ret;
    }

    @Override
    public PageInfo<ArticalInfo> list(ArticalSearchParam param) {
        PageHelper.startPage(param.getPageNum(), param.getPageSize());
        List<ArticalInfo> ret = articalMapper.list(param);
        return new PageInfo<>(ret);
    }

    @Override
    public void save(ArticalInfo articalInfo) {
        articalMapper.save(articalInfo);
    }

    @Override
    public void update(ArticalInfo articalInfo) {

    }

    @Override
    public void delete(Long id) {

    }
}
