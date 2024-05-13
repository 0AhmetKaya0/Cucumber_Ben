# Nationality menusunun kayıt ve silme özelliğini
#DataTable ile 5 fakrlı değer seti ile çalıştırınız.
Feature: Nationality Functionality

  Scenario Outline:
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login successfully

    And Click on the Element in LeftNav
      | setup         |
      | parameters    |
      | nationalities |

    And Click on the Element Dialog
      | addButton |

    And User sending the keys in Dialog
      | nameInput | <name> |

    And Click on the Element Dialog
      | saveButton |

    Then Success message should be displayed

    And User delete the Element from Dialog
      | <name> |

    Then Success message should be displayed
    Examples:
      | name       |
      | tyu128132  |
      | tyu1231325 |
      | tyu1231327 |
      | tyu1231328 |
      | tyu1239321 |

