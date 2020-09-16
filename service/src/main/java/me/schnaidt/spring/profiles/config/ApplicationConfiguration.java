package me.schnaidt.spring.profiles.config;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@Configuration
@EnableConfigurationProperties(ServiceProperties.class)
public class ApplicationConfiguration {

}
