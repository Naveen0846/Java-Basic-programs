# Java-Basic-programs

Java Clean code must be followed before you write any program
Clean code:
clean code can be summarized as a code that any developer can read and change easily
Clean coding principles help us achieve a lot of desirable goals related to the software:
1)Maintainable Codebase: 
   Any software that we develop has a productive life and during this period will require changes and general maintenance. 
Clean code can help develop software that is easy to change and maintain over time.
2)Easier Troubleshooting: 
   Software can exhibit unintended behavior due to a variety of internal or external factors. 
It may often require a quick turnaround in terms of fixes and availability. 
Software developed with clean coding principles is easier to troubleshoot for problems
3)Faster Onboarding:
   Software during its lifetime will see many developers create, update, and maintain it, with developers joining at different points in time. 
This requires a quicker onboarding to keep productivity high, and clean code helps achieve this goal.


Clean Coding in Java:
1)Project Structure -
While Java doesn't enforce any project structure, it's always useful to follow a consistent pattern to organize our source files, tests, configurations, data, and other code artifacts.

2)Naming Convention: 
naming conventions can go a long way in making our code readable and hence, maintainable.

3)Source File Structure -
 Java compiler enforces some structure, a large part is fluid. 
 
Let's see how should a typical ordering of elements in a source file look:

Package statement
Import statements
All static imports
All non-static imports
Exactly one top-level class
Class variables
Instance variables
Constructors
Methods

 methods can be grouped based on their functionality or scope. 
 
4) Whitespaces -

5) Indentation -a well-indented code is much easier to read and understand

6)Method Parameters -  a long list of parameters can make it difficult for someone to read and understand the code

7) Hardcoding -it can lead to duplication, which makes change more difficult.

8) Code Comments -Code comments can be beneficial while reading code to understand the non-trivial aspects. 

9) Logging -The importance of logs can not be over-emphasized in development in general and maintenance in particular.


* SOLID Principles *
1)Single Responsibility Principle: Every interface, class, or method we define should have a clearly defined goal. 
In essence, it should ideally do one thing and do that well. This effectively leads to smaller methods and classes which are also testable.

2)Open-Closed Principle: The code that we write should ideally be open for extension but closed for modification. 
 this effectively means is that a class should be written in a manner that there should not be any need to modify it.
 However, it should allow for changes through inheritance or composition.
 
3)Liskov Substitution Principle: this principle states is that every subclass or derived class should be substitutable for their parent or base class. 
This helps in reducing coupling in the codebase and hence improve reusability across.

4)Interface Segregation Principle: Implementing an interface is a way to provide a specific behavior to our class. a class must not need to implement methods that it does not require. 

5)ependency Inversion Principle: According to this principle, classes should only depend on abstractions and not on their concrete implementations.
 This effectively means that a class should not be responsible for creating instances for their dependencies. Rather, such dependencies should be injected into the class.
 
 
 
 *****************************************************************************************************************
 
 Coding principles to be followed before writing any code and while coding in java :
 1)class -object style
 following the class/object model or style will make the program clear with OOP's concepts and acheieving the code reaadability and reusablity 
 
 2)package,Superclass,Class,Subclass
 In java for clean coding and source structure we follow the package and import statements which make more efficient in utilizing Superclass,subclass 
 and avoid naming clashes , easier access control on the code
 
 3)forensics of code java :
   a set of rules can be used to understand the code when we are new to the code, we can understand and represent code diagramatically 
   
The process is quite straightforward.

1. Query your bug tracking tool for all the issues that required a code fix.
2. Assess the defects.
3. Identify the code.
4. Get the root cause.

helps us in solving the bugs and reduces time for project development

4)Data flow program:
Dataflow programming (DFP) is a programming paradigm where program execution is conceptualized as data flowing through a series of operations or transformations.
the sequence in which the data is triggered
(creating the objects, static/instance variables and their object creation will trigger in sequence )
 
