import { Component } from '@angular/core';
import { FormGroup, FormControl,FormBuilder,Validators} from '@angular/forms';
@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  category: string[] = [
    'Electronics',
    'Grocery',
    'Mobile',
    'Cloth'
  ];
  checkedList = [];
  online:any[]=['Yes','No'];
  products:any[]=['BigBazar','D-Mart','Alliance','Mega Store'];
   userform: FormGroup; 
  constructor(){}
  ngOnInit(){
  }
  validate(userforms){
      console.log("Form Submitted!");
      
      console.log(userforms.value);
      console.log(this.checkedList);
}
onCheckboxChange(option, event) {
  if(event.target.checked) {
    this.checkedList.push(option);
  } else {
  for(var i=0 ; i < this.products.length; i++) {
    if(this.checkedList[i] == option) {
      this.checkedList.splice(i,1);
   }
 }
  }}
}
