PROG6112 | 2024 EXAM | QUESTION 1 | MOVIE TICKET SALES
=======================================================

This is a complete Java with Maven project for Apache NetBeans (JDK 17).
It covers QUESTION 1 ONLY (Q1.1, Q1.2 and Q1.3), not Question 2.

HOW TO OPEN AND RUN IN NETBEANS
1. Extract the ZIP file first.
2. Open Apache NetBeans.
3. Choose File > Open Project.
4. Select the folder Question1_MovieTicketSales2024 (the folder with pom.xml).
5. Set JDK 17 for the project if asked.
6. Right-click the project and choose Run.
   If NetBeans asks for the main class, select prog6112.q1.MovieTicketApplication.
7. Right-click the project and choose Test to run the two unit tests.
   Maven may download JUnit 5 dependencies the first time you test.

WHERE TO FIND THE JAVA FILES
Source Packages > prog6112.q1
  IMovieTickets.java        - The interface with the two required methods.
  MovieTickets.java         - The class implementing those methods.
  MovieTicketApplication.java - Class-level static 1D/2D arrays, main method and report.

Test Packages > prog6112.q1
  MovieTicketsTest.java     - The two JUnit 5 tests.

HOW EACH FILE MATCHES THE QUESTION
Q1.1 - MovieTicketApplication declares all arrays outside main(),
       but inside the class, using static so main() can access them.
       It uses String[] for names/months, int[][] for sales,
       int[] for movie totals, and nested for loops.
Q1.2 - IMovieTickets and MovieTickets contain the specified methods.
Q1.3 - MovieTicketsTest has the two required named unit tests.

EXPECTED RESULTS
Napoleon ticket sales total: 6200
Oppenheimer ticket sales total: 6300
Top performing movie: Oppenheimer

All code is deliberately written using beginner-friendly loops, if statements,
arrays and explicit variable names, with teaching comments.
