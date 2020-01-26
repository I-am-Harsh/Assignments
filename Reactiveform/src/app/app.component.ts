import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'formdemo';

  onClickSubmit(data)
  {
    alert("Entered Email id is: " + data.emailid);
    alert("Entered Password is: " + data.passwd);
  }
}
