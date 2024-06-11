# AVL-Tree-Visualizer
This project is a JavaFX application for visualizing an AVL (Adelson-Velsky and Landis) tree. An AVL tree is a self-balancing binary search tree. The application provides a user interface to insert, delete, and search nodes in the AVL tree while graphically displaying the tree's structure.

Main Features

Node Insertion:
Users can enter a value in the text field and click the "Insert" button to add a new node with that value to the AVL tree.
The AVL tree automatically rebalances after each insertion to maintain its balanced property.

Node Deletion:
Users can enter a value in the text field and click the "Delete" button to remove the node with that value from the AVL tree.
The AVL tree automatically rebalances after each deletion.

Node Search:
Users can enter a value in the text field and click the "Search" button to find a node with that value in the AVL tree.
A message is displayed to indicate whether the node was found or not.
Graphical Tree Display:

The AVL tree is graphically displayed in an AnchorPane, with circles representing the nodes and lines representing the connections between the nodes.
The nodes are automatically positioned to reflect the tree's structure.

Project Structure

Controller.java:
Manages user interactions with the interface.
Contains methods for inserting, deleting, and searching nodes, as well as displaying the AVL tree.

AVL_Tree.java:
Implements the AVL tree data structure.
Contains methods for inserting, deleting, and searching nodes, as well as rebalancing the tree.

How to Use the Application

Run the Application:
Clone the GitHub repository.
Open the project in a Java development environment (e.g., IntelliJ IDEA, Eclipse).
Run the main class to start the JavaFX application.

Insert a Node:
Enter an integer value in the text field.
Click the "Insert" button.
The node will be inserted into the AVL tree, and the tree structure will be updated and displayed.

Delete a Node:
Enter an existing integer value in the text field.
Click the "Delete" button.
The node will be deleted from the AVL tree, and the tree structure will be updated and displayed.

Search for a Node:
Enter an integer value in the text field.
Click the "Search" button.
A message will indicate whether the node was found in the AVL tree.

This project is an excellent resource for understanding the workings of AVL trees and visualizing rebalancing operations. It is particularly useful for students and developers interested in advanced data structures.
