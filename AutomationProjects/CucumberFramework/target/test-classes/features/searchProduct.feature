Feature: Search and place the order for products

	Scenario: Product search in both home and offers page
		Given User is on Home page
		When user searches for "tom" and extracted actual name of product
		Then user searches for same name in offers page to check if product exists
		And Validate the itemName in offersPage matches with HomePage