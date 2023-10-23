Feature: Create account on wiki page

Scenario: User creates account on wiki page using input from cucumber data table
Given User is on Create Account Page
Then User enters following details
| admin | admin@123 | admin@123 | admin@gmail.com |
| kavita | kavita@123 | kavita@123 | kavita@gmail.com |
| toshi | toshi@123 | toshi@123 | toshi@gmail.com |
| zeba | zeba@123 | zeba@123 | zeba@gmail.com |
| soumya | soumya@123 | soumya@123 | soumya@gmail.com |
Then Account creation is successfull


Scenario: User creates account on wiki page using input from cucumber data table
Given User is on Create Account Page
Then User enters following details using column name
| Username | Password | Retype Password | EmailID |
| admin | admin@123 | admin@123 | admin@gmail.com |
| kavita | kavita@123 | kavita@123 | kavita@gmail.com |
| toshi | toshi@123 | toshi@123 | toshi@gmail.com |
| zeba | zeba@123 | zeba@123 | zeba@gmail.com |
| soumya | soumya@123 | soumya@123 | soumya@gmail.com |
Then Account creation is successfull