import { Component, OnInit } from '@angular/core';
import { RestCallService } from '../rest-call.service';
import { User } from './user';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent {
  public user: User;
  public username: string;
  public password: string;

  public error: string;

  constructor(private rest: RestCallService) {ß
    // initialisiere Attribute
    this.username = "";
    this.password = "";
    this.user = new User(this.username, this.password);
    this.error = "";
  }

  login(): void {
    this.rest.putREST(this.username, this.password)
      .subscribe(
        (erg: User) => {
          if (this.username == erg.username && this.password == erg.password) {
            this.username = erg.username;
            this.password = erg.password
            this.error = 'login hat geklappt'
          }
        },
        error => { this.error = 'Fehler aufgetaucht - Login fehlgeschlagen'; }
      );

  }

}
