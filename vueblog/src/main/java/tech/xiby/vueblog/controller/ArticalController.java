package tech.xiby.vueblog.controller;

import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;
import tech.xiby.vueblog.domain.ResponseInfo;
import tech.xiby.vueblog.domain.dto.ArticalSearchParam;
import tech.xiby.vueblog.domain.po.ArticalInfo;
import tech.xiby.vueblog.service.IArticalService;

/**
 * 文章信息对外接口
 * @author xiby
 */
@RestController
@RequestMapping("/artical")
public class ArticalController {

    @Autowired
    private IArticalService articalService;

    @GetMapping("/{id}")
    public ResponseInfo<ArticalInfo> details(@PathVariable("id") Long id){
        return ResponseInfo.OK(articalService.get(id));
    }

    @PostMapping("/list")
    public ResponseInfo<PageInfo<ArticalInfo>> list(@RequestBody ArticalSearchParam param){
        return ResponseInfo.OK(articalService.list(param));
    }
}
