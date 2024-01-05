Feature: User registration
  As a new user
  I want to register to the application
  So that I can access my account to shop

  Scenario: Successful Registration
    Given I am on the automation-zone shopping page
    And I am a new user registered
      | username          | email                       | password       |
      | Testuser30Dec2023 | Testuser30Dec2023@gmail.com | Password@123#$ |
    And i logout from the application

