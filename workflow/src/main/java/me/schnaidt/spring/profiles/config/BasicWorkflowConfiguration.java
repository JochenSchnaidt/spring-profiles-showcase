package me.schnaidt.spring.profiles.config;

import me.schnaidt.spring.profiles.BasicWorkflowImpl;
import me.schnaidt.spring.profiles.Workflow;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("business1")
public class BasicWorkflowConfiguration {

  /**
   * This configuration creates a {@link BasicWorkflowImpl} when the according profile {@code business1} is active.
   *
   * @return a workflow implementation
   */
  @Bean
  public Workflow createWorkflowForBusinessUnit1() {
    BasicWorkflowImpl instance = new BasicWorkflowImpl();
    return instance;
  }
}
