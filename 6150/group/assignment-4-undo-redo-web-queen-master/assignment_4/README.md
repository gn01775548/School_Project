## assignment-4-WebQueen

This repository contains projects implemented by our team, named "Web Queen".



## Introduction

This project allows users to do following function:   
1.Input the thing user want to do and click "add", it will show them on the list.  
2.User can delete any thing on to do list by moving mouse on item of lise, and clicking on the right side of item.  
3.User can use "ctrl+z" Undo, "ctrl+y" Redo.  

## Division of work
Common work: Design the html model.  

Yuhuizi Rao:     
Finish the "ctrl+z" & "ctrl+y" function.

Detailed Strategy:   
1.Define local array "command"  to store input value, index of list, and operation(add or delete).  

2.Define a "dolist" array to record user's do operation, an "undolist" array to record user's undo operation.  

3.Add eventlistener to keyboard, once user press the partiular key, it will execute corresponding function.  

4.Every time user operate do, store the command, push it to dolist.  
  Every time user operate "ctrl+z", store the command, pop it from "dolist", push it to undolist.  
  Every time user operate "ctrl+y", store the command, pop it from "undolist", push it to dolist.  
  
Hsiang-Hua Chen:
Using css to style the appkication. And using the webpack to package all the dependencies of the project into one (or more) ) JavaScript file that the browser recognizes.

Detailed Strategy: 
1.Install all the required tools, like npm(for manage the package), webpack(for packaging),  css-loader and style-loader(are for the css file).

2.Import the css file into the js file using css-loader and style-loader. So the webpack can pack all the file once.

3.Edit the package file to let the webpack know where and who it need to pack.

4.put the code "npm run build" into terminal, then the webpack will start packaging.


## Version:2


## Installation

1.Download the whole package.  
2.Install as usual, just click on html file.(Chrome browser is best perform situation)  
3.Press keyboard and click mouse as introduction. 

## Enviroment
mac air
processor: 1.6GHZ Intel Core i5
memory:8 GB 1600MHZ

## Reference

Array:
https://www.w3schools.com/jsref/jsref_obj_array.asp  
https://www.w3schools.com/jsref/met_node_removechild.asp
https://www.w3schools.com/js/js_arrays.asp

