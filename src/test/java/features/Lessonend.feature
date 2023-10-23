@all
Feature: Testing on Amazon Application

  Background: 
    Given I am on Amazon HomePage

  @application
  Scenario Outline: SignIn Page
    Then I hover on Signin Accounts and List
    And I enter email id like '<EmailId' on the page
    And I closed the browser

    Examples: 
      | EmailId                         |
      | agrawal.sakshi1102000@gmail.com |

  @application
  Scenario: Mobile Search Page
    Then I enter input on the search bar
    Then I submit the searched item
    And I choose the item from the wishlist
    Then I click on wishlist button
    And I closed the browser

  @course
  Scenario: Mobile Page
    Then I click on the link Mobiles
    Then I move the mouse to the element
    Then I click on the mobile brand Apple
    Then I click on the Apple phone link
    Then I switch to the new tab window
    Then I click on the addtocart button
    And I closed the browser
