import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  public emp:any[]=[
  {empId:1011,empName:'Rahul',empSal:9000,empDep:'JAVA',empjoiningdate:'6/12/2014'},
  {empId:1002,empName:'Vikash',empSal:11000,empDep:'ORAAPS',empjoiningdate:'6/12/2017'},
  {empId:1003,empName:'Uma',empSal:12000,empDep:'JAVA',empjoiningdate:'6/12/2010'},
  {empId:1004,empName:'Sachin',empSal:11500,empDep:'ORAAPS',empjoiningdate:'11/12/2017'},
  {empId:1005,empName:'Amol',empSal:7000,empDep:'.NET',empjoiningdate:'1/1/2018'},
  {empId:1006,empName:'Vishal',empSal:17000,empDep:'BI',empjoiningdate:'9/12/2012'},
  {empId:1007,empName:'Rajita',empSal:21000,empDep:'BI',empjoiningdate:'6/7/2014'},
  {empId:1008,empName:'Neelima',empSal:81000,empDep:'TESTING',empjoiningdate:'6/17/2015'},
  {empId:1009,empName:'Daya',empSal:1000,empDep:'TESTING',empjoiningdate:'6/17/2016'} ];


  title = 'ques2';
  id:number=null;
  name:string="";
  salary="";
  department="";
  id1="";
  name1:string="";
  salary1="";
  department1="";
  index:number;
  users:any[]=[{
    id:1001,name:'name',salary:2000,department:'CSE'
  }];
  obj:Object;
  validate(){
    this.obj={id:this.id,name:this.name,salary:this.salary,department:this.department}
    this.users.push(this.obj);
  }
  delete(user){
      this.users.splice(this.users.indexOf(user),1)
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
  sortid(){
    this.emp=this.emp.sort(function(a,b){
      let n1=a.empId;
      let n2=b.empId;
      if(n1>n2) return 1;
      if(n1<n2) return -1;
    });}
    sortsal(){
      this.emp=this.emp.sort(function(a,b){
        return a.empSal - b.empSal;
      })}
  sortname(){
      this.emp=this.emp.sort(function(a,b){
        let n1=a.empName.toUpperCase();
        let n2=b.empName.toUpperCase();
        if(n1>n2) return 1;
        if(n1<n2) return -1;
      });

  }
  sortdept(){
    this.emp=this.emp.sort(function(a,b){
      let n1=a.empDep.toUpperCase();
      let n2=b.empDep.toUpperCase();
      if(n1>n2) return 1;
      if(n1<n2) return -1;
    });

}
}
