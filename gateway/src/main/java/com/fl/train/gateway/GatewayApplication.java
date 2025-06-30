package com.fl.train.gateway;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.ConfigurableEnvironment;

/**
 * 启动类
 *
 * @author <a href="mailto:fulurjj@gmail.com">FuLu</a >
 * @since 2025/1/15 23:28
 */
@SpringBootApplication
public class GatewayApplication {
    private static final Logger logger = LoggerFactory.getLogger(GatewayApplication.class);

    public static void main(String[] args) {
        ConfigurableEnvironment env = SpringApplication.run(GatewayApplication.class, args).getEnvironment();
        logger.info("gateway start success", env.getProperty("server.port"));
    }
}
