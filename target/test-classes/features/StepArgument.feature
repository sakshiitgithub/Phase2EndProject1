Feature: Enter login Credentials on tutorialsNinja page

  Scenario Outline: Test username and password for Login Page
    Given I am on tutorialsNinja HomePage
    Then I click on my account link
    When I click on login link
    Then I will be on login page and I capture the title of the page
    And I enter email id as '<EmailID>' on the page
    And i enter password as '<Password>' on the page
    Then I click login button

    Examples: 
      | EmailID                | Password |
      | seleniumdemo@gmail.com |   123456 |
