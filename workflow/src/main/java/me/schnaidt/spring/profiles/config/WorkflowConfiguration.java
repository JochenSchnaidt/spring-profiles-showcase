package me.schnaidt.spring.profiles.config;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(WorkflowProperties.class)
public class WorkflowConfiguration {

}
