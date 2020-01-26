import { Component } from '@angular/core';
import { FormGroup, FormControl} from '@angular/forms';
import { fromEventPattern } from 'rxjs';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'form2demo';

  emailid;
  formdata;
  
  constructor(){

  }

  ngOnInit(){
    this.formdata = new FormGroup({
        emailid: new FormControl("sample@gmail.com"),
        passwd: new FormControl("123")
    });
  }

  onClickSubmit(data) {this.emailid = data.emailid}


}
