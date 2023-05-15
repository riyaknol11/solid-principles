# solid-principles

Question 1.
Explanation : The Single Responsibility Principle (SRP) can be applied to the given scenario. 
The SRP states that a class should have only a single responsibility or purpose.
In the given example, the 'FinalExam' class has multiple responsibilities such as adding questions, providing expected answers, and managing marks distribution.
We should separate these responsibilities into different classes following the prinicple of single responsibility.

Question 2.
Expanation :
Open-Closed Principle (OCP) can be applied to resolve the given scenario.
The OCP states that classes should be open for extension but closed for modification, which explains that we should be able to add new functionality or behavior to a class without modifying its existing code.


Question 3.
Explanation :
To implement the Liskov Substitution Principle (LSP) in the given code, we need to ensure that the subclass (Square) can be substituted for its superclass (Rectangle) without altering the integrity of the program. 
To implement the LSP here, both Rectangle and Square are made to inherit from the common abstract class 'Shape'. Both the subclasses overrides the setWidth() and setHeight() methods according to its specific behavior. The Shape class defines setter method for setting the width and height for the specific subclasses that inherits it.


Question 4.
Explanation :
Interface Segregation Principle (ISP) principle states that interfaces should be segregated into smaller, more specific interfaces, rather than having a single large interface holding multiple responsibilties.
In the given code, the Vehicle interface has multiple methods including openDoors() and the Bike class, which implements the Vehicle interface, cannot implement the openDoors() method because bikes do not have doors. This leads to the violation of the the Interface Segregation Principle because the Bike class iwill have to implement openDoors() method that is not relevant to it.
Solution : Possible solution to this is to segregate the interfaces based on the related functionality.


Question 5
Explanation : 
Dependency Inversion Principle promotes loose coupling and allows for easier changes and substitutions of dependencies.
Solution : In the given code, we can segregrate the Keyboard and Monitor interfaces and abstract the dependencies. The WindowsMachine class will then depend on these interfaces instead of the concrete implementations(instances of Keyboard and Monitor).
