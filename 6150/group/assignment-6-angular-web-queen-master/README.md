## assignment-6--web-queen

This repository contains projects implemented by our team, named "Web Queen".

This project was generated with [Angular CLI](https://github.com/angular/angular-cli) version 7.0.5.

### Installing

First of all, install the [Homebrew](https://brew.sh).

Secondly, install the Node.js use following code into the terminal.app.

```
> brew install node
```

Then use the code to verify install is correct.

```
> node -v
```

Thirdly, install the Angular Cli.

```
> npm install -g @angular/cli
```

Then use the code to verify install is correct.

```
> ng version
```

And then, create a workspace and initial application using the following code.

```
> ng new <app name>
```

Finally, go to the location of your project folder, and run the following code to open Angular sever.

```
> ng serve --open
```

## Introduction

This project allows users to do following function:   
1.Show default value from external json file, which user can edit.
2.When user click on the "create" button, it creates a new to do list, which includes basic information like author, title, date.
3.Input the todo item.  


## Development server

Run `ng serve` for a dev server. Navigate to `http://localhost:4200/`. The app will automatically reload if you change any of the source files.

## Code scaffolding

Run `ng generate component component-name` to generate a new component. You can also use `ng generate directive|pipe|service|class|guard|interface|enum|module`.

## Build

Run `ng build` to build the project. The build artifacts will be stored in the `dist/` directory. Use the `--prod` flag for a production build.

## Running unit tests

Run `ng test` to execute the unit tests via [Karma](https://karma-runner.github.io).

## Running end-to-end tests

Run `ng e2e` to execute the end-to-end tests via [Protractor](http://www.protractortest.org/).

## Division of work
Common work: 1.Design the angular structure.  2. Finish reading default json file through asychronous request. 3. Delete to do item.


Yuhuizi Rao:     
1. Set up the angular project and new components to integrate a complete page.
2. Finished the todolist class as the modle.
3. Completed the serveice to new object and initialize;
4. Implemented area& nav bar& todolist components .
5. Bind data from html and typescript.
6. Pass the object to interact between components.

Detailed Strategy:   
1a.Divided html into 2 parts: nav bar and the content.  Design a flow mode for all lists.  
1b.Arranged the page elements,added the display and hover effect in CSS.  

2.Constructed the DOM when execute the create and add function.   

3.By using loop to get the value of json file and match with the element in html.   

4.Modulize the delete function and let it run in both default lists and new lists.

5.When user create new list, generate new date from API.  

6.Install plug-in and write the config file, link the js file and cs file by importing.


  
Hsiang-Hua Chen:
1. Transfer the CSS file into SCSS file. 
2. Use the Angular to read the external JSON file.

Detailed Strategy: 
1. a. Use the SCSS language to transfer the file.
1. b. Divide the whole file into pieces, so the it can be more simple to fix in the future.

2. a. Put the JSON file in the assets folder.
2. b. Use the config folder to store all the file.
2. c. Use `*ngIf="config` to read the content from the json file.
2. d. Use `ngOnInit()` to load the JSON file automatically.


## Further help

To get more help on the Angular CLI use `ng help` or go check out the [Angular CLI README](https://github.com/angular/angular-cli/blob/master/README.md).

## Enviroment
mac air or mac book
processor: 1.6GHZ Intel Core i5
memory:8 GB 1600MHZ

## Reference

Angular:

https://angular.io/guide/quickstart#prerequisites

Typescript:

https://www.typescriptlang.org/docs/handbook/typescript-in-5-minutes.html
http://www.cnblogs.com/tansm/p/TypeScript_Handbook.html

