import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
 public heading='Angular 2 operation';
 public id: number = null;
 public name: String = "";
 public sal: number = null;
 public dept: String = "";

  validate() {
    alert(this.id + " " + this.name + " " + this.sal + " " + this.dept);
  }
}
