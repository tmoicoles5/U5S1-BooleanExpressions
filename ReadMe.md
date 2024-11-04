# U4S1 Boolean Expressions

* Part A - Foundations 5.1
* Part B - Foundations Practice
* Part C - Algorithm Challenge

## Part A

### Exercise 01

#### Step 01

In the package `labs.partA.ex01` look at the file `ChkOddEven`

#### Step 02

* Modify the `ChkOddEven` to implement the following:
  * Input a number between 1 and 10
  * Use if statements
  * Test whether a number is odd or even
  * The program should generate the following output:
   
  ```
  −Enter a number: 7
  −The num is odd 7

### Exercise 02

#### Step 01

In the package `labs.partA.ex02` look at the file `AgeCheck`

#### Step 02

* Examine `AgeCheck`:
    * The program has a logic problem
    * For some values, it prints the wrong answer
    * Find the problems and fix them. (You may need to run the
      program a few times and try different values to see which
      ones fail)
    * Replace the two if statements with an if/else statement
    * Change the age to 12 and run your program 

Your program is working correctly, if when run, the following is the output:
```
I'm not old enough yet... :*(
```
  
### Exercise 03

#### Step 01

In the package `labs.partA.ex03` look at the file `ShoppingCart`

#### Step 02

* Examine `ShoppingCart`:
    * Use an if/else statement to implement the following:
      * Declare and initialize a boolean variable, outOfStock
      * If quantity > 1, change the message variable to indicate plural
      * If an item is out of stock, inform the user that the item is
      unavailable, else print the message and the total
      
Your program is working correctly, if when run, the following is the output:
```
Mary Smith wants to purchase 2 Shirts
Total cost with tax: 45.7392
```
      
## Part B

### Exercise 01

#### Step 01

In the package `partB.ex01` look at the file `BooleanDemoExample` and write comments for each line of code. When complete review with instructor.

#### Step 02

In the package `partB.ex01` complete the `TempCheck` per the following:

Create a program that takes in an expected user input as an integer.

The program should compare that input and based on the result of the comparison, print out a statement:

* If input is less than or equal to 45 - "It's cold - putting on a coat!"
* If input is greater than or equal to 46 and less than or equal to 65 - "It's not bad out - a hoodie will do just fine!"
* Any other situation, - "It's hot - a T shirt will be perfect."

Your program is working correctly, if when run, the following is the output (Abe first name Lincoln last name):

```
Enter a number from 0 to 100
66
It's hot - a T shirt will be perfect.
```

> Use BooleanDemoExample for reference.

### Exercise 02

#### Step 01

In the package `partB.ex02` look at the file `EqualityStringExample` and write comments for each line of code. When complete review with instructor.

#### Step 02

In the package `partB.ex02` complete the `EqualityOperator` per the following:

    Create a program that compares two variables (4 and 5) and returns if they're equal to each other - true of false

Your program is working correctly, if when run, the following is the output:

```
Are 4 and 4 equal? true
Are 4 and 5 equal? false
```

> Use EqualityStringExample for reference.


### Exercise 03

#### Step 01

In the package `partB.ex03` look at the file `EqualityTestExample` and write comments for each line of code. When complete review with instructor.

#### Step 02

In the package `partB.ex03` complete the `IfElseNameCheck` per the following:

* Create a program that asks the user for their first name and stores it.
* Check the name the user input against Elvis - if it Elvis, print out "You are the king of rock and roll"
* After checking the name, if the user's name is anything aside from Elvis - "You are not the king"

Your program is working correctly, if when run, the following is the output:

```
Enter your name:
Elvis
You are the king of rock and roll
```

> Use EqualityTestExample for reference.

### Exercise 04

#### Step 01

In the package `partB.ex04` look at the file `IfDemo` and write comments for each line of code. When complete review with instructor.

#### Step 02

In the package `partB.ex04` complete the `IfElseDemo` per the following:

* Create a program that takes a user input as a number
* Check the number, if it is equal to 7, the program should print to the user "That's lucky!"
* If after checking the number, and it is not equal to 7, print to the user "That's unlucky!"

Your program is working correctly, if when run, the following is the output:

```
Enter a number:
5
That's unlucky!
```

> Use IfDemo for reference.


## Part C

### Problem 01
Your local rapper is looking to create his next hook for his next track. He wants to add phrases that begin with "mix".
But he decides he wants to take it a step further and accept any phrase except the "m" can be any letter or number.
He needs your help to make sure the list of given phrases begin with what was asked.

Return true if the given phrase begins with "mix", or any beginning letter or number following "ix"

Example:
```java
startWithIx("mix snacks") --> true
startWithIx("pix snacks") --> true
startWithIx("piz snacks") --> false
```

### Problem 02
Provide two numbers, evaluate both numbers to see which one is nearest to the value 10.
Some numbers may have the same range in how near they are to 10; such as 13 and 7 both are 3 from 10;
In that case, we would consider that event a tie.

Tip: Math.abs(n) returns the absolute value of a number

Return whichever number is nearest to 10, or return 0 for the event of a tie.

Example:
```java
near10(8, 13) --> 8
near10(13, 8) --> 8
near10(13, 7) --> 0
```