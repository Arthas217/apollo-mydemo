package com.apollo.demo.controller;

import com.ctrip.framework.apollo.Config;
import com.ctrip.framework.apollo.ConfigService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author 会游泳的蚂蚁
 * @Description: ### 架构部署图
 * https://www.apolloconfig.com/#/zh/deployment/deployment-architecture
 * @Date 2022/1/15 11:54
 */
@RestController
public class ApolloController {

    private static Logger logger = LoggerFactory.getLogger(ApolloController.class);

    @Value("${server.port}")
    String port;

    private final String namespace = "application";

    @GetMapping("/test")
    public String test() {
        logger.info("---------------");
        Config config = ConfigService.getConfig(namespace);
        String timeout = config.getProperty("timeout", "1");
        String white = config.getProperty("white", "");
        System.out.println(white);
        return "值为：" + timeout;
    }
}
