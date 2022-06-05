

Artemis
5.8.3
 Course Overview
 25+
Notifications

 25 of 225 notifications loaded
Exercise released new
A new exercise "Fun with fold" got released.
31.05.22 23:57 by Artemis
File submission successful new
Your file for the exercise "Raise the bar!" was successfully submitted.
31.05.22 23:38 by Artemis
Exercise released new
A new exercise "Computing Zero" got released.
28.05.22 20:06 by Artemis
Exercise released new
A new exercise "More Big Steps" got released.
28.05.22 20:05 by Artemis
Exercise released new
A new exercise "Raise the bar!" got released.
24.05.22 23:22 by Artemis
Exercise released new
A new exercise "Threesum" got released.
24.05.22 21:47 by Artemis
Exercise released new
A new exercise "Multiplication" got released.
24.05.22 21:47 by Artemis
Exercise released new
A new exercise "Big Steps" got released.
24.05.22 21:46 by Artemis
New exercise post new
Exercise "Infinite Trees" got a new post.
24.05.22 16:22 by Beka Kikutadze
New exercise post new
Exercise "Infinite Trees" got a new post.
22.05.22 18:28 by Saba Katamadze
New exercise post new
Exercise "Infinite Trees" got a new post.
22.05.22 16:10 by Romani Todua
New exercise post new
Exercise "Infinite Trees" got a new post.
22.05.22 15:10 by Saba Zedginidze
Exercise released new
A new exercise "Students in students out" got released.
20.05.22 19:49 by Artemis
New exercise post new
Exercise "Infinite Trees" got a new post.
18.05.22 00:21 by Giorgi Kuprava
Exercise Submission Assessed new
Your submission for the programming exercise "Lagrange" has been assessed.
17.05.22 10:55 by Artemis
Exercise released new
A new exercise "Fun-With-Folding" got released.
13.05.22 18:21 by Artemis
Exercise released new
A new exercise "Expression-Evaluation" got released.
13.05.22 18:12 by Artemis
Exercise released new
A new exercise "Matrix" got released.
13.05.22 11:58 by Artemis
New course-wide post new
Course "Tutorial Course" got a new course-wide post.
11.05.22 13:57 by Ricardo Kraft
Exercise released new
A new exercise "Modules" got released.
11.05.22 12:12 by Artemis
New exercise post new
Exercise "Minimal Spanning Tree" got a new post.
09.05.22 20:18 by Nika Koghuashvili
New exercise post new
Exercise "Lagrange" got a new post.
05.05.22 20:47 by Beka Kikutadze
New exercise post new
Exercise "Lagrange" got a new post.
05.05.22 20:45 by Beka Kikutadze
New exercise post new
Exercise "Minimal Spanning Tree" got a new post.
05.05.22 01:19 by Nikoloz Sharikadze
Exercise released new
A new exercise "Map" got released.
04.05.22 10:07 by Artemis
 kiu_kikutadze.beka 
 StringLists
Due date: Nov 21, 2021 23:59 6 months ago
Categories:
Homework
FoP
Type:
Programming 
Points:
10
 Score 100%, No tests found, 10 of 10 points (6 months ago) GRADED
Objects of the class String cannot be changed. Calls to methods such as concat (String other) do not modify the string, but return a new string as the result. When the method concat is called on strings, the two contiguous strings must be copied character by character into a new array.

In this task the class MyString is to be implemented, which is supposed to provide some functionalities similar to the class String. Concatenation of MyString objects is done without copying all characters. MyString implements a list structure, whereby aMyString has a next attribute, which refers to the subsequent data follower, if it is available.

The concentration of a char array to a MyString can then be linked to the end of the list via attaching a new myString object that stores the passed array. The string represented by a MyString then corresponds to the juxtaposition of the char arrays with the individual list elements.

