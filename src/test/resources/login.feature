Feature: Open webpage to login

@TC01
Scenario Outline: TC1 Enter in to page with 

Given Tc1 open the browser2
When TC1 enter user <username> and <password>
And TC1 user click login button2
Then TC1 user verify

Examples:
|username|password|
|standard_user | secret_sauce|

@TC02
Scenario Outline: TC2 short low to high 
Given TC02 open the browser2
When TC02 enter user <username1> and <password1> and login
And  TC02 Select short order price low to high
Then TC02 Click logout

Examples:
|username1|password1|
|standard_user | secret_sauce|