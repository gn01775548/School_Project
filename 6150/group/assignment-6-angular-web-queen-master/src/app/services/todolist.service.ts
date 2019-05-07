import { Injectable } from '@angular/core';
import {Todolist} from '../models/todolist';
@Injectable({
  providedIn: 'root'
})
export class TodolistService {
  lists:Array<Todolist>;
  idSeq:number;
  constructor() { 
    this.lists=[];
    this.idSeq=1;
  }
  getLists():Array<Todolist>{
    return this.lists;
  }
  createList(todolist:Todolist=null):Todolist{
    let idSeq=this.idSeq,
    newList:Todolist;
    newList=todolist?todolist:new Todolist("Someone","New List");
    newList.id=idSeq;
    this.idSeq=idSeq;
    return newList;
  }
}
