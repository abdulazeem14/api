Feature: QTRecognition App Login
	Scenario Outline: Home Page Login
		Given Initialize the browser with chrome
		And Navigate to "https://qtrecognition.testqtwiz.com" site
		When User enters <username> and <password> and LogIn
		Then verify the Title of webPage 
		Then Close the Browser
		
Examples:
|username							|password		|
|azeem.hameed@qualitestgroup.com	|P@ssw0rd		|
		
