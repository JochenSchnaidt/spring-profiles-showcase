package me.schnaidt.spring.profiles.config;


import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties("additional")
public class AdditionalProperties {

  private String description;
}
