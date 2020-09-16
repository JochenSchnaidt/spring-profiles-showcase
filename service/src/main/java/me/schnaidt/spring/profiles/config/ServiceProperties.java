package me.schnaidt.spring.profiles.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties("service")
public class ServiceProperties {

  private Integer someNumber;
  private String someText;
}
