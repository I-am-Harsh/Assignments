import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  id:number=null;
  name:string="";
  sal="";
  dept="";
  id1="";
  disp;
  name1:string="";
  salary1;
  department1;
  index;
  data;
  del;
  users:any[]=[
    { id:1001,name:'name',salary:2000,department:'CSE'},

    { id:1001,name:'name',salary:2000,department:'CSE'},
    { id:1001,name:'name',salary:2000,department:'CSE'},
    { id:1001,name:'name',salary:2000,department:'CSE'},
];
  obj:Object;
  validate(data){
      this.id=data.id;
      this.name=data.fname;
      this.sal=data.salary;
      this.dept=data.dept;
      this.users.push({empId:this.id,empName:this.name,empSal:this.sal,empDep:this.dept});
      this.disp="Data Inserted";
  }
  delete(del){
      this.users.splice(del,1)
    // document.getElementsByTagName('tr')[]
  }
  update(user){
    this.id1=user.id;
    this.name1=user.name;
    this.salary1=user.salary;
    this.department1=user.department;
    this.index=this.users.indexOf(user);
  }
  updated(){
    if(this.index!=null){
    this.users.splice(this.index,1,{id:this.id1,name:this.name1,salary:this.salary1,department:this.department1})
    this.index=null;}
  }
}