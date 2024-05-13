Feature: DataTable Functionality

  Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login successfully

  Scenario: Create Country
    And Click on the Element in LeftNav
      | setup      |
      | parameters |
      | countries  |

    And Click on the Element in Dialog
      | addButton |

    And User sending the keys in Dialog
      | nameInput | fghjnm123 |
      | codeInput | fgkl4789    |

    And Click on the Element in Dialog
      | saveButton |

    Then Success message should be displayed

#    And User delete the Element from Dialog
#      | ismetUlk188 |

    Then Success message should be displayed


  Scenario: CitizenShip Create
    And Click on the Element in LeftNav
    |setup|
    |parameters|
    |citizenship|

    And Click on the Element Dialog
    |addButton|

    And User sending the keys in Dialog
    |nameInput|isimbu12345|
    |shortName|ism12345|

    And Click on the Element Dialog
    |saveButton|

    Then Success message should be displayed

    And User delete the Element from Dialog
    |isimbu12345|

  Scenario: Create Nationality and Delete

    And Click on the Element in LeftNav
      |setup|
      |parameters|
      |nationalities|

    And Click on the Element Dialog
    |addButton|

    And User sending the keys in Dialog
    |nameInput|benimUlkem36|

    And Click on the Element Dialog
    |saveButton|
    Then Success message should be displayed

    And User delete the Element from Dialog
    |benimUlkem36|

  Scenario:Fee Functionality and Delete
    And Click on the Element in LeftNav
    |setup|
    |parameters|
    |fees      |

    And Click on the Element Dialog
    |addButton|

    And User sending the keys in Dialog
    |nameInput|ahmetfee|
    |codeInput|456|
    |integrationCode|123111|
    |priorityCode|987456|

    And Click on the Element Dialog
    |toggleBar|
    |saveButton|

    Then Success message should be displayed

    And User delete the Element from Dialog
    |ahmetfee|

    Then Success message should be displayed






