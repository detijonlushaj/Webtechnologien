"use strict";

function login(){
    var username = document.getElementById("id_username").innerHTML;
    var passwort = document.getElementById("id_password").innerHTML;
    alert("Eigegebener Username: "+ username.innerHTML + "\n Eigegebenes Passwort:" + passwort.innerHTML);

    //rufe funktion Boolean login(String username, String pwd) von SteamService.java auf 
    var xhr = new XMLHttpRequest();
    xhr.open("GET","http://localhost:8080/steam/api/users/",true);
    xhr.onreadystatechange = function(){
        if(xhr.readyState == 4) {
            var userDaten = JSON.parse(xhr.responseText);
        }

        for (var user of userDaten) 
        {
            if( username == user.username ){
                if(passwort == user.password){
                    window.location.href="series.html";
                }
            }
        }

    }
    

}

let btn_login = document.getElementById("id_login");
btn_login.onclick = login;