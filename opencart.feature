#Author: Roshani patil
#Project: Opencart
#Date: 17 may 2024
Feature: To check the functionality of login page

  Scenario: To check the functionality of Login page with valid credentials
    Given user is on login page
    And user click on menubar and login from menubar
    When user enters username and password
    And user click on login button
    And userclick on home button
    And user clicks on add to cart and click on add to cart button to select product
    Then user will navigate to Home page
    And exit
