$(document).ready(function () {

    //Evento click del boton
    $("#btn_peticion_ajax_jq").click(function () {
        // Creamos la peticion AJAX
        $.ajax({
            "url": "./datosjson",
            "type": "GET",
            "success": function (respuestaJSon) {
                $("#div_datos_json").html(JSON.stringify(respuestaJSon));
            },
            "error": function (jqXHR, textStatus, errorThrown) {
                console.error("No se ha podido obtener la info");
                console.error(jqXHR);
                console.error(textStatus);
                console.error(errorThrown);
                if (jqXHR.status === 404) {
                    alert("URL no localizada");
                }
            }
        });
    });

    $("#btn_peticion_ajax_post").click(function () {

        let nombre = document.getElementById("nombre").value;
        let email = document.getElementById("email").value;
        if (!"" !== nombre && nombre.length > 1 && email !== "") {

            let expresionNombre = new RegExp("^[A-Z][a-z]+ ?[A-Za-z]*$");
            let expresionEmail = /^[_a-z0-9-]+(.[_a-z0-9-]+)*@[a-z0-9-]+(.[a-z0-9-]+)*(.[a-z]{2,4})$/;
            if (expresionNombre.test(nombre) && expresionEmail.test(email)) {
                let datosUsuario = {
                    // "nombre": document.getElementById("nombre").value,
                    // "email": document.getElementById("email").value
                    "nombre": nombre,
                    "email": email

                };

                $.post("./datosjson", datosUsuario, function (resp) {
                    $("#div_datos_json").html(JSON.stringify(resp));
                });
            } else {
                alert("Primera letra mayus,minimo una minuscula. Apell opcional");
            }
        } else {
            alert("Los datos no son validos MALDITA ESCORIA");

        }


    });

});