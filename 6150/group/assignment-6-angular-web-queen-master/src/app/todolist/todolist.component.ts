import { Component, OnInit , Input} from '@angular/core';
import {Todolist} from '../models/todolist';

@Component({
  selector: 'app-todolist',
  templateUrl: './todolist.component.html',
  styleUrls: ['./todolist.component.scss']
})
export class TodolistComponent implements OnInit {
  @Input() todolist: Todolist;
  classObject: Object = {
    todolist: true ? 'todolist' : ''
  };
  // styleObject:Object;
  constructor() { }

  ngOnInit() {
  }

}
