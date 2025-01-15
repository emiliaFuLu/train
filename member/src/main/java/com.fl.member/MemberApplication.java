package com.fl.member;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 启动类
 *
 * @author <a href="mailto:fulurjj@gmail.com">FuLu</a >
 * @since 2025/1/15 23:28
 */
@SpringBootApplication
public class MemberApplication {
    private static final Logger logger =  LoggerFactory.getLogger(MemberApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(MemberApplication.class, args);
        logger.info("member start success");
    }
}
