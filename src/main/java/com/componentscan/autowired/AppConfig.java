package com.componentscan.autowired;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan(basePackages = "com.componentscan.autowired")
public class AppConfig {
}
