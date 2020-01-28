import { Injectable } from '@angular/core';
import { HttpClient, HttpClientModule} from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class BookService {

  constructor(private http:HttpClient) { }

  getData()
  {
    return this.http.get('../assets/booklist.json');
  }
}
