export class Todolist{
    id:number;
    author:String;
    title:String;
    date:Date;
    todos:String[];

    constructor(author:String,title:String){
        this.author=author;
        this.title=title;
        this.date=new Date();
    }

}