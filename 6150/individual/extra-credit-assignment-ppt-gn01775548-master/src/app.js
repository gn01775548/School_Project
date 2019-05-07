import '../css/todo.css';

function createBox(){
    //build the textbox
    var mainBox = document.createElement("div");
    document.body.appendChild(mainBox);
    mainBox.setAttribute("class", "drag");

    //build the title of textbox
    var titleDiv = document.createElement("div");
    titleDiv.setAttribute("class", "title");
    //titleDiv.onmousedown=function(){drag(oDrag,handle)};

    //build function bar
    var funDiv = document.createElement("div");
    funDiv.setAttribute("class", "tip"); 


    //build close icon
   var delImg = document.createElement("button");
   delImg.textContent=("\u00D7");
   delImg.setAttribute("class", "icon");
   delImg.setAttribute("id", "delete");


   //close function
   delImg.setAttribute("onclick", "deleteNote()");
   funDiv.appendChild(delImg);  
  
   titleDiv.appendChild(funDiv);
   mainBox.appendChild(titleDiv);


    //build font bar
    var fontDiv = document.createElement("div");
    fontDiv.setAttribute("class", "fontBar");

    //bold font
    var boldFont=document.createElement("input");
    boldFont.type="button";
    boldFont.value="BOLD";
    boldFont.setAttribute("onclick", "beBold()");
    fontDiv.appendChild(boldFont);

    //Italics font
    var itaFont=document.createElement("input");
    itaFont.type="button";
    itaFont.value="ITALICS";
    fontDiv.appendChild(itaFont);
    itaFont.onclick = function(){beItalics()}

    //underline font
    var underFont=document.createElement("input");
    underFont.type="button";
    underFont.value="UNDERLINE";
    fontDiv.appendChild(underFont);
    underFont.onclick="document.getElementById('txt').style.fontWeight = 'bold'";


    titleDiv.appendChild(fontDiv);
    mainBox.appendChild(titleDiv);

    //textarea
    var textArea=document.createElement("textarea");
    textArea.className="content";
    textArea.id="inputtxt";
    mainBox.appendChild(textArea);

    document.body.appendChild(mainBox);
}

function beBold(){
    document.getElementsByClassName("textArea").style.fontWeight="bold";
}

function beItalics(){
    document.getElementsByClassName("textArea").style.fontStyle = "italic";
}

function beUnderline(){
    document.getElementsByClassName("textArea").style.textDecoration = "underline";
}


//function frag
var dragObj;
var _startX = 0;           
var _startY = 0;
var _offsetX = 0;           
var _offsetY = 0;
var z = 0;

function mousedownHandler(e) {
if (e.target.parentNode.className == 'drag') {
    dragObj = e.target.parentNode;
    var t = dragObj.style.top;
    var l = dragObj.style.left;
    z += 1;
    dragObj.setAttribute("style", "top:" + t + ";left:" + l + ";z-index:" + z);

    _startX = e.clientX;
    _startY = e.clientY;
    _offsetX = dragObj.offsetLeft;
    _offsetY = dragObj.offsetTop;

    document.addEventListener("mousemove", mousemoveHandler, false);
}
}

//delete function
function deleteNote() {
    var m;
    var deletee = document.getElementsByClassName("tip");
    for (m = 0; m < deletee.length; m++){
        deletee[m].onclick = function() {    
            var r = confirm("Do you want to delete the textbox?");
            if (r == true) {                            
                var div = this.parentElement.parentElement;
                div.style.display = "none";
            }                                          
        }
    }

}
function mouseupHandler(e) {
document.removeEventListener("mousemove", mousemoveHandler, false);
}

function mousemoveHandler(e) {
dragObj.style.left = (_offsetX + e.clientX - _startX) + 'px';
dragObj.style.top = (_offsetY + e.clientY - _startY) + 'px';
}
window.addEventListener("load", init, false);

function init() {
document.addEventListener("mousedown", mousedownHandler, false);
document.addEventListener("mouseup", mouseupHandler, false);
}




//create imag function
function previewFile() {

    var imgDiv=document.createElement("div");
    imgDiv.className="imgDiv";

    var imgPlace=document.createElement("img");
    imgPlace.className="image";
    imgPlace.id="imgg";
    imgDiv.appendChild(imgPlace);

    document.body.appendChild(imgDiv);

    var preview = document.querySelector('img');
    var file  = document.querySelector('input[type=file]').files[0];
    var reader = new FileReader();
    reader.onloadend = function () {
        preview.src = reader.result;
    }
    if (file) {
        reader.readAsDataURL(file);
    } else {
        preview.src = "";
    }  

    window.addEventListener("load", init2, false);
}

function init2() {
    document.addEventListener("mousedown", mousedownHandler, false);
    document.addEventListener("mouseup", mouseupHandler, false);
}

//drag img
var dragImg;
var _startX2 = 0;           
var _startY2 = 0;
var _offsetX2 = 0;           
var _offsetY2 = 0;
var zzz = 0;
function mousedownHandler2(g) {
if (g.target.parentNode.className == 'imgDiv') {
    dragImg = g.target.parentNode;
    var tt = dragImg.style.top;
    var ll = dragImg.style.left;
    zzz += 1;
    dragImg.setAttribute("style", "top:" + tt + ";left:" + ll + ";z-index:" + zzz);
    _startX2 = g.clientX;
    _startY2 = g.clientY;
    _offsetX2 = dragImg.offsetLeft;
    _offsetY2 = dragImg.offsetTop;
    document.addEventListener("mousemove", mousemoveHandler, false);
    }
}

function mouseupHandler2() {
document.removeEventListener("mousemove", mousemoveHandler, false);
}

function mousemoveHandler2() {
    dragImg.style.left = (_offsetX2 + g.clientX - _startX2) + 'px';
    dragImg.style.top = (_offsetY2 + g.clientY - _startY2) + 'px';
}



