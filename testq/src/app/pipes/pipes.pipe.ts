import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'pipes'
})
export class PipesPipe implements PipeTransform {

  transform(my: any, search: any): any {
    if(search==undefined)
    return ; 

    return my.filter(function(my:any){
      return my.title.toLowerCase().includes(search.toString().toLowerCase())
    });
  }

}
