Feature: Login to eCommerce application and place order 

Scenario: Login to an application and search for product
Given User is on Home page
When User will signin to application with usermame "ashwinir35108@gmail.com" and password "Ready25fight$"
And search for product <productName>
Then user will place order  

Examples:
 | productName |
 | bluetooth   |
 | mobile      |
