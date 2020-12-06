Meta:

Narrative:
As user
I want to operate two numbers
So that I can have the result of the operation

Scenario: A user can submit a number to adder and get current sum
Given a base number, for exemple 6
When I submit another number, for exemple 6
Then I get the sum of the numbers

Scenario: A user can submit a number to adder and get current sum (on floats)
Given a base number, for exemple 6.42
When I submit another number, for exemple 6.31
Then I get the sum of the numbers

Scenario: A user can submit a number to adder and get current substraction
Given a base number, for exemple 6
When I submit another number, for exemple 6
Then I get the substraction of the numbers

Scenario: A user can submit a number to adder and get current substraction (on floats)
Given a base number, for exemple 6.42
When I submit another number, for exemple 6.31
Then I get the substraction of the numbers

Scenario: A user can submit a number to adder and get current substraction (negative result)
Given a base number, for exemple 6
When I submit another number, for exemple 12
Then I get the substraction of the numbers

Scenario: A user can submit a number to adder and get current timed result
Given a base number, for exemple 6
When I submit another number, for exemple 6
Then I get the timed result of the numbers

Scenario: A user can submit a number to adder and get current timed result (on floats)
Given a base number, for exemple 6.42
When I submit another number, for exemple 6.31
Then I get the timed result of the numbers

Scenario: A user can submit a number to adder and get current division
Given a base number, for exemple 6
When I submit another number, for exemple 6
Then I get the division of the numbers

Scenario: A user can submit a number to adder and get current division (on floats)
Given a base number, for exemple 6.42
When I submit another number, for exemple 6.31
Then I get the division of the numbers
