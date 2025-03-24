# Bill's Burger Challenge
Burger restaurant program in Java to practice and display OOP programming, inheritance, composition, and polymorphism.
This is part of a Udemy course on Java that I am doing.

## Challenge:
Write an application for a food restaurant.

Bill runs a fast-food hamburger restaurant and sells hamburger meals.
His meals are composed of three items, the hamburger, the drink, and the side item.

I need to write an application that lets Bill select the type of burgers and some of the additional
items or extras that can be added to the burgers, as well as the actual pricing.

```
Need a meal order
    -This should be composed of exactly one burger, one drink, and one side item.
    -The most common meal order should be created without any arguments, like a regular burger, a small coke and fries, for example.
    -You should be able to create other meal orders by specifying different burgers, drinks, and side items.

Need a drink and side item
    -The drink should have at least a type, size, and price, and the price of the drink should change for each size.
    -The side item need at least a type and price

Need burgers
    -Every hamburger should have a burger type, a base price, and up to a maximum of three extra toppings.
    -The constructor should include only the burger type and price.
    -Extra Toppings on a burger need to be added somehow and priced according to their type.

Deluxe burger bonus
    -Create a deluxe burger meal with a deluxe burger that has a set price, so that any additional toppings do not change the price.
    -The deluxe burger should have room for an additional two toppings.

Main method
    -Create a default meal that uses the no arguments constructor.
    -Create a meal with a burger and the drink and side item of your choice, with up to 3 extra toppings.
    -Create a meal with a deluxe burger where all items, drink, side item, and up to 5 extra toppings are included in the burger price.


Each meal order functions
    -Add some additional toppings to the burger
    -Change drink size
    -Print the itemized list. This should include the price of the burger, any extra toppings, the drink price based on size, and the side item price.
    -Print the total due amount of the meal.
```