package com.componentscan.usingAnnotations;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan(basePackages = "com.componentscan.usingAnnotations")
public class AppConfig {
}
