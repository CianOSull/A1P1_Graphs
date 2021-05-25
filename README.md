# A1P1_Graphs
 Assignment 1 part 1 graphs of non linear data structures and algorithms. The goal of the project was to use the base code given that included basic funcitons and interfaces to create a functioning stack. <br />
## Project specifiction:<br />
The project specification specified three parts of the project:<br />

**Part 1**:<br />
The folder /src contains the following files:<br />
- MyMain.java: This class tests the functionality of the stack’s static implementation.
- MyStack.java: This interface specifies the ADT MyStack containing int elements.
- MyStaticStack.java: This class implements all operations of MyStack, using a static 
based implementation based on the following attributes:
1. private int items[]; 
2. private int numItems;
3. private int maxItems; 

EXERCISE.
Implement the class MyStaticStack.java. IMPORTANT: only modify this .java file. Look for 
the comments: //TO-COMPLETE<br />

**Part 2**:<br />
The folder /src contains the following files:
- MyMain.java: This class tests the functionality of the stack’s dynamic implementation.
- MyNode.java: This class models the concept of a single linked node containing an int info and a pointer to its next node next. 
- MyStack.java: This interface specifies the ADT MyStack containing int elements.
- MyDynamicStack.java: This class implements all operations of MyStack, using a dynamic based implementation based on the following attributes:
1. private MyNode head; 

EXERCISE.
Implement the class MyDynamicStack.java. IMPORTANT: only modify this .java file. Look 
for the comments: //TO-COMPLETE

**Part 3**:<br />
The folder /src contains the following files:
- MyMain.java: This class tests the functionality of the stack’s dynamic implementation.
- MyDoubleLinkedNode.java: This class models the concept of a double linked node containing an element of type <T> info, a pointer to its next node left and a pointer to its previous node right. 
- MyStack.java: This interface specifies the ADT MyStack containing elements of type <T>.
- MyDoubleDynamicStack.java: This class implements all operations of MyStack, using 
a dynamic based implementation based on the following attributes:
1. private MyDoubleLinkedNode<T> head; 
2. private MyDoubleLinkedNode<T> tail; 

EXERCISE.
Implement the class MyDoubleDynamicStack.java. IMPORTANT: only modify this .java file. 
Look for the comments: //TO-COMPLETE
