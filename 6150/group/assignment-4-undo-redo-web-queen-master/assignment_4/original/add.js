import './style.css';
  //new the inside array to store the user command and pass the key value;
  //var command=new Array();
  //var count=0;
  //new the outside array to store the user commands;
  var dolist=new Array();
  //new the outside array to store the undo command, so that we can know what to do when Redo occurs;
  var undolist=new Array();
//(function() {
  
  var addButton = document.getElementById("addButton");
  var deleteBtn=document.getElementById("close");
  addButton.addEventListener('click',add);
 // deleteBtn.addEventListener('click',add);

     function add(){
      newElement();
        initList();
    }
    /*
  function closeBtn() {
      var i; 
      var myNodelist = document.getElementsByTagName("li");
      for (i = 0; i < myNodelist.length; i++) {
        var span = document.createElement("span");
        var txt = document.createTextNode("DELETE"); 
        span.className = "close";
        span.appendChild(txt);
        myNodelist[i].appendChild(span);
      }
    }
    */
    //new the inside array to store the user command and pass the key value;
    //var command=new Array();
    //new the outside array to store the user commands;
    //var dolist=new Array();
    //new the outside array to store the undo command, so that we can know what to do when Redo occurs;
    //var undolist=new Array();
//

function closeElement() {
   
    var close = document.getElementsByClassName("close");
    var list=document.getElementById("myList");
    for(j=0;j<list.length;j++){
      if(list.childNodes[j]==text){
          list.removeChild(list.childNodes[j]);
        }
        }
   
    //var myNodelist = document.getElementsByTagName("li");
    for (var i = 0; i < close.length; i++) {
      close[i].onclick = function() {
        console.log(i);
        //var div = this.parentElement; 
        //var list=document.getElementById("myList");
        var myNodelist = document.getElementsByTagName("li");
        var v=this.previousSibling.innerHTML;
        //var v=myNodelist[0].firstChild.innerHTML;
        //var myTxtlist = document.getElementsByClassName("liTxt");
       //problem
        //var v=myTxtlist[i];
        var index=myNodelist.length-1;
        var item=document.getElementById(v);
        item.parentNode.removeChild(item);
        //list.removeChild(list.childNodes[i-1]);
        //div.style.display = "none";
        var operation="delete";
        var command=new Array();
        command[0]=operation;
        command[1]=index;
        command[2]=v;
        //count+=1;
        console.log(dolist);
          // command.push(refer);
        dolist.push(command);
        
      }
    }
    //return operation,refer;
  }
  
   function newElement() {
      var li = document.createElement("li");
      
      var inputValue = document.getElementById("myInput").value;
      //li.value=inputValue;
      var t=document.createElement("p");
      t.innerHTML=inputValue;
      li.id=inputValue;
      //var t = document.createTextNode(inputValue);
     // t.className="liTxt";
      li.appendChild(t);
      if (inputValue === '') {
        alert("PLEASE ADD A ITEM FIRST");
      } else {
        document.getElementById("myList").appendChild(li);
      }
      document.getElementById("myInput").value = ""; 
      //function closeBtn() 
          var span = document.createElement("span");
          var txt = document.createTextNode("DELETE"); 
          span.className = "close";
          span.appendChild(txt);
          li.appendChild(span);
        
    

      var operation="add";
      var mynodelist = document.getElementsByTagName("li");
      var index=mynodelist.length-1;
      var v=inputValue;
      var command=new Array();

      command[0]=operation;
      command[1]=index;
      command[2]=v;
      //count+=1;
         // command.push(refer);
      dolist.push(command);
    } 

   /* function UndoList() {   
      closeBtn();
      closeElement();
   
    }

    function Undo() {
      
      document.onkeydown = function(event) {
        if(event.keyCode == 13 + ) {
          newElement();
          UndoList();
        }
      }
    }*/
     

    function initList() {   
     // closeBtn();
      closeElement();
   
    }
    
    function init() {
      //var addButton = document.getElementById("addButton"); 
      initList();
/*
      addButton.onclick = function() {
        newElement();
        initList();
      }
*/
}
  
