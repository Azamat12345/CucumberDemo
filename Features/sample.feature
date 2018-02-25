Feature: This is just a test feature for cucumber

	
Scenario Outline: User searches an item in google and check if the title matches the keyword
	Given I navigate to google homepage
	When I enter <keyword> to search
	When I click on search button
	And I should be able to see the title contains the <keyword>
	
	Examples:
	|keyword|
	|"porsche"|
	|"Toyota"|
	|"Mercedes-Benz"|
	|"Ferrari"|
	