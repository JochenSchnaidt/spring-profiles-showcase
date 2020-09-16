package me.schnaidt.spring.profiles.service;

import lombok.extern.slf4j.Slf4j;
import me.schnaidt.spring.profiles.Workflow;
import me.schnaidt.spring.profiles.config.ServiceProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class Starter {

  @Autowired
  private ServiceProperties serviceProperties;

  @Autowired
  private Workflow workflow;

  /**
   * This is a simple trigger which starts the configured workflow.
   */
  @Scheduled(initialDelay = 2000, fixedRate = 4000)
  public void perform() {
    log.info("show some effort: {}", serviceProperties.getSomeText());
    workflow.execute();
  }
}
