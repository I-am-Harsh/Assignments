import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { list } from './xyz'

@Injectable({
  providedIn: 'root'
})
export class ListserviceService {

  constructor(private http: HttpClient) { }
  private _url: string = "./assets/booklist.json";
  getList(): Observable<list[]> {
    return this.http.get<list[]>(this._url);
  }

}
