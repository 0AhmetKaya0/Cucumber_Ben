#Senaryo
#CitizenShip sayfasına gidiniz.
#Create işlemini parameter yöntemi ile doğrulayınız.
#Daha sonra aynı bilgilerle tekrar Create yapılamadığını doğrulayınız. (negatif test)
  # Ayrı senaryoda girilen bilgiyi silme işlemini doğrulayınız

Feature: Citizenship Functionality
  Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login successfully
    And  Navigate to Citizenships

    @Regression
  Scenario: Login in citizenships

    When  Create a name as "asd1234567" as "415634155"
    Then  Success message should be displayed


  Scenario: Login in citizenships Negative
    When  Create a name as "asd1234567" as "4156341557"
    Then Already exist message should be displayed


  Scenario: Delete Citizenship
    When user delete name as "asd1234567"
    Then Success message should be displayed
