#Senaryo :
#Inventory Bölümündeki
#Item Categories Çalışmasını test ediniz
#girişi yapıp , sonrasında silmesini yapınız
Feature: Inventory Functionality

  Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login successfully

  Scenario Outline: Inventory add ıtem
    And Click on the Element in LeftNav
      | inventory      |
      | setupInventory |
      | inventoryCat   |

    And Click on the Element in Dialog
      | addButton |

    And User sending the keys in Dialog
      | nameInput | <name> |

    And Click on the Element in Dialog
      | userType |
      | <type>   |
    And Click on the Element Dialog
      | saveButton |

    Then Success message should be displayed

    And User delete the Element from Dialog
      | <name> |

    Then Success message should be displayed
    Examples:
      | name    | type          |
      | dsa     | student       |
      | dsa465d | administrator |
      | gadgda  | student       |
      | dsadsa  | student       |