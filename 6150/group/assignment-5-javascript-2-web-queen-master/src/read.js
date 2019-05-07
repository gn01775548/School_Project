//import the external file, so the html can import only one file;
import '../css/todo.css';
import '../src/todo.js';

//Use "Get" to load the external json file;
let requestURL = './src/default.json';
let request = new XMLHttpRequest();
request.open('GET', requestURL);
request.responseType = 'text';
request.send();

//Wait for the response to return from the server, then dealing with it;
request.onload = function() {
    let toDoItemText = request.response;
    let toDoItem = JSON.parse(toDoItemText);
    showJson(toDoItem);
};

//Creates and displays the Json file;
function showJson(jsonObj){
    let jsonFile = jsonObj['members'];
    var i;
    
    //Create a loop that will load through each object in the array;
    for (i = 0; i < jsonFile.length; i++) {
        var section = document.createElement('section');
        document.body.appendChild(section);
        let divRoot = document.createElement("div");
        let divTitle=document.createElement("div");
        let divAuthor=document.createElement("div");
        let divDate=document.createElement("div");

        let delBtn=document.createElement("span");
        let addBtn=document.createElement("span");
        let delll = document.createTextNode("\u00D7");
        let adddd = document.createTextNode("\u002B");

        let myList = document.createElement('ul');

        divRoot.className="label";
        divTitle.className="inlabel";
        divAuthor.className="inlabel";
        divDate.className="inlabel";     

        delBtn.className="delB"; 
        addBtn.className="add";
        
        divTitle.innerHTML="Title:";
        divAuthor.innerHTML="Author:";
        divDate.innerHTML="Date:";

        addBtn.appendChild(adddd);
        delBtn.appendChild(delll);
        
        let inputTitle=document.createElement("input");
        inputTitle.className="title";
        inputTitle.value=jsonFile[i].title;
        divTitle.appendChild(inputTitle);
        
        let inputAuthor=document.createElement("input");
        inputAuthor.className="author";
        inputAuthor.value=jsonFile[i].author;
        divAuthor.appendChild(inputAuthor);

        let inputDate=document.createElement("input");
        inputDate.className="date";
        inputDate.value=jsonFile[i].date;
        divDate.appendChild(inputDate);
        
        let toDoItem = jsonFile[i].toDoItem;
        var j;
        //Create a loop that will load through current list's todo item;
        for(j = 0; j < toDoItem.length; j++) {
            var listItem = document.createElement('li');
            let inputItem=document.createElement("input");
            inputItem.value=toDoItem[j];
            listItem.appendChild(inputItem);
            myList.appendChild(listItem);
        }

        divRoot.appendChild(divTitle);
        divRoot.appendChild(divAuthor);
        divRoot.appendChild(divDate);  

        divRoot.appendChild(delBtn);  
        divRoot.appendChild(addBtn);

        section.appendChild(divRoot);
        section.appendChild(myList);
    }

    //Add function to the default list; 
    appendClose();
    //newItem();
    closeItem();
    closeSection();    
}


//Create close button to the list; 
function appendClose(){
    var m;
    var deleteIcon = document.getElementsByTagName("li");
    for (m = 0; m < deleteIcon.length; m++){
        var span = document.createElement("SPAN");
        var txt = document.createTextNode("\u00D7");
        span.className = "close";
        span.appendChild(txt);
        deleteIcon[m].appendChild(span);
    }
}

//Create close todo item action when click on the close button;
function closeItem(){
    var m;
    var close = document.getElementsByClassName("close");
    for (m = 0; m < close.length; m++){
        close[m].onclick = function() {    
            var r = confirm("Do you want to delete the item?");
            if (r == true) {                            
                var div = this.parentElement;
                div.style.display = "none";
            }                                          
        }
    }
}

//Create close todo list action when click on the close button;
function closeSection(){
    var m;
    var closeSec = document.getElementsByClassName("delB");
    for (m = 0; m < closeSec.length; m++){
            closeSec[m].onclick = function() {    
                var r = confirm("Do you want to delete the memo?");
                if (r == true) {                            
                    var div = this.parentElement.parentElement;
                    div.style.display = "none";
                }                                          
        }
    }
}






