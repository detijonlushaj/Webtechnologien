import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { User } from './login/user';

@Injectable({ providedIn: 'root' })
export class RestCallService {
  constructor(private http: HttpClient) { }

  public putREST(username: string, password: string): Observable<User> {
    let url = 'http://localhost:8080/steam/resources/users/';
    let body = new User(username, password);
    let headers = { 'Content-Type': 'application/json' };
    return this.http.put<User>(url, body, { headers });
  }


}
