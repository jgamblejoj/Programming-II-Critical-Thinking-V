# Programming-II-Critical-Thinking-V

In this assignment, the objective was to develop a program that employs a recursive method to compute the sum of five numbers, as entered by the user. The program was enhanced with the following modifications:
Global Scanner Declaration: A global Scanner was instantiated, and this single instance was passed as an argument to the recursive method. This strategy helped circumvent potential complications associated with closing and reopening the Scanner.

Recursive Method Reordering: The order within the recursive method was adjusted to check for the base case (n < 5) before initiating the recursive call. This adjustment allowed the use of (n < 5) as the base case instead of (n < 4). As a result, the final output message was updated to:
System.out.println(“The final sum is: “ + s);
 Previously, it had been:
System.out.println(“The final sum is: “ + (s + numArray[4]));

Data Type Changes: The data types for ‘s’ and ‘numArray’ were transitioned from int to double. This modification enabled the program to accommodate decimal numbers in addition to integers.
