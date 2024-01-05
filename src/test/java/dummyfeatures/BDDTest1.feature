Feature: User Authentication
  As a user
  I want to be able to authenticate myself
  So that I can access my account


  Scenario:Successful login
    Given a registered user with user id "Testuser2" and password "Testpassword123"
    When the user enters the credentials and click on submit button
    Then the system should authenticate the user "Testuser2"
    Scenario Outline: login with different credentials
      Given iam registered user with user id "<username>" and password "<password>"
      Examples:
        | username   | password      |
        | tester123  | password@123  |
        | tester1234 | password@1234 |

    Scenario: Test using data Table
      Given the user enters data table crades
          | datatable user1 | password@123  |
          | datatable user2 | password@1234 |
    Scenario: Test using map
      Given the user enters the creds
        | username   | password      |
        | tester123  | password@123  |
        | tester1234 | password@1234 |
    Scenario: Test using json
      Given iam using jsondata
           """
            {
    "Users":[
        {"name":"john",
         "age ":"25"
        },
        {"name":"peter",
         "age":"30"
        },
        {"name":"balu",
         "age":"35"
        }
    ]
}
"""

















