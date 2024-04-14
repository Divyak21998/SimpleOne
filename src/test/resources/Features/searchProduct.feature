Feature:Search and place the order for product
Scenario: Search Experience for product search in both home and offers page
Given User is on Green Cart Landing page
When User Searched with Shortname "Tom" and extracted actual name of product
Then User searched for same Shortname in offers page to check if product exist
