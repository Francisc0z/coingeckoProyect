import { Component, ElementRef, Input, OnInit, ViewChild } from '@angular/core';
import { CryptoComponent } from "src/app/components/crypto/crypto.component";


@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})

export class AppComponent implements OnInit{
  constructor( ) {  }
  ngOnInit(){
    
  }
  condicional=true;
  condicional2=false;
  condicional3=true;
  torf=false;
  torf2=false;
  ocultar=false;
  mostrar(){
    this.condicional2=!this.condicional2
    this.condicional=!this.condicional
  }
  mostrar2(){
    this.condicional=!this.condicional
    this.condicional2=!this.condicional2
  }
  recibirMensaje(variable:any){
    this.ocultar=variable;
    console.log("DIOSSS")
  }

}