package cn.wbw.vs.controller;

import cn.wbw.vs.dao.UmsAdminMapper;
import cn.wbw.vs.model.UmsAdmin;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Slf4j
public class As {
    @Autowired
    private UmsAdminMapper mapper;

    @RequestMapping("/123")
    public String sasa() {

        List<UmsAdmin> umsAdmins = mapper.selectAll();
        log.info(String.valueOf(umsAdmins));
        return umsAdmins.toString();
    }
}