init();
      //press ctrl + z will add new element
      /*document.onkeydown = function(event) {
        if(event.keyCode == 90 && event.ctrlKey) { 
          console.log("ctrl+z");
        }
      }
      */
     //Define the action after press "ctrl+z"
      document.addEventListener('keydown', function(event) {
        if (event.code == 'KeyZ' && (event.ctrlKey || event.metaKey)) {
          //alert('Undo!');
          console.log("ctrl+z");
          var temperaryCommand=new Array();
          console.log(dolist.length-1);
          temperaryCommand=dolist[dolist.length-1];
          var temperaryValue=temperaryCommand[2];
          var temperaryIndex=temperaryCommand[1];
          var temperaryOperation=temperaryCommand[0];
        if(temperaryOperation==="add"){
          
            //var mynodelist = document.getElementsByTagName("li");
            var list=document.getElementById("myList");
            for(j=0;j<list.length;j++){

              if(list.childNodes[j]==text){
                list.removeChild(list.childNodes[j]);
              }
              }
            list.removeChild(list.childNodes[temperaryIndex]);
            initList();
           //mynodelist[temperaryIndex].style.display = "none";
        }
        else{
          var li = document.createElement("li");
          var inputValue =temperaryValue;
          var t=document.createElement("p");
          t.innerHTML=inputValue;
          li.id=inputValue;
          //var t = document.createTextNode(inputValue);
        // t.className="liTxt";
          li.appendChild(t);
          if (inputValue === '') {
            alert("PLEASE ADD A ITEM FIRST");
          } else {
            document.getElementById("myList").appendChild(li);
            //closeBtn();
          var span = document.createElement("span");
          var txt = document.createTextNode("DELETE"); 
          span.className = "close";
          span.appendChild(txt);
          li.appendChild(span);
          }
         
          
  
        }
          dolist.pop();
          var command=new Array();
          command[0]=temperaryCommand[0];
          command[1]=temperaryCommand[1];
          command[2]=temperaryCommand[2];
        
          undolist.push(command);
        }
        init();
      });
    //Define the action after press "ctrl+Y"
    
      document.addEventListener('keydown', function(event) {
        if (event.code == 'KeyY' && (event.ctrlKey || event.metaKey)) {
          console.log("ctrl+Y");
          var temperaryCommand=new Array();
          console.log(undolist.length-1);
          temperaryCommand=undolist[undolist.length-1];
          var temperaryValue=temperaryCommand[2];
          var temperaryIndex=temperaryCommand[1];
          var temperaryOperation=temperaryCommand[0];
        if(temperaryOperation==="delete"){
          
          var list=document.getElementById("myList");
          for(j=0;j<list.length;j++){

            if(list.childNodes[j]==text){
              list.removeChild(list.childNodes[j]);
            }
            }
          list.removeChild(list.childNodes[temperaryIndex]);
          initList();
        }
        else{
          var li = document.createElement("li");
          var inputValue =temperaryValue;
          var t=document.createElement("p");
          t.innerHTML=inputValue;
          li.id=inputValue;
          //var t = document.createTextNode(inputValue);
        // t.className="liTxt";
          li.appendChild(t);
          if (inputValue === '') {
            alert("PLEASE ADD A ITEM FIRST");
          } else {
            document.getElementById("myList").appendChild(li);
            //closeBtn();
          var span = document.createElement("span");
          var txt = document.createTextNode("DELETE"); 
          span.className = "close";
          span.appendChild(txt);
          li.appendChild(span);
          }
  
        }
          undolist.pop();
          var command=new Array();
          command[0]=temperaryCommand[0];
          command[1]=temperaryCommand[1];
          command[2]=temperaryCommand[2];
        
          dolist.push(command);
        }
        init();
      });


      module.exports = {
        add:,
        closeElement:,
        newElement:,
        init:,
        initList:,
        helloWord: helloWorld,
      };

    
      
      //press ctrl + y will add new element
      /*
      document.onkeydown = function(event) {
        if(event.keyCode == 89 && event.ctrlKey) { 
          newElement();
          initList();
        }
      }
    */
    
  
    



//  })();
  