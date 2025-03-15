import { bootstrapApplication } from '@angular/platform-browser';
import { RegisterComponent } from './app/register/register.component';
import {DetailProductComponent} from './app/detail-product/detail-product.component';
import {HomeComponent} from './app/home/home.component';

bootstrapApplication(HomeComponent)
  .catch(err => console.error(err));

