// Module
import { BrowserModule } from '@angular/platform-browser';
import { FormsModule } from '@angular/forms';
import { NgModule } from '@angular/core';
import { AppRoutingModule } from './app-routing.module';
import { HttpClientModule } from '@angular/common/http';
// Component
import { AppComponent } from './app.component';
import { AreaComponent } from './area/area.component';
import { NavBarComponent } from './nav-bar/nav-bar.component';
import { TodolistComponent } from './todolist/todolist.component';
// Service
import {TodolistService} from './services/todolist.service';
import { ConfigComponent } from './config/config.component';

@NgModule({
  declarations: [
    AppComponent,
    AreaComponent,
    NavBarComponent,
    TodolistComponent,
    ConfigComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    AppRoutingModule,
    FormsModule
  ],
  providers: [TodolistService],
  bootstrap: [AppComponent]
})
export class AppModule { }
