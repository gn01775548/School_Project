

//Get create button, and use EventListener to create new list when click on the button;
var createBtn = document.getElementById("create");
createBtn.addEventListener('click',newList);

//Create new list action;
function newList(){

    var section = document.createElement('section');
    document.body.appendChild(section);

    var divRoot = document.createElement("div");
    divRoot.className="label";
    section.appendChild(divRoot);

    var divTitle=document.createElement("div");
    divTitle.className="inlabel";
    divTitle.innerHTML="Title:"
    divRoot.appendChild(divTitle);
    var inputTitle=document.createElement("input");
    inputTitle.className="title";
    inputTitle.type="text";
    divTitle.appendChild(inputTitle);

    var divAuthor=document.createElement("div");
    divAuthor.className="inlabel";
    divAuthor.innerHTML="Author:"
    divRoot.appendChild(divAuthor);
    var inputAuthor=document.createElement("input");
    inputAuthor.className="author";
    inputAuthor.type="text";
    divAuthor.appendChild(inputAuthor);

    var divDate=document.createElement("div");
    divDate.className="inlabel";
    var d = new Date();
    divDate.innerHTML="Date:";
    divRoot.appendChild(divDate);
    var inputDate=document.createElement("input");
    inputDate.className="date";
    inputDate.type="text";
    inputDate.value=d.toUTCString();
    divDate.appendChild(inputDate);

    //Create delete and add button on the todo list;
    var delBtn=document.createElement("span");
    var delll = document.createTextNode("\u00D7");
    delBtn.className="delB"; 
    delBtn.appendChild(delll);
    divRoot.appendChild(delBtn); 
    var h=document.createElement("span");
    h.innerHTML="+";
    h.className="add";
    divRoot.appendChild(h);

    //Call create and delete funtion to keep listening to the event;
    newItem();
    closeSection();
}

//Create new item action;
function newItem(){
    var add=document.getElementsByClassName("add");
    var m;

    //Add eventlisrener for each new todo item;
    for (m=0; m < add.length; m++){
        add[m].addEventListener ('click',function() {
            var section= this.parentElement.parentElement;
            var ul=document.createElement("ul");
            section.appendChild(ul);
            var li = document.createElement("li");
            ul.appendChild(li);
            var inputItem=document.createElement("input");
            inputItem.type="text";
            li.appendChild(inputItem);
            
            //Create delete button on the todo item;
            var span = document.createElement("SPAN");
            var txt = document.createTextNode("\u00D7");
            span.className = "close";
            span.appendChild(txt);
            li.appendChild(span);
            appendClose();
            closeItem();

        })

    }
}

//New delete button on each todo item;
function appendClose(){
    var m;
    var deleteIcon = document.getElementsByTagName("li");
    for (m = 0; m< deleteIcon.length; m++){
        var span = document.createElement("SPAN");
        var txt = document.createTextNode("\u00D7");
        span.className = "close";
        span.appendChild(txt);
        deleteIcon[m].appendChild(span);
    }
}

//Add eventlistemer for each close element, when user click , don't display todo item;
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

//Create action to delete the whole todo list;
function closeSection(){
    var m;
    var deletee = document.getElementsByClassName("delB");
    for (m = 0; m < deletee.length; m++){
        deletee[m].onclick = function() {    
            var r = confirm("Do you want to delete the memo?");
            if (r == true) {                            
                var div = this.parentElement.parentElement;
                div.style.display = "none";
            }                                          
        }
    }
}

//}