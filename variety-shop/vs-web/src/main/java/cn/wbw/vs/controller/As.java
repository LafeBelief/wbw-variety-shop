package cn.wbw.vs.controller;

import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class As {

    @RequestMapping("/123")
    public String sasa() {
        log.info("asasa");
        return "sas";
    }
}
