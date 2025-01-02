package com.heribertojuarezjaimes.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(
        basePackages = {"com.heribertojuarezjaimes.beans", "com.heribertojuarezjaimes.services", "com.heribertojuarezjaimes.implementation"}
)

public class ProjectConfig {
}