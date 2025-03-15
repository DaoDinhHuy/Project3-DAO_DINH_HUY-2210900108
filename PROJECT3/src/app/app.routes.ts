import { Routes } from '@angular/router';
import { HomeComponent } from './home/home.component';
import { OrderComponent } from './order/order.component'
import { OrderConfirmComponent} from './order-confirm/order-confirm.component'
import {DetailProductComponent} from './detail-product/detail-product.component';
export const routes: Routes = [
  { path: '', component: HomeComponent }
];
