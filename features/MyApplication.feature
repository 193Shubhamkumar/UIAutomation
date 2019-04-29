
@tag
Feature: Title of your feature
  I want to use this template for my feature file

  @tag1
  Scenario: Test netstorm smoke scenario
    Given Open chrome and start application 
    When I enter valid "username" and valid "password"
    Then User should able login successfully
    #Then Click on Home icon
    #Then open NDConfig UI
    #Then Click on import topologies option 
    #Then Select drop down option in topology
    
    @tag2
   Scenario:  open config UI 
    
    Given Click on Home icon
    Then open NDConfig UI
    Then Click on import topologies option
    Then Select drop down option in topology 
    
    

