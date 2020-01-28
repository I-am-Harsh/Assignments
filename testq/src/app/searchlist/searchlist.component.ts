import { Component, OnInit } from '@angular/core';
import { ListserviceService } from '../listservice.service';

@Component({
  selector: 'app-searchlist',
  templateUrl: './searchlist.component.html',
  styleUrls: ['./searchlist.component.css']
})
export class SearchlistComponent implements OnInit {

  constructor(private _list: ListserviceService) { }
  my = [];
  ngOnInit() {

  }
  show() {
    this._list.getList()
      .subscribe(Data => this.my = Data)
  }
}
