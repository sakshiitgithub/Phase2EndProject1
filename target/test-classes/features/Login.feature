# This is my first feature file
Feature: Testing rediff myPage

  Background: 
    Given I open the browser and enter URL
    Then I capture the title of the Page
    Then I enter username and password
    Then I click on login button
  
  @register
  Scenario: User has to test if login on rediff is successfull or not
    And I should see an Error message
    Then I click on Click Here link
    And I close the browser

  @register
  Scenario: 
    Then I click on Create a Rediffmail account
    Then I capture the title of the Page
    And I close the browser
