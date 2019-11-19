function operarArrays(arrayX, arrayY, operaCllbk) {
    //Comprobamos que el tamaño de los arrays son el mismo
    if (arrayX.length == arrayY.length) {
        //Declaramos un array con la palabra var : cuyo ambito es de funcion
        //a diferencia de let de ES6, que si es ambito a nivel de bloque
        var arrayResultado = new Array(arrayX.length); //una manera de crear array
        for (let i = 0; i < arrayX.length; i++) {
            arrayResultado[i] = operaCllbk(arrayX[i], arrayY[i]);

        }

    }
    return arrayResultado;
}


//Otros ejemplos

var arrayEjemplo = [];  //Otra manera con notacion Json
//no indicamos el tamaño, por que en realidad los arrays de JS 
//son como los Arraylist<Object> de Java
//se parece mas incluso a un HashMap<Integer,object>

arrayEjemplo.push("Primer elemento");
arrayEjemplo[10] = "lo que sea";