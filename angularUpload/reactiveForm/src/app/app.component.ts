import { Component } from '@angular/core';
import { FormGroup, FormControl } from '@angular/forms';
@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  // title = 'lab3';
  // formvar:FormGroup;
  // pid="";
  // name="";
  // cost="";
  // prod:any[]=[]
  category: string[] = [
    'Electronics',
    'Grocery',
    'Mobile',
    'Cloth'
  ];
  myform: FormGroup; 
  id: FormControl;
  name: FormControl;
  cost: FormControl;
  radioControl: FormControl;
  ponline:FormGroup;

  constructor(){}
  ngOnInit(){
    this.myform = new FormGroup({
      id: new FormControl(),
      name: new FormControl(),
      cost: new FormControl(),
       ponline : new FormGroup({
        radioControl: new FormControl()})
    })
  }
  validate(){
    if (this.myform.valid) {
      console.log("Form Submitted!");
      console.log(this.myform.value);
  }}
}
