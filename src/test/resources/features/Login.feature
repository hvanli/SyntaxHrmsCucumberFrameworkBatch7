@login @spring2
Feature: Login

  Background: 
    Given I open browser and navigate to SyntaxHRMS #precondition

  @smoke
  Scenario: Validate positive login functionality
    When I enter username
    And I enter password
    And I click on Login button
    Then I successfully login SyntaxHRM

  #@regression
  #Scenario Outline: Validate Error Messages with Negative Login
    #When I enter "<username>"
    #And I enter "<password>"
    #And I click on Login button
    #Then I verify the "<errMsg>" in step
#
    #Examples: 
      #| username | password    | errMsg                       |
      #| admin    | Hum@nhrm12  | Csrf token validation failed |
      #| admi     | Hum@nhrm123 | Invalid credentials          |
      #| admi     | Hum@nhrm12  | Invalid credentials          |
