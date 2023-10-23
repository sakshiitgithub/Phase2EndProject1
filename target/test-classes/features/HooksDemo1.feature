@all
Feature: Testing on NinjaDemo application

Background:
Given I am on tutorialsNinja HomePage

@regression
Scenario: Search
Then I enter Input for the search box
And I click on search button
And I close browser

@regression
Scenario: Cart
And I click on Add to Cart button
And I close browser

@db
Scenario: Checkout
And I click on Checkout button
And I close browser

