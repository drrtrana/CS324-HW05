<h6>
CS-324-2: Introduction to the Design of Algorithms <br>
Spring 2021 <br>
Northeastern Illinois University <br>
Homework #4 <br>
Due Date: 03/10/21 at 9:00 p.m. <br>
Dynamic Programming, Part II
</h6>

#### Getting Started

1. Clone the assignment to your computer.
2. Go to File > Project Structure. Under Project Settings, click on Project and verify that the Project SDK is
set to JDK 11 or higher.  If it is not, select the correct SDK from the drop-down. 
3. Go to File > Settings (Mac: IntelliJ IDEA > Preferences). Under Build, Execution, Deployment and under Build
Tools, click Gradle. Make sure Build and run using: and Run tests using: are set to Gradle. Make sure Use Gradle from:
is set to 'gradle-wrapper.properties' file. And make sure Gradle JVM is set to JDK 11 or higher.
4. Project SDK and Gradle JVM should be set to the same Java version.

#### Submitting your assignment

1. Make sure that all your code is committed to GitHub and that all the code analyzers and unit tests
pass.
2. You will have the opportunity to make corrections on any code that is a complete/valid attempt at 
solving the problem. Code that does not compile or run does not constitute a complete/valid attempt.

#### Running Tests and Code Analyzers

1. To run unit tests: Click the green arrow to the left of each header to run the tests individually or click the 
   green arrow to the left of the class header to run all the tests. If they do not pass, your code is incorrect.
2. To run code analyzers: On the right side of IntelliJ, click Gradle, expand Tasks > other. 
    - Double-click the checkstyleMain task to run it.
    - Double-click on the pmdMain task in the same panel. 
    - If there are errors: You can click the link provided, then choose your browser of choice at the top-right corner to view the 
      error description or in the bottom left panel, click the middle red exclamation point to view the error.
      Fix the issue and rerun checkstyleMain, repeat if necessary.
3. Note that while having all the unit tests and pmd/checkstyle tests is the first step for your code to be
   considered correct, this does not necessarily mean the algorithm is correct.
4. Once unit tests and code analyzers all pass, open GitHub Desktop. You will be able to see the files that 
   have been changed in the left panel. Enter a summary in the bottom left then click "Commit to main". Then click Push 
   Origin in the right panel at the top.
5. If you go to your GitHub account and go to the Actions tab for this assignment repository, you can see the 
   workflow running.

#### Coding Rules

1. Unless specified in the instructions, you may not use any String variables or any String methods.
2. Unless specified in the instructions, you may not use any built-in Array methods.
3. Unless specified in the instructions, you may not import anything from the Java API.
4. Reminder: All code must be your own work.

### Problem 1

1. In the `main/java/problem1` directory, review the file named `Recursion.java`. This file contains a method 
named `method` and a private helper method named `helper`. These methods solve a problem using recursion.
2. In the same directory, create a file named `Dynamic.java`.
    - Create a method named `method` that takes one parameter, an integer array, and returns an integer.
    - Rewrite the code in the `Recursion.java` file to use a dynamic approach instead. 
    - In order to understand how to rewrite the code in `Recursion.java`, you will need to trace through
    the code. You can use the test cases provided in `test/java/problem1/DynamicTest.java` as sample input
    and output.
    - In a comment at the top of your `Dynamic.java` file, list the basic operation and the runtime of the 
    code.
    - Uncomment and run the tests in `test/java/problem1/DynamicTest.java`.
3. Run the code analyzers. 
4. Push your code to GitHub.

### Problem 2

1. In the `main/java/problem2` directory, review the file named `Box.java`. This class represents a box that.
   can hold a particular volume (in cubic feet). You may not modify this class.
2. In the same directory, create a file named `BoxedUp.java`. As you write your code, you can create a `main`
   method or a demo class with the `main` method to help you test and debug your code.
