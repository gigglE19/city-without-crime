/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hp.web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author sony
 */
public class logout extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            HttpSession s=request.getSession(false);
            if(s!=null)
            {
            s.invalidate();
            out.print("<PRE>LOGOUT SUCCESSFUL!!</PRE>");
            out.println("<br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>");
                out.println("<br><br><br><br><br><p valign="+"bottom"+" align="+"right"+"><font width="+"70px"+"height="+"70px"+">copyright&copy;</font> <img src="+"resource/ankur.jpg"+" width="+"70px"+"height="+"70px"+"></p>");
              
            }
            else
            {
                out.print("<h1 style=\"background-image: url(sitestyle/headerbg.jpg);background-repeat: repeat-x;height: 40px;text-align: center;padding-top: 10px\">SORRY!! ALREADY LOGGED OUT</h1>" +
"            <a href=loginpage1.jsp>TO login click here</a>");
            out.println("<br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>");
                out.println("<br><br><p valign="+"bottom"+" align="+"right"+"><font width="+"70px"+"height="+"70px"+">copyright&copy;</font> <img src="+"resource/ankur.jpg"+" width="+"70px"+"height="+"70px"+"></p>");
              
            }        
       
        }
        catch(Exception e)
        {
            out.print("exception caught"+e.getMessage());
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
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
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
