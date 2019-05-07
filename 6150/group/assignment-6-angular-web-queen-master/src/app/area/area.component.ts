import { Component, OnInit ,Input} from '@angular/core';
import{Todolist} from './../models/todolist';
import{TodolistService} from './../services/todolist.service';
@Component({
  selector: 'app-area',
  templateUrl: './area.component.html',
  styleUrls: ['./area.component.scss']
})
export class AreaComponent implements OnInit {
  areaflag="area comp";
  @Input() listsChild: Array<Todolist>;
  todolistService:TodolistService;
  constructor(todolistService:TodolistService) { 
    this.todolistService=todolistService;
  }
  CreateList(){
    this.listsChild.push(this.todolistService.createList());
  }

  ngOnInit() {
  }

}
