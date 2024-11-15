Feature: Open webpage to login

Scenario Outline: TC1 Enter in to page with 

Given Tc1 open the browser2
When TC1 enter user <username> and <password>
And TC1 user click login button2
Then TC1 user verify

Examples:
|username|password|
|standard_user | secret_sauce|