Feature: Application Login
	Scenario: Home Page Login
		Given user is on Landing Page
		When user Login to the applicaiton by entering valid "test1" and "1234" password
		Then Home page is displayed
		And username is displayed
		
			Scenario: Home Page Login
		Given user is on Landing Page
		When user Login to the applicaiton by entering valid "test2" and "4321" password
		Then Home page is displayed
		And username is not displayed