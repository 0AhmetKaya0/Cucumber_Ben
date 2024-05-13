#Senaryo
  #Citizenships sayfasına gidiniz
  # 1 adet Citizenships kaydı yapılabilidğini doğrulayınız

  Feature:

    @SmokeTest
    Scenario: Login in citizenships

      Given Navigate to Campus
      When Enter username and password and click login button
      Then User should login successfully
      And  Navigate to Citizenships
      When  Create a Citizenships
      Then  Success message should be displayed