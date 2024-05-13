Feature: DataTable Functionality

  Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login successfully

  Scenario Outline:Fee Functionality and Delete
    And Click on the Element in LeftNav
      | setup      |
      | parameters |
      | fees       |

    And Click on the Element Dialog
      | addButton |

    And User sending the keys in Dialog
      | nameInput       | <name>     |
      | codeInput       | <code>     |
      | integrationCode | <intCode>  |
      | priorityCode    | <priority> |

    And Click on the Element Dialog
      | toggleBar  |
      | saveButton |

    Then Success message should be displayed

    And User delete the Element from Dialog
      | <name> |

    Then Success message should be displayed
    Examples:
      | name   | code    | intCode | priority |
      | jkluo1 | 1599511 | PayPal  | 2588521  |
      | jkluo2 | 1599512 | Cash  | 2588522  |
      | jkluo3 | 1599513 | PayPal  | 2588523  |
      | jkluo4 | 1599514 | PayPal  | 2588524  |
      | jkluo5 | 1599515 | PayPal  | 2588525  |