Hints:
So that the task is not too easy, the only method that you can use from the String class is the constructor String (char [] value). You may not use any other methods on Strings, StringBuilder or StringBuffer in the entire task. In particular, you must not use the methods equals, length, indexOf, lastIndexOf, substring, concat (also in the form + or + =) on objects of the String classes , StringBuilder, or StringBuffer.
You may only copy the individual elements of char arrays into other arrays when implementing the toString () method.
Do not use any imports.
Be sure to declare all method and attribute names and method headers exactly as specified.
The behavior tests are only carried out when you have created all attributes and methods. Until then, the behavior tests say "Test was not executed".
You can define additional auxiliary methods.
Class diagram

Note: The method indexOf (char c) is written with a lowercase "i"!

Implementation
To implement it, do the following:

Create the class MyString in the file MyString.java that already exists in the template. Then create an attribute char [] data and an attribute MyString next in the class. These attributes should not be accessible from other classes.
Create the constructor public MyString (char [] data), which initializes the member variable data with the transferred parameter. You can assume that the parameter data is not null.
Create the method public int length (), which returns the length of the character string represented by the list.
Create the method public void concat (char [] data) which creates a MyString by calling the constructor of MyString with data and appending the created object to the end of the list. You can assume that the parameter is not null. Even if data has the length 0, a MyString should be created and appended.
Create the method public String toString (), which returns a String representation of the character string represented by the list. To generate the string to be returned, use the String (char [] value) constructor.
Create the method public boolean equals (MyString other), which returns true if both lists represent the same character string and false otherwise. If the parameter other equals null, then false should be returned.
Create the method public int indexOf (char c), which returns the index (indexed with 0) of the first occurrence of the transferred character c in the character string represented by the list. If c does not appear in the string, -1 should be returned.
Create the method public int lastIndexOf (char c), which returns the index (indexed with 0) of the last occurrence of the transferred character c in the character string represented by the list. If c does not appear in the string, -1 should be returned.
Tests:
 Class, attributes and methods created 0 of 3 tests passing
 Constructor call example 0 of 1 tests passing
MyString myString = new MyString(new char[]{'a','b','c','d'});
 Concatenation example 0 of 1 tests passing
MyString str = new MyString(new char[]{'a','b','c','d'});
str.concat(new char[]{'e','f'});
 Length example 0 of 1 tests passing
MyString str = new MyString(new char[]{'a','b','c','d'});
str.concat(new char[]{'e','f'});
str.length(); // 6 
 toString() example 0 of 1 tests passing
MyString str = new MyString(new char[]{'a','b','c','d'});
str.concat(new char[]{'e','f'});
str.toString(); // "abcdef" 
 equals() example 0 of 1 tests passing
MyString str1 = new MyString(new char[]{'a','b','c','d'});
str1.concat(new char[]{'e','f'});
MyString str2 = new MyString(new char[]{'a','b','c','d','e','f'});
str1.equals(str2); // true 
 indexOf() examplel 0 of 1 tests passing
MyString str = new MyString(new char[]{'d','b','c','d'});
str.concat(new char[]{'e','f'});
str.indexOf('d'); // 0
 lastIndexOf() example 0 of 1 tests passing
MyString str = new MyString(new char[]{'d','b','c','d'});
str.concat(new char[]{'e','f'});
str.lastIndexOf('d'); // 3
 indexOf() example 2 0 of 1 tests passing
MyString str = new MyString(new char[]{'d','b','c','d'});
str.concat(new char[]{'e','f'});
str.indexOf('f'); // 5
 lastIndexOf() example 2 0 of 1 tests passing
MyString str = new MyString(new char[]{'d','b','c','d'});
str.concat(new char[]{'e','f'});
str.concat(new char[]{'g'});
str.lastIndexOf('g'); // 6
Recent results:
0%
No tests found
0%
No tests found
0%
No tests found
0%
No tests found
100%
No tests found, 10 of 10 points
Show all results
Every student is allowed to complain once per exercise. In total 3 complaints are possible in this course. You still have 2 complaints left. 

 
How useful is this feedback to you?
Discussion
Marita Janelidze 2021-11-14
Error Files #1459
the files in Repository are not the same as the problem we have to solve.

4

17

6

Show 2 replies
Ketevan Gotsiridze 2021-11-21
Try & Catch #1489
Can we use Try and Catch?

2

1

4

2

Start discussion
About us
Request change Release notes Privacy Imprint
