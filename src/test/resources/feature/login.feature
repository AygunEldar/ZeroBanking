Feature: Online Banking LoginFeature

    Background: user login
    Given the user is on the login page

  Scenario: Authorized users should be able to login to the application

     And user logins with username "username" and "password "
    Then  the "Account summary" page should be displayed
    Then the user enters credentials and logs in

  @wip
    Scenario: Unauthorized users should NOT be able to login

    When user logins with username "wrong" and password "wrong"
    Then error message login and/or password are wrong. should be displayed
    When user logins with username "" and password ""
    Then error message login and/or password are wrong. should be displayed



