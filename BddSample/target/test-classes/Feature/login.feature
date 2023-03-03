
@tag
Feature: navigate to the application
  

  @tag1
  Scenario: Navigate to the ritual website
    Given Navigation url is working
    When I navigate to the ritual website
    Then validate that we landed in the ritual website
   
