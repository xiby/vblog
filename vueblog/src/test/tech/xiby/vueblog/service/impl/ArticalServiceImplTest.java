package tech.xiby.vueblog.service.impl;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import tech.xiby.vueblog.TestBase;
import tech.xiby.vueblog.domain.po.ArticalInfo;
import tech.xiby.vueblog.service.IArticalService;

public class ArticalServiceImplTest extends TestBase {

    @Autowired
    private IArticalService articalService;

    @Test
    public void get() {
        Long id = 1L;
        ArticalInfo ret = articalService.get(id);
        Assert.assertNotNull(ret);
        Assert.assertEquals(id, ret.getId());
    }
}