import { Component } from '@angular/core';
import {Todolist} from './models/todolist';
import {TodolistService} from './services/todolist.service';
@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})
export class AppComponent {
  title = 'TO DO List';
  listsParent: Array<Todolist>;
  showConfig = true;
  toggleConfig() { this.showConfig = !this.showConfig; }

  constructor(todolistService: TodolistService) {
    this.listsParent = todolistService.getLists();
  }
  addList(todolist: Todolist) {
    this.listsParent.push(todolist);
  }
}
