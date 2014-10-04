/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hp.web;
import java.sql.*;
import dao.daoservice;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author sony
 */
public class authentication extends HttpServlet {

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
        String u=request.getParameter("name");
        String p=request.getParameter("pass");
        String q="select * from login where userid='"+u+"' and password='"+p+"'";
        ResultSet rs=daoservice.selectdata(q);
        ServletContext cts=getServletContext();
        String cr=cts.getInitParameter("copyright");
        try
        {
            if(rs.next())
            {
            HttpSession session=request.getSession();
            session.setAttribute("uid",u);
            String r=rs.getString(3);
            if(r.equals("admin"))
            {
                RequestDispatcher rd=request.getRequestDispatcher("inboxcp.jsp");
                rd.include(request,response);
                out.println("<br><br><br><br><br><br><br><br><br><br><br>");
                out.println("<br><br><br><br><br><p valign="+"bottom"+" align="+"right"+"><font width="+"70px"+"height="+"70px"+">copyright&copy;</font> <img src="+"resource/ankur.jpg"+" width="+"70px"+"height="+"70px"+"></p>");
            }
            else if(r.equals("user"))
            {
                  RequestDispatcher rd=request.getRequestDispatcher("user.jsp");
                rd.include(request,response);
             out.println("<br><br><br><br><br><br><br><br><br><br><br>");
                out.println("<br><br><br><br><br><p valign="+"bottom"+" align="+"right"+"><font width="+"70px"+"height="+"70px"+">copyright&copy;</font> <img src="+"resource/ankur.jpg"+" width="+"70px"+"height="+"70px"+"></p>");
              
            }
            }
            else
            {
               out.print("<pre><font color="+"red"+">invalid user id and password!!</font></pre>");
                out.print("<br><a href="+"loginpage1.jsp"+"><u>login again</a>");
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
