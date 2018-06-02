Feature: LogIn Action Test 

Scenario: Login Adactin 
	Given User is on home page 
	When User enters credentials and click login button 
		|Abuthaheer|test123|
		|test123|12345|
	Then User should able to login successfully 
	
Scenario Outline: Successful Login with Valid Credentials 
	Given User is on home page 
	When User enters "<userName>","<password>" and click the login  button 
	Then User should able to login successfully 
	
	Examples: 
		|userName|password|
		|Abuthaheer|test123|
		
		
Scenario: Successful Login with Valid Credentials 
	Given User is on home page 
	When User enters "Abuthaheer" and "test123" and click the login  button 
	Then User should able to login successfully 
