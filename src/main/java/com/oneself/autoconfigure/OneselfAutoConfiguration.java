package com.oneself.autoconfigure;

import com.oneself.service.OneselfService;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

/**
 * @author liuhuan
 * date 2025/2/1
 * packageName com.oneself.autoconfigure
 * className OneselfAutoConfiguration
 * description 自动配置类
 * version 1.0
 */
@AutoConfiguration
@EnableConfigurationProperties(OneselfProperties.class)
@ConditionalOnClass(OneselfProperties.class)
@ConditionalOnProperty(prefix = "oneself-starter", name = "enabled", havingValue = "true", matchIfMissing = true)
public class OneselfAutoConfiguration {

    @Bean
    @ConditionalOnMissingBean
    public OneselfService yourModuleService(OneselfProperties properties) {
        return new OneselfService(properties.getConfigValue());
    }
}
