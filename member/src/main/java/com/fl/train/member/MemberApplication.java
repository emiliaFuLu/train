package com.fl.train.member;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * 启动类
 *
 * @author <a href="mailto:fulurjj@gmail.com">FuLu</a >
 * @since 2025/1/15 23:28
 */
@SpringBootApplication(scanBasePackages = {"com.fl.train.member", "com.fl.train.common"})
@EnableAspectJAutoProxy
public class MemberApplication {
    private static final Logger logger = LoggerFactory.getLogger(MemberApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(MemberApplication.class, args);
    }
}
