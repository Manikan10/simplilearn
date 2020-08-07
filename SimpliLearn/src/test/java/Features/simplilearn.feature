Feature: Simplilearn Automation using Selenium/Java/Cucumber/Git/Jenkins/by manikandan


Scenario: TC001 - Login page
Given Browse Simplilearn
When Enter username and password
Then Make sure user is logged in

Scenario: TC002 - View Master Program
Given Login to simplilearn
When Click on Master Program tab
And Click on View Program Details
Then Master Program details page is loaded 

Scenario: TC003 - Logout user
Given User is logged in
When Click on Menu
And Select Logout
Then User is logged out