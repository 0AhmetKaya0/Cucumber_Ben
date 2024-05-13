Feature: Datable Örnek

  Scenario: Users List
    When write username "ismet"
    And write username and password "ismet" and "1234"

    And  write username as DataTable
    |ismet |
    |mehmet |
    |ayse |
    |fatma |
    |ulvi |
    |esma |

    And write username and password as DataTable
      |ismet |1234|
      |mehmet |2332|
      |ayse |456465|
      |fatma |99999|
      |ulvi |77777 |
      |esma |54321 |
