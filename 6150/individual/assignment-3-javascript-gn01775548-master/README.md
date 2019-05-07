# assignment-3-javascript-gn01775548
assignment-3-javascript-gn01775548 created by GitHub Classroom. The assignment 3 required to implement two algorithms in JavaScript, one is binary search, other is depth-first search.

## About file binary.js
The binary search is a search algorithm that finds the position of a target value within a sorted array. Therefore, we need to privide the algorithm with the sorted array and a target value.

First of all, initialing values for start, middle and end.Seconedly, putting a loop to identify is the middle what we're looking for, and does the list have a single item. Thirdly, recalculating middle on every iteration. At the end, if the current middle item is what we're looking for return it's index, else return -1.

Using the Run Code button, then the project will run as we wanted.

reference: https://hackernoon.com/programming-with-js-binary-search-aaf86cef9cb3

## About file DFS.js
The depth-first search is an algorithm for traversing or searching tree or graph data structures.

At the beginning, creating a class to represent the binary search tree, which should have a Node class inside to create the node. Then insert a new key into the tree.  We should create a Node class instance that represents the new node. Therefore, you need to add a new Node class and pass in the key value to be inserted. It will be automatically initialized to a new node with the left and right nodes being null. Then, you need to make some judgments. First, identify whether the tree is empty. If it is empty, the newly inserted node acts as the root node. If it is not empty, call a helper method insertNode() method to pass the root node and the new node. Define the insertNode() method, which will call itself by recursion to find the appropriate location for the newly added node. To implement the in-order traversal, we need an inOrderTraverseNode(node) method that can recursively call itself to traverse each node. This method prints the key value of each node. It requires a recursive termination condition -- check if the incoming node is null. If it is not empty, continue to recursively call itself to check the left and right nodes of the node.

Using the Run Code button, then the project will run as we wanted.

reference: https://segmentfault.com/a/1190000015868360
