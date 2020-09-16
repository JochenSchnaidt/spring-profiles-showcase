package me.schnaidt.spring.profiles;

import lombok.extern.slf4j.Slf4j;
import me.schnaidt.spring.profiles.config.WorkflowProperties;
import org.springframework.beans.factory.annotation.Autowired;

@Slf4j
public class BasicWorkflowImpl implements Workflow {

  @Autowired
  private WorkflowProperties properties;

  @Override
  public void execute() {
    log.info("Workflow id: {}", properties.getId());
    log.info("{}", properties.getDescription());
    log.info("Backend calls would be fired against: {}", properties.getUrl());
  }
}
