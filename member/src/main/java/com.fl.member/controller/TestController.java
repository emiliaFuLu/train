package com.fl.member.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试controller
 *
 * @author <a href="mailto:fulurjj@gmail.com">FuLu</a >
 * @since 2025/1/15 23:44
 */
@RestController("/test")
public class TestController {


    @RequestMapping("/test")
    public String test() {
        return "test";
    }
}
