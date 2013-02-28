<h1>Section 4 Project 2</h1>

<h2>Overview</h2>

In the previous activity, we created a basic user interface - a ```JFrame```. Now it's time to take the next step and render a grid of squares on the UI. In this activity we will render a 6x6 grid of squares. We will also give a title to the game.

On the unit testing front, you might have noticed we already have two test classes - ```SquareTest``` and ```BoardTest```. Till now we have been running both individually. Running test cases individually does not seem like a good idea, especially when we will have a large number of test cases. In this section we are going to add one more unit test class - ```UITest```, and in a few more exercises, we may have even more unit tests. We need to do something which will let us run all the tests at once.

JUnit gives us the concept of a test suite, which can be composed of multiple tests. When a test suite is run, all the tests which belong to it, will also be run. We have created a class called ```AllTests``` which is composed of all the test classes we have created till now. Running ```AllTests``` will cause all the tests specified with the ```@SuiteClasses``` annotation, to be run.

<h2>Steps For This Project</h2>
 1. You will notice there is a compile error in ```UI.java```. First fix that error.
 1. Run ```AllTests``` as a unit test and ensure that 26 tests are run, and 1 test fails. The failing test is ```testSquares```.
 1. We have implemented a constructor in the ```UI``` class. Part of this constructor still needs to be implemented. Follow the guidelines specified by TODO's in the constructor to complete it's implementation.
 1. Run ```UITests``` and verify that out of 7 tests, 6 tests pass and only 1 test - ```testSquares``` fails.
 1. Implement the ```layoutSquares()``` method as described in TODO's in the code.
 1. Run ```UITests``` and verify that all 7 tests pass.
 1. Run ```AllTests``` and ensure that all the 26 tests pass. 

<h2>Questions to ponder</h2>
 1. What access modifier will you choose for the new method you create in this activity ?
 1. What is so special about AllTests that makes it a test suite ?
 1. What exactly are annotations ?

<h2>Learning Outcomes</h2>
 1. Understanding of what is a test suite and how to run it in JUnit.
 1. Understanding of how to create a new method in Java.
 1. Understanding of which access modifier should be chosen for a new method.
