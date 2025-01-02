package com.heribertojuarezjaimes.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(
        basePackages = {"com.heribertojuarzjaimes.beans", "com.heribertojuarezjaimes.services", "com.heribertojuarezjaimes.implementation"},
        basePackageClasses = {com.heribertojuarezjaimes.beans.Person.class, com.heribertojuarezjaimes.beans.Vehicle.class}

)
public class ProjectConfig {
}
