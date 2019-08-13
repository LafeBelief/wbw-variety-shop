package cn.wbw.vs.controller;

import cn.wbw.vs.common.api.CommonPage;
import cn.wbw.vs.common.api.CommonResult;
import cn.wbw.vs.dao.UmsAdminMapper;
import cn.wbw.vs.model.UmsAdmin;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Slf4j
@Api(tags = "As", description = "测试")
public class As {
    @Autowired
    private UmsAdminMapper mapper;

    @RequestMapping("/123")
    @ApiOperation("测试aaa")
    public CommonResult sasa() {

        List<UmsAdmin> umsAdmins = mapper.selectAll();
        log.info(String.valueOf(umsAdmins));
        return CommonResult.success(CommonPage.restPage(umsAdmins));
    }
}
