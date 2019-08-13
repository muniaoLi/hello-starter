package com.muniao.hello.starter.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "hello")
@Data
public class HelloProperties
{
    private static final String DEFAULT_NAME="lixp";
    private static final String DEFAULT_MSG="好消息";

    private String name = DEFAULT_NAME;
    private String msg = DEFAULT_MSG;

}
