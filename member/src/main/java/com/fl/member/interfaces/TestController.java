package com.fl.member.interfaces;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试controller
 *
 * @author <a href="mailto:fulurjj@gmail.com">FuLu</a >
 * @since 2025/1/15 23:44
 */
@RestController()
public class TestController {


    @RequestMapping("/hello")
    public String test() {
        return "hello";
    }
}
