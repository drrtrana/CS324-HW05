<h6>
CS-324-2: Introduction to the Design of Algorithms <br>
Spring 2021 <br>
Northeastern Illinois University <br>
Homework #5 <br>
Due Date: 03/24/21 at 9:00 p.m. <br>
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
4. Unless specified in the instructions, you may not use any Java methods that copy or manipulate arrays.
4. Reminder: All code must be your own work.

### Problem 1

1. In the `main/java/problem1` directory, create a new Java class named `MatrixMultiplication`. You can 
   always create a `main` method to help you debug and analyze your code.
2. In this class, create a method named `minMultiplications` that takes two parameters, a 1D integer array, 
   and a 2D integer array. This method should implement the pseudocode presented in Lecture 6.1, slide 17
   to return the minimum number of multiplications to multiply arrays.
    - Uncomment and run the tests in `test/java/problem1/MatrixMultiplication.java` that begin with the words
      `minMultiplications...`.
    - After these pass, run the code analyzers and push your code to GitHub.
3. You have been provided with an Excel spreadsheet named OptimalOrderTracing. Looking at the pseudocode for
   the `optimalOrder` method presented in Lecture 6.1, slide 19, use the spreadsheet to begin tracing through
   the pseudocode for the `order` array and an initial value of `i = 0` and `j = 5`.
   - Fill in a new table (these are called memory tables) every time a method is called.
   - The method header/parameters should go in the cell to the right of `Method Header`.
   - When a variable is created, add it to a row in the table.
   - You can also write recursive method calls in rows in the table to help you keep track of where the call
     originated.
   - Anytime a value is printed out, put it in the Output cell at the top of the spreadsheet.
   - Fill in the tables from top to bottom, left to right. 
   - The final output should be `(A0((((A1A2)A3)A4)A5))`, but *the pseudocode has not been updated to work 
     with zero-based indices!* How do you fix this? Look at your tracing! There is only one very small change
     needed! Make this change and re-fill out the memory tables.
4. In the `MatrixMultiplication` class, create a method named `optimalOrder` that takes three parameters, 
   a 2D integer array, and two integers. This method should implement the pseudocode presented in Lecture 6.1, 
   slide 19 to print out the optimal order for multiplying the arrays.
   - Uncomment and run the tests in `test/java/problem1/MatrixMultiplication.java` that begin with the words
     `optimalOrder...`.
   - After these pass, run the code analyzers and push your code to GitHub.

### Problem 2

1. In the `main/java` directory, create a package named `problem2`.
2. Add a class named `DnaManipulation`.
3. Create a static method named `longestCommonSub` that takes two Strings as parameters and returns an 
   integer. 
   - Implement the pseudocode presented in Lecture 6.2 slide 11 to return the length of the longest 
     common subsequence of two Strings. 
   - You can use the `Math.max` method.
   - Uncomment and run the tests in `test/java/problem2/DnaManipulation.java` that begin with the words
     `longestCommonSub...`. 
   - After these pass, run the code analyzers and push your code to GitHub.
4. Create a static method named `optimalAlignmentCost` that takes two Strings as parameters and returns an
   integer.
   - Implement the algorithm presented in Lecture 6.2 slide 14-16 to return the maximum cost of aligning
     two Strings.
   - You can use the `Math.max` method.
   - Use a penalty of -1 for mismatches, a penalty of -2 for gaps, and 0 for matches.
   - Uncomment and run the tests in `test/java/problem2/DnaManipulation.java` that begin with the words
     `optimalAlignmentCost...`.
   - After these pass, run the code analyzers and push your code to GitHub.