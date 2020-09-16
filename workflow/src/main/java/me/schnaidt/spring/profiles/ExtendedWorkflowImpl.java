package me.schnaidt.spring.profiles;

import lombok.extern.slf4j.Slf4j;
import me.schnaidt.spring.profiles.config.AdditionalProperties;
import me.schnaidt.spring.profiles.config.WorkflowProperties;
import org.springframework.beans.factory.annotation.Autowired;

@Slf4j
public class ExtendedWorkflowImpl implements Workflow {

  @Autowired
  private WorkflowProperties properties;

  @Autowired
  private AdditionalProperties additionalProperties;

  @Override
  public void execute() {
    log.info("Workflow id: {}", properties.getId());
    log.info("{}", properties.getDescription());
    log.info("Backend calls would be fired against: {}", properties.getUrl());

    furtherAction();
  }

  /**
   * enhanced workflow logic to make more/other calls and calculations.
   */
  private void furtherAction() {
    log.info("this is {}", additionalProperties.getDescription());
  }
}
