package me.schnaidt.spring.profiles.config;

import me.schnaidt.spring.profiles.ExtendedWorkflowImpl;
import me.schnaidt.spring.profiles.Workflow;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("business2")
@EnableConfigurationProperties(AdditionalProperties.class)
public class ExtendedWorkflowConfiguration {

  /**
   * This configuration creates a {@link ExtendedWorkflowImpl} when the according profile {@code business2} is active.
   *
   * @return a workflow implementation
   */
  @Bean
  public Workflow createWorkflowForBusinessUnit2() {
    ExtendedWorkflowImpl instance = new ExtendedWorkflowImpl();
    return instance;
  }
}
