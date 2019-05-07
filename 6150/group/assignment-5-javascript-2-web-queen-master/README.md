## assignment-5-javascript-2-web-queen

This repository contains projects implemented by our team, named "Web Queen".

## Introduction

This project allows users to do following function:   
1.Show default value from external json file, which user can edit.
2.When user click on the "create" button, it creates a new to do list, which includes basic information like author, title, date.
3.Input the thing user want to do after clicked "+", it will add new item on the list.  
4.User can delete any item or list on to do list by moving mouse on item of list, and clicking on the right side of item.  

## Division of work
Common work: 1.Design the html model and CSS.  2. Finish reading default json file through asychronous request. 3. Delete to do item.

Yuhuizi Rao:     
1. Built html and basic css.
2. Finished create new list function and new todo item.
3. Completed part of reading json file function;
4. Implemented the add and fixed delete function.
5. Improve date generated function.
6. Packed the project by webpack.

Detailed Strategy:   
1a.Divided html into 2 parts: nav bar and the content.  Design a flow mode for all lists.  
1b.Arranged the page elements,added the display and hover effect in CSS.  

2.Constructed the DOM when execute the create and add function.   

3.By using loop to get the value of json file and match with the element in html.   

4.Modulize the delete function and let it run in both default lists and new lists.

5.When user create new list, generate new date from API.  

6.Install plug-in and write the config file, link the js file and cs file by importing.


  
Hsiang-Hua Chen:
1.Make default todo list items loaded from a json file asynchronously. 
2.Make dafault todo list editable.
3.Add delete function to the default todo list.
4.Fix small error of css file.

Detailed Strategy: 
1a.First part of the code is making the request to the json file.
1b.Next using function showJson to create the whole todo list as section, every attribute of todo list as div, whole todo list as ul, every single item as li.
1c.Also add feature of delete and add.

2.Change the element type to input, so the value can be editable. 

3.Create new element as delete button, and new delete action when click the button.

4.Change the value of element in the css file, so the two button of todo list will be apart.


## Version:1


## Installation

1.Download the whole package.  
2.Install as usual, just click on html file.(Firefox browser is best perform situation)  
3.Input by keyboard and click by mouse as introduction. 

## Enviroment
mac air or mac book
processor: 1.6GHZ Intel Core i5
memory:8 GB 1600MHZ

## Reference

Json file:
https://developer.mozilla.org/zh-TW/docs/Learn/JavaScript/Objects/JSON
https://www.w3schools.com/js/js_json.asp

Webpack:
http://www.mrmu.com.tw/2017/08/18/webpack-tutorial2-css-scss/
https://medium.com/@Mike_Cheng1208/什麼是webpack-你需要webpack嗎-2d8f9658241d