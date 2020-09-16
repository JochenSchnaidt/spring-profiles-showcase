package me.schnaidt.spring.profiles.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties("workflow")
public class WorkflowProperties {

  private String id;
  private String description;
  private String url;
}
