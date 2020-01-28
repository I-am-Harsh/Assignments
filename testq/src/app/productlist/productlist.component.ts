import { Component, OnInit } from '@angular/core';
import { ListserviceService } from '../listservice.service';

@Component({
  selector: 'app-productlist',
  templateUrl: './productlist.component.html',
  styleUrls: ['./productlist.component.css']
})
export class ProductlistComponent implements OnInit {

  constructor(private _list:ListserviceService) { }
  
  my=[];

  ngOnInit() {
    this._list.getList()
    .subscribe(Data =>this.my=Data )
  }
  delete(i)
  {
    this.my.splice(this.my.indexOf(i),1)
  }

}
