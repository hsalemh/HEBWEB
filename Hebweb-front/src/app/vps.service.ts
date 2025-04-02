import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class VpsService {

  private apiUrl= 'http://loclahost:3036/api/vps'; // Url vers l'api à ajuster

  constructor(private http: HttpClient) { }

  getVpsOffers(): Observable<any[]>{
    return this.http.get<any[]>(this.apiUrl);
  }
}
