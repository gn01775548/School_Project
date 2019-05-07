## extra-credit-assignment-ppt

This repository contains projects implemented by Hsiang-Hua Chen.

## Introduction

This project allows users to do following function:   
1)	User can see a white sheet (white background) for adding text and image objects and a toolbar with text and image icon.
3)	User can use the buttons to add new text box or image.
4)	User can edit a text object by clicking it. When the text object is selected text formatting toolbar should be visible.   
5)	User can apply bold, italics and underline on the text.
7)	User can able to resize both text and image objects by selecting the border of the object.
8)	User can drag and drop both text and image objects by selecting the border of the object.

## Built With

* [VisualStudioCode] - The web framework used
* [Webpack] - Pack the project

### Installing

First of all, install node.
Then, use the terminal.app to enter follow codes to install the webpack.

```
> npm install webpack webpack-cli --save-dev
```

But we also need to pack the css, so we also need to install css loader.

```
> npm install css-loader style-loader --save-dev
```

Then create a package.json file to input customized code.

```
> npm init
```

Next, we should create a webpack.config.js file to tell the system where to entry, and put the packed file.

After that, we should input the customized code in the package.json file.

Then, we can use the follow code to complete the webpack.

```
> npm run build
```

## Running the tests

1.Download the whole package.  
2.Install as usual, just click on html file.(Firefox browser is best perform situation)  
3.Input by keyboard and click by mouse as introduction. 

## Enviroment
mac air or mac book
processor: 1.6GHZ Intel Core i5
memory:8 GB 1600MHZ

## Reference

Webpack:
http://www.mrmu.com.tw/2017/08/18/webpack-tutorial2-css-scss/
https://medium.com/@Mike_Cheng1208/什麼是webpack-你需要webpack嗎-2d8f9658241d



