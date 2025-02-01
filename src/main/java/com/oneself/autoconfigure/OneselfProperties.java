package com.oneself.autoconfigure;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author liuhuan
 * date 2025/2/1
 * packageName com.oneself.autoconfigure
 * className OneselfProperties
 * description 自定义配置属性
 * version 1.0
 */
@ConfigurationProperties(prefix = "oneself-starter")
public class OneselfProperties {

    private String configValue = "default";

    public String getConfigValue() {
        return configValue;
    }

    public void setConfigValue(String configValue) {
        this.configValue = configValue;
    }
}
