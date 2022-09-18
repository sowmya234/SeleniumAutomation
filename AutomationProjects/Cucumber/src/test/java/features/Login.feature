#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
Feature: Application login

Background:
Given validate the browser
When Browser is triggered
Then check if browser is started

@RegTest
  Scenario: Home page login
    Given User is on Myntra login page
    When User login to application with username and password
    Then Home page is populated
    And Items displayed is "true"
@SmokeTest   
  Scenario: Home page login credentials1
    Given User is on Myntra login page
    When User login to application with "jin" and "password123"
    Then Home page is populated
    And Items displayed is "false"
@SanityTest       
  Scenario: Home page login credentials1
    Given User is on Myntra login page
    When User login to application with following values
    |Jungkook Jeon|123456|25|pdrl|
    Then Home page is populated
    And Items displayed is "false"
@SmokeTest       
  Scenario Outline: Home page login testcase
  	Given User is on Myntra login page
  	When User login to application using <username> and <password>
  	Then Home page is populated
  	And Items displayed is "true"
  Examples:
  	|username|password|
  	|user1|Pass1|
  	|user2|Pass2|
  	|user3|Pass3|
  	|user4|Pass4|
  	  
