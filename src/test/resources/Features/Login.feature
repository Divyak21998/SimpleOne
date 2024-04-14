Feature: Application login

Background: preqresities steps
Given setup the entries in the database
When lunch the browser from config variables
And hit the home page url of banking site

@Regressiontest
Scenario: User succesfull login with valid credentials
Given user landing to apllication
When user enter "divya" and 1234 into text field
And user click on Login Button
Then loginmessage should be displayed and user should be redirect to home page

@smoketest
Scenario Outline: Application succesfull login with valid credentials
Given user landing to apllication
When user enter <username> and <password> into text field
And user click on Login Button
Then loginmessage should be displayed and user should be redirect to home page
 
Examples:
   | username | password |
   | shushma | 786666 |
   | kavya | 76878 |
   | navya | 56665 |
 
