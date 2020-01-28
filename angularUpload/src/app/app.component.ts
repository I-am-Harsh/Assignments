import { Component } from '@angular/core';
import { BookService } from './service/book.service';
import{HttpClient} from'@angular/common/http';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'bookServicePipes';
  term2="";
  term3="";
  term4="";
  term1="";

  constructor(private ob:BookService){}
  booksData;

  ngOnInit()
  {
    this.ob.getData().subscribe(data=>{this.booksData=data});
  }
}
