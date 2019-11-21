/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vn.appweb.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Creando un formulario y recibiendo sus campos como parametros
 *
 * @author pc
 */
public class ParamServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param peticionHttp servlet request
     * @param respuestaHttp servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest peticionHttp, HttpServletResponse respuestaHttp)
            throws ServletException, IOException {

        respuestaHttp.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = respuestaHttp.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Form y Param</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ParamServlet at " + peticionHttp.getContextPath() + "</h1>");
            out.println("<h2>Formulario de registro</h2>");
            //capmos a enviar:nombre e email,obligatorios y con su validacion html5
            out.println("<form name='formDatos' action='./formulario' method='POST' >");
            out.println(" <label>Nombre: </label>");
            out.println(" <input id='nombre_user' name ='nombre_user' required />");
            out.println(" <br/><br/><label>Email: </label>");
            out.println(" <input type='email' id='email_user' name ='email_user' required/>");
            out.println(" <input type='submit' value ='Envia parametros'/>");
            out.println("</form>");/*
            String valorCampo = peticionHttp.getParameter("nombre_campo");
            String valorNombre = peticionHttp.getParameter("nombre_user");
            String valorEmail = peticionHttp.getParameter("email_user");
            
            if (valorNombre==null || "".equals(valorNombre) || valorEmail==null || "".equals(valorEmail)  ) {
                out.println("<p style='color: red'>No se ha recibido algun parametro</p>");
            }else {
 
             out.println("<p style='color: green'>nombre usuario: " + valorNombre.toUpperCase() + "</p>");
             out.println("<p style='color: green'>email usuario: " + valorEmail.toLowerCase() + "</p>");
            }*/
            out.println("</body>");
            out.println("</html>");
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest peticionHttp, HttpServletResponse respuestaHttp)
            throws ServletException, IOException {

        respuestaHttp.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = respuestaHttp.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Form y Param</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ParamServlet at " + peticionHttp.getContextPath() + "</h1>");
            out.println("<h2>Formulario de registro</h2>");
            //capmos a Recibir:nombre e email,obligatorios y con su validacion html5

            String valorNombre = peticionHttp.getParameter("nombre_user");
            String valorEmail = peticionHttp.getParameter("email_user");

            if (valorNombre == null || "".equals(valorNombre) || valorEmail == null || "".equals(valorEmail)) {
                out.println("<p style='color: red'>No se ha recibido algun parametro</p>");
            } else {

                out.println("<p style='color: green'>nombre usuario: " + valorNombre.toUpperCase() + "</p>");
                out.println("<p style='color: green'>email usuario: " + valorEmail.toLowerCase() + "</p>");
            }

            //Vamos a insertar los datos recibidos
            //jdbc:derby://localhost:1527/db_prueba
            try {

                Class.forName("org.apache.derby.jdbc.ClientDriver");
                DriverManager.registerDriver(new org.apache.derby.jdbc.EmbeddedDriver());
            } catch (Exception ex) {
                Logger.getLogger(ParamServlet.class.getName()).log(Level.SEVERE, null, ex);
                out.println("<p stylr='color:red'> No se ha cargado DerbyDB </p>");
            }

            try (Connection con = DriverManager.getConnection(
                    "jdbc:derby://localhost:1527/db_prueba",
                    "root",
                    "1234")) {
                
                String sqlQuery = "insert into persona (nombre,email) values ('" + valorNombre + "' , '" + valorEmail +"')" ;
                Statement sentenciaSQL = con.createStatement();
                sentenciaSQL.executeUpdate(sqlQuery);
                
                
            } catch (SQLException ex) {
                out.println("<p style='color: red'> Error SQL: " + ex.getMessage() + "</p>");
                Logger.getLogger(ParamServlet.class.getName()).log(Level.SEVERE, null, ex);
            }

            out.println("</body>");
            out.println("</html>");
        }

    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Servlet que envia formulario y recibe un parametro";
    }// </editor-fold>

}
