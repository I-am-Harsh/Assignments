import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { SearchlistComponent } from './searchlist/searchlist.component';
import { ProductlistComponent } from './productlist/productlist.component';
import { HttpClientModule} from '@angular/common/http';
import { PipesPipe } from './pipes/pipes.pipe'

@NgModule({
  declarations: [
    AppComponent,
    SearchlistComponent,
    ProductlistComponent,
    PipesPipe
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
