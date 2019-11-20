//JQuery(..) se abrevia como $(..)
jQuery(document).ready(function () {

    $("article").hide();

    jQuery("section").append("<div><p> LEYENDA DE LO QUE SEAS </p></div>");
    $(".articulo").append("<p>UN PARRAFOEN CADA ELEME CON CLASS = 'articulo' </p>");

    $("tr").append("<td>Info</td>"); //Añadir quinta col
    $("td:nth-child(5)").attr("style", "background-color: red;color: white");
    $("td:nth-child(5)").click(() => { alert('un click desde jq') });
    $("#otro_menu").html("<h2>Menu de articulos</h2><br/><br/>");

    $("article, section > section").each(function (index) {
        let idArticulo = "articulo_29juR_" + index
        $(this).attr("id",idArticulo );
        $("#otro_menu").append("<a href='#" + idArticulo + "' class= 'enlace-articulo'>Articulo nº " + index  + "</a>")
    });
/*
    $("#enlace_" + idArticulo).click(function(){
$(articuloActivo).slideUp(800);
$("#" + idArticulo).slideDown(1500);
articuloActivo = $("#" + idArticulo);
    });

    var articuloActivo;
*/

    $("#otro_menu a").click(function(){
        $("article").hide();
        let idHref=$(this).attr("href");
        $(idHref).slideToggle();
    });

    $("h1").mousemove(function(e){
        $(this).html("X Axis : " + e.pageX + " | Y Axis " + e.pageY);
        });
   
  /*  $("#otro_menu").click(function(){
       //$("#otro_menu").fadeOut();
       $("#otro_menu").slideUp();
    });*/
    $("footer").mouseenter(function () {
        $(".articulo").fadeOut();
    });
    $("h2").append("<button>");
});

