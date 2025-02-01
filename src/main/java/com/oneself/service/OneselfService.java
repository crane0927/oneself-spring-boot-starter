package com.oneself.service;

/**
 * @author liuhuan
 * date 2025/2/1
 * packageName com.oneself.service
 * className OneselfService
 * description 核心功能
 * version 1.0
 */
public class OneselfService {
    private final String configValue;

    public OneselfService(String configValue) {
        this.configValue = configValue;
    }

    public String doSomething() {
        return "Result based on " + configValue;
    }
}
