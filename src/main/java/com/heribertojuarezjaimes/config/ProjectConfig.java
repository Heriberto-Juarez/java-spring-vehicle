package com.heribertojuarezjaimes.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.heribertojuarzjaimes.beans", "com.heribertojuarezjaimes.services"})
@ComponentScan(basePackageClasses = {})
public class ProjectConfig {
}
