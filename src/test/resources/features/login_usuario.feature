@Login
Feature: login in the site web of bank
		 As a user
		 I Want entry to site web of bank with my user and password

	@LG_01
	Scenario: Login in the site web with valid username and password
	Given i am in the main page of bank
	When entry user and password valids
	Then entry in the home page of bank
	
	@LG_02
	Scenario: Login in the site web with username valid and password invalid
	Given i am in the main page of bank
	When entry user valid and password invalid
	Then show a message of error
	
  @LG_03
	Scenario: Login in the site web with username and password empty
	Given i am in the main page of bank
	When username and password is empty
	Then show a message of error
	
	