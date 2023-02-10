Feature: to check the fight ticket booking is working fine

Scenario: Place bulk order
Given Login to the swap app
When Select the item's
|item name                 |
|Sauce Labs Backpack       |
And Enter the address 
|firstname |lastname| address                                                 |
|Tom       | Hardy  | 1-2, Wharton Street Industrial Estate, Birmingham B7 5TR|
And Place the order 
Then Order should be placed successfully 

Scenario: Cancel the order
Given Login to the swap app
When Select the item's
|item name|
|Sauce Labs Bolt T-Shirt|
|Sauce Labs Fleece Jacket|
And Enter the address 
|firstname| lastname| dress                              |
|Tom      |Hardy    | 1-2, Wharton Street Industrial Estate, Birmingham B7 5TR|
And Cancel the order 
Then Order should be canceled 


Scenario: Update the placed order 
Given login to the swap app
When select the item's
|item name|
|Sauce Labs Backpack|
|Sauce Labs Bike Light|
|Sauce Labs Bolt T-Shirt|
|Sauce Labs Fleece Jacket|
And Remove the item's
|item name|
|Sauce Labs Bolt T-Shirt|
|Sauce Labs Fleece Jacket|
Then item's should be removed 