3. Create a static method in this file named `recursiveBoxCombos` that takes a 1D array of `Box` types named 
   `boxTypes` and an integer named `volume` and returns an integer.
    - Each `Box` in the `boxTypes` array has a unique volume that it can hold. The goal is to determine the
      number of ways that the `volume` parameter (think of this as sand) can be distributed among different 
      combinations of the box sizes available in the array, where the order in which you pour the sand into
      the box sizes matters. For example, if the `boxTypes` array has 3 boxes that can hold 1, 3, and 5 cubic 
      feet, and the `volume` parameter is 6 cubic feet, then there are 8 total possible combinations:
        - 1 + 1 + 1 + 1 + 1 + 1 = 6
        - 1 + 1 + 1 + 3 = 6
        - 1 + 1 + 3 + 1 = 6
        - 1 + 3 + 1 + 1 = 6
        - 3 + 1 + 1 + 1 = 6
        - 1 + 5 = 6
        - 5 + 1 = 6
        - 3 + 3 = 6
    - To help you with this, also consider the following:
        - If the `boxTypes` array has 3 boxes that can hold 1, 3, and 5 cubic feet, and the `volume` parameter 
          is 1 cubic foot, then there is 1 possible combination.
        - If the `boxTypes` array has 3 boxes that can hold 1, 3, and 5 cubic feet, and the `volume` parameter
          is 2 cubic feet, then there is 1 possible combination.
    - As the name of the method indicates, this must be a recursive implementation (Hint: Review Lecture 5.1).
      Other than the `boxTypes` array, no other arrays should be used in the solution.
    - You cannot assume that there will only be 3 elements in `boxTypes` array - the example above is just an
      example, but there could be many different box sizes (although all unique).
    - In a comment at the top of the file, give the big-_O_ time complexity of your solution and justify it.
    - Uncomment and run the tests in `test/java/problem2/BoxedUpTest.java` that begin with the word `recursive`.
    - Run the code analyzers and push to GitHub.
4. Create a static method in this file named `dynamicBoxCombos` that takes a 1D array of `Box` types named
   `boxTypes` and an integer named `volume` and returns an integer.
    - You should solve the problem described above using a dynamic programming approach (i.e. no recursion).
    - This problem is directly related to Lecture 5.1.
    - In a comment at the top of the file, give the big-_O_ time complexity of your solution and justify it.
    - Uncomment and run the tests in `test/java/problem2/BoxedUpTest.java` that begin with the word `dynamic`.
    - Run the code analyzers and push to GitHub.
   
### Problem 3

1. In the `main/java` directory, create a package named `problem3`.
2. In this package, create a class named `FloydsAlgorithm`.
3. In the `FloydsAlgorithm` class, create a static method named `floydPaths` that takes a 2D-array of doubles 
   named `weights` and a 2D-array of integers named `paths`, and does not return anything. Implement Floyd's 
   algorithm presented in Lecture 5.2, slide 20. Note that we are using an array of doubles for the weights 
   because the`Double` wrapper class contains a constant for infinity (and the Integer wrapper class does not). 
   You can assume that all of the elements in the `paths` array will be initialized to -1. 
   - Uncomment and run the tests in `test/java/problem3/FloydsAlgorithmTest.java` that begin with the word `floyd`.
   - Run the code analyzers and push to GitHub.
4. In the `FloydsAlgorithm` class, create a static method named `getPath` that takes a 2D-array of integers 
   named `paths` and two integers (i and j) and returns a `String`. You are going to modify the `printPath` 
   algorithm in Slide 21 to return a String composed of the intermediate vertices in the path from i to j,
   separated by spaces. For example, `printPath(paths, 4, 2)` will print out `0 3 `. Remember that because we
   are coding in Java which has 0-based indexing, `printPath(paths, 4, 2)` is printing out the path from vertex
   5 to vertex 3, which is vertex 1, then vertex 4. You may find it helpful to create a private helper method.
   - Uncomment and run the tests in `test/java/problem3/FloydsAlgorithmTest.java` that begin with the word `path`.
   - Run the code analyzers and push to GitHub.
5. You can create a `main` method or a demo class with the `main` method to help you debug and analyze your code.