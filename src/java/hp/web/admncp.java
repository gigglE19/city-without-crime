/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hp.web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author sony
 */
public class admncp extends HttpServlet {

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
        String r=request.getParameter("name");
        ServletConfig cfg=getServletConfig();
        String c;
        c =cfg.getInitParameter("phn");
        String e=cfg.getInitParameter("emailid");
        try {
            
            HttpSession sess=request.getSession(false);
            
            if(sess!=null)
            {
        out.println("<head>");
        out.println("<title>ADMIN CONTROL PANEL</TITLE>");
        out.println("<link rel="+"stylesheet"+" href="+"sitestyle/democss.css"+"/>");
        out.println("</head>");
        out.println("<BODY>");
        out.println("<h1>WELCOME ADMIIN "+sess.getAttribute("uid")+": TO CONTROL PANEL</h1>");
        out.println("<hr>");
        out.println("<div id="+"menu"+"><ul>");
        out.println("<li><a href="+"#"+"CLASS="+"menu"+">COMPLAINT RECEIVED</A>");
        out.println("<li><a href="+"#"+"CLASS="+"menu"+">REPORT TO POLICE STATION</A>");
        out.println("<li><a href="+"#"+"CLASS="+"menu"+">ADD CRIMINAL RECORD</A>");
        out.println("<li><a href="+"#"+"CLASS="+"menu"+">EDIT CRIMINAL RECORD</A>");
        out.println("<li><a href="+"#"+"CLASS="+"menu"+">DELETE CRIMINAL RECORD</A>");
        out.println("<li><a href="+"off"+"CLASS="+"menu"+">LOGOUT</A><hr>");
        out.println("</ul></div>");
        }
            else
            {
                out.print("not logged in");
                out.println("<a href=loginpage.html>login here</a>");
            }
        }
        catch(Exception ex)
        {
            out.print("exception caught"+ex.getMessage());
        
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
