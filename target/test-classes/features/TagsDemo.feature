@all
Feature: Testing on NinjaDemo application

Background:
Given I am on tutorialsNinja HomePage

@login @smoke
Scenario Outline: Test username and password for Login Page

    Then I click on my account link
    When I click on login link
    Then I will be on login page and I capture the title of the page
    And I enter email id as '<EmailID>' on the page
    And i enter password as '<Password>' on the page
    Then I click login button
    And I close browser

    Examples: 
      | EmailID                | Password |
      | seleniumdemo@gmail.com |   123456 |

@search @regression     
Scenario: 
Then I enter Input for the search box
And I click on search button
And I close browser

@AddtoCart @regression
Scenario:

And I click on Add to Cart button
And I close browser

@checkout @regression
Scenario:

And I click on Checkout button
And I close browser

@logout @smoke
Scenario:

Then I click on my account link
And I click on logout link
And I close browser

