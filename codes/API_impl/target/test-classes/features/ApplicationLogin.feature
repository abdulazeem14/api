Feature: FaceBook Login
	Scenario: Home Page Login
		Given Initialize the browser with chrome
		And Navigate to "facebook.com" site
		And Click on  Log In  to Existing Account
		When User enters "Email" and "Password" and LogIn
		Then verify the Title of webPage 
		Then Close the Browser
		
