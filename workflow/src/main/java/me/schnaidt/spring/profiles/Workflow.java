package me.schnaidt.spring.profiles;

@FunctionalInterface
public interface Workflow {

  /**
   * Starts the workflow implementation.
   */
  void execute();

}
