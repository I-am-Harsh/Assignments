import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { SearchlistComponent } from './searchlist/searchlist.component';
import { ProductlistComponent } from './productlist/productlist.component';


const routes: Routes = [{path:'',redirectTo:'/',pathMatch:'full'},
{path:'searchlist',component:SearchlistComponent},
{path:'productlist',component:ProductlistComponent}];
@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
