import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  id: number;
  name: string;
  salary: number;
  dept: string;

  emp = [
    {
      empId : 1001,
      empName : "Not Rahul",
      empSalary : 16000,
      empDept : "FS" 
    },
    {
      empId : 1002,
      empName : "Not Vikash",
      empSalary : 16000,
      empDept : "FS" 
    },
    {
      empId : 1003,
      empName : "Not Sachin",
      empSalary : 16000,
      empDept : "FS" 
    }
  ]
  

  add() {
    this.emp.push({empId : this.id, empName : this.name, empSalary : this.salary, empDept : this.dept});

  }
  update(){
    
  }

  delete(){}
}
