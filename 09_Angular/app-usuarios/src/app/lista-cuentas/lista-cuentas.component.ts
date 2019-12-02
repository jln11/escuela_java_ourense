import { Component, OnInit } from '@angular/core';
import { CuentaBanc } from '../modelo/CuentaBanc';
import { CuentasRestService } from '../cuentas-rest.service';


@Component({
  selector: 'app-lista-cuentas',
  templateUrl: './lista-cuentas.component.html',
  styleUrls: ['./lista-cuentas.component.css']
})
export class ListaCuentasComponent implements OnInit {

  arrayCuentas : CuentaBanc[];

  constructor(private srvCuentas : CuentasRestService) { 
    this.srvCuentas.alCambiar = () => {
      this.ngOnInit();
    };
  }

  ngOnInit() {
  this.srvCuentas.traerTodos().subscribe((cuentasTraidas: CuentaBanc[]) => {
    this.arrayCuentas= cuentasTraidas;
    console.log("Respuesta Ajax : " + cuentasTraidas.toString());
  });
console.log(">>>>>>> Llamada asincrona AJAX realizada");

  }

 public eliminar(id){
   this.srvCuentas.eliminarCuenta(id).subscribe();
 }
 


}
