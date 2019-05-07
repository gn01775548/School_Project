import { Component, OnInit,Output,Input,EventEmitter } from '@angular/core';
import{Todolist} from './../models/todolist';
import{TodolistService} from './../services/todolist.service';
import{AreaComponent} from './../area/area.component';
@Component({
  selector: 'app-nav-bar',
  templateUrl: './nav-bar.component.html',
  styleUrls: ['./nav-bar.component.scss']
})
export class NavBarComponent implements OnInit {
  user='Alice';
  @Input() areaComponent:AreaComponent
  @Output() newListEmitted= new EventEmitter<Todolist>();
  todolistService:TodolistService;
  constructor(todolistService:TodolistService) {
    this.todolistService=todolistService;
   }
   createList(){
     let newTodolist:Todolist=this.todolistService.createList();
     this.newListEmitted.emit(newTodolist);
   }

  ngOnInit() {
  }

}
