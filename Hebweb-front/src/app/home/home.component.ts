import { Component, OnInit } from '@angular/core';
import { CommonModule } from '@angular/common';
import { VpsService } from '../vps.service';

@Component({
  selector: 'app-home',
  standalone: true,
  imports: [CommonModule],
  templateUrl: './home.component.html',
  styleUrl: './home.component.css'
})
export class HomeComponent implements OnInit {

  vpsOffers: any[] = [];

  constructor (private vpsService: VpsService){}

  ngOnInit(): void {
    this.vpsService.getVpsOffers().subscribe((data)=>{
      this.vpsOffers= data;
    });
  }

}
