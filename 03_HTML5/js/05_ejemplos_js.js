
console.log("Mensaje ok");
console.error("Mensaje de error");
var VariableDinamica = "Ahora soy un texto";
document.write("<h1>Codigo generado con JS</h1>")
document.write("<p>VariableDinamica = " + VariableDinamica + "</p>");
document.write("No mas codigo spagetti. Es un anti-patron de diseño");
VariableDinamica = 999;
//Mediante el dom, generaamos un p y lo rellenamos: 
var parrafo = document.createElement("p");
var textoParrafo = document.createTextNode("varDinamica = " + VariableDinamica);
parrafo.appendChild(textoParrafo);
var body = document.getElementsByTagName("body")[0];
body.appendChild(parrafo);
var arrayParrafos = doc.getElementsByTagName("p");
for (p of arrayParrafos) {

    p.setAttribute("style", "background-color: lightgrey");
    //Cogemos del DOM, que se actualiza del hmtml
}
alert(body.innerHTML);

