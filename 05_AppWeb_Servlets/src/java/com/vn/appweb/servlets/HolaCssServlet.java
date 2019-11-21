
package com.vn.appweb.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author pc
 */
public class HolaCssServlet extends HttpServlet{
    
  @Override
  protected void doGet(HttpServletRequest peticionHttp, 
          HttpServletResponse respuestaHttp)throws IOException{
      

      respuestaHttp.setContentType("text/css");
      
      try  (PrintWriter salida = respuestaHttp.getWriter())
      {
          salida.println(" .color-rojo{background-color:red;}");
          for (int i = 0; i < 10; i++) {
              salida.print(" .iterar" +i +"{font-size: " + i*10 + "}");
          }
      }
      }
    
  }

