import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-ques2',
  templateUrl: './ques2.component.html',
  styleUrls: ['./ques2.component.css']
})
export class Ques2Component implements OnInit {

  Id="";
  Name:string="";
  Salary="";
  Department:string="";
  constructor() { }
  ngOnInit() {
  }
  givealert(){
    alert(this.Id +" "+this.Name +" "+ this.Salary +" "+ this.Department);
}

}
