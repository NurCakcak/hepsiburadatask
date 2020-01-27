Feature: hepsiburada Homepage
This feature verifies the login functionality on hepsiburada Homepage
 
Scenario: Check that user can successfully log in
Given I launch Chrome browser
When I open hepsiburada Homepage
And I wait for "1" seconds
Then I fill name "email" as "hapsiburada@yahoo.com"
Then I fill password "password" as "As12df34g5"
And I wait for "1" seconds
Then I click Log in
And I wait for "1" seconds 
Then I click search
Then I search book "productSearch" as "Java10"
And I wait for "1" seconds 
Then I go to basket
Then I finish shoping
And I wait for "1" seconds
Then I continue to pay
Then I select info
And I wait for "1" seconds
Then I select havale