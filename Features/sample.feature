Feature: This is just a test feature for cucumber

Scenario: User searches an item in google and check if the title matches the keyword
	Given I navigate to google homepage
	When I enter keyword to search
	And I click on search button
	Then I should be able to see the title contains the keyword
	
	