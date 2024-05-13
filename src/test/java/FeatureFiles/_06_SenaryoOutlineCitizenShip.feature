Feature: Citizenship Functionality
  Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login successfully
    And  Navigate to Citizenships

  Scenario Outline: Login in citizenships


    When  Create a name as "<name>" as "<shortname>"
    Then  Success message should be displayed

    When  Create a name as "<name>" as "<shortname>"
    Then Already exist message should be displayed

    When user delete name as "<name>"
    Then Success message should be displayed
    Examples:
      |name |shortname  |
      |üğp123  |üğp1a  |
      |üğp1123  |üğp1a  |
      |üğp121 |üğp1a  |
      |üğp1321 |üğp1a  |
      |üğp132145 |üğp1a  |