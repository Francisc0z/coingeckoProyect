import { Component, OnInit } from '@angular/core';
import { ServicioTransaccionService } from 'src/app/servicio-transaccion.service';
import { MostrarTransService } from 'src/app/mostrar-trans.service';
import { NgbModal } from '@ng-bootstrap/ng-bootstrap';
import { NombreCarteraService } from 'src/app/nombre-cartera.service';
import { EliminarTransaccionService } from 'src/app/eliminar-transaccion.service'
 

@Component({
  selector: 'app-cartera',
  templateUrl: './cartera.component.html',
  styleUrls: ['./cartera.component.css']
})
export class CarteraComponent implements OnInit {
  condicion=true;
  nombreCar:any;
  public listaTransacciones:Array<any>=[]
  public listaTransaccionesFiltrada:Array<any>=[]
  titles: string[]=[
    'Modena',
    'Costo',
    'Tipo',
    'Fecha',
    'Eliminar'
  ];
  
  constructor(private servicioTransaccion: ServicioTransaccionService, 
  private mostrarTrans: MostrarTransService, private modalService: NgbModal,
  private nombreCartera:NombreCarteraService, private eliminarTransaccion: EliminarTransaccionService) { }
  ngOnInit(){
    this.servicioTransaccion.disparadorTransacciones.subscribe(transaccion => {
      this.listaTransacciones.push(transaccion);
    })
    this.mostrarTrans.disparadorMostrar.subscribe((condicion) => {
      this.condicion = condicion; // mostrar transacciones
    });
    this.nombreCartera.disparadorNombre.subscribe((nombreCar) => {
      this.nombreCar = nombreCar; // paso el nombre
      for (let index = 0; index < this.listaTransacciones.length; index++) {
        if (this.nombreCar==this.listaTransacciones[index].cartera) {
          this.listaTransaccionesFiltrada[index]=this.listaTransacciones[index];
          console.log("bien")
        }else{
          
        }
      }
    });
  }
  eliminarM(modal: any){
    this.modalService.open(modal)
  };
  EliminarTransaccion(valor:any, precio:any){
    this.listaTransaccionesFiltrada.splice(valor,1)
    console.log(precio)
    this.eliminarTransaccion.disparadorEliminarTransaccion.emit(precio)
  }
  
}
