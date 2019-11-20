//Manera EcmaScript 5
function GestorEventosES5(inputId, btnId, divInfoId) {
    this.input = document.getElementById(inputId);
    this.boton = document.getElementById(btnId);
    this.divInfo = document.getElementById(divInfoId);

    this.input.value = "Se ha cogido el INPUT";

    GestorEventosES5.prototype.funCallbkAlPulsar = function (evento) {
        this.input.value = "Tipo evento: " + evento.type;
        this.boton.value = "Chooooooooorpechaaaaa";
        this.boton.className = "btn-tamano";
       document.getElementsByTagName("body")[0].className="fondo";
       this.boton.className = "boton-color";
    


    }
    GestorEventosES5.prototype.funCallbkonClick_2 = (evento) => {
        this.input.style = "background-color : lightblue";

        this.divInfo.innerHTML +="evento.currentTarget.id = " + evento.currentTarget.id;
        this.divInfo.className = "div-marco";
        evento.currentTarget.removeEventListener("click" , this.funCallbkAlPulsarBIND);

    }

    this.boton.addEventListener("click", this.funCallbkAlPulsar.bind(this));
    this.boton.addEventListener("click",this.funCallbkonClick_2);
}


//Manera EcmaScript 6
class GestorEventosES6 {
 constructor (inputId, btnId, divInfoId){
 this.input = document.getElementById(inputId);
 this.boton = document.getElementById(btnId);
 this.divInfo = document.getElementById(divInfoId);

 
 this.boton.addEventListener("click", this.funCallbkAlPulsar.bind(this));
 this.boton.addEventListener("click",this.funCallbkonClick_2);
}
funCallbkAlPulsar (evento) {
    this.input.value = "Tipo evento: " + evento.type;
}
funCallbkonClick_2 = (evento) => {
    this.input.style = "background-color : lightblue;";
}



}