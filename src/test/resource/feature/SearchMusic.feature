Feature: To check the youtube search functionality 

Scenario Outline: search by title
Given user on dashboard
When search by title "<title song>"
Then there will be search result

Examples:
         |title song      |
         |Remember my name|
         |On my ways      |
         |Lonely          |
