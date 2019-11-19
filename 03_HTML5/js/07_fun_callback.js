//Nomenclatura tipica de function en variable
let suma = function(x,y){
    return x + y;
}

//Nomenclatura tipica de function
function multiplica(x,y){
    return x * y;
}

//nomenclatura de objeto function
let divide = new Function ("x","y", "return x /y;");

//Nomenclatura de funcion flecha
let resta = (x , y) => {
    return x - y;
}


function punto(x,y){
    //Usando templates strings de ES6
      return  `(${x} , ${y})`;

   // let retorno = "(" + x + "," + y + ")";
//return retorno

}