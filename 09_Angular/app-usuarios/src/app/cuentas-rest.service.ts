import { Injectable } from '@angular/core';
import {Observable, observable} from 'rxjs';
import {HttpClient, HttpHeaders} from '@angular/common/http';
import { CuentaBanc } from './modelo/CuentaBanc';
import { dashCaseToCamelCase } from '@angular/compiler/src/util';


//objeto que Angular se encarga de instanciar como un Singleton 
@Injectable({
  providedIn: 'root'
})
export class CuentasRestService {

  //infiere o deduce el tipo a partir del valor ("" es String)
urlApiRest = "http://localhost:8080/cuentas";
httpOptions = {
headers : new HttpHeaders({
  'Content-Type': 'application/json'
})

}

alCambiar: any;

  constructor(private httpCli: HttpClient) { }

  public add(nuevaCuenta : CuentaBanc , lambda: any) : Observable<CuentaBanc> 
  {
  let observable : Observable<CuentaBanc> = this.httpCli.post<CuentaBanc>(this.urlApiRest, nuevaCuenta, this.httpOptions);
  observable.subscribe((datos) =>{
  this.alCambiar(datos);  
  lambda(datos);
});
return observable;
}
  public traerTodos()  : Observable<CuentaBanc[]> {
  return this.httpCli.get<CuentaBanc[]>(this.urlApiRest);

  }

  public eliminarCuenta(id:number){
    return this.httpCli.delete(this.urlApiRest + "/" + id);
    console.log("Eliminado " + id);
  }


}

