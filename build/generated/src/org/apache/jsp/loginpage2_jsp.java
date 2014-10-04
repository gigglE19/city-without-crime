package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class loginpage2_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body bgcolor=\"#F0F2CF\">\n");
      out.write("        \n");
      out.write("        <div align=\"right\">\n");
      out.write("\t<form action=\"Auth\" method=\"post\">\n");
      out.write("            \n");
      out.write("           LOGIN ID :  <input type=\"text\" name=\"userid\" />\n");
      out.write("           \n");
      out.write("           PASSWORD : <input type=\"password\" name=\"pass\" />\n");
      out.write("             \n");
      out.write("                      <input type=\"submit\" value=\"LOGIN\" />\n");
      out.write("            \n");
      out.write("        </form>\n");
      out.write("        </div>\n");
      out.write("        <table width=\"100%\" height=\"100%\"  >\n");
      out.write("            <tr  height=\"200px\">\n");
      out.write("                <td colspan=\"3\" style=\"background-image: url(images/bgimage.jpg)\" >      \n");
      out.write("               <div align=\"left\"><img src=\"images/logo_safecity.png\" alt=\"\" width=\"200px\" height=\"200px\" border=\"0\" /></div>\n");
      out.write("      </td>\n");
      out.write("</tr>\n");
      out.write("    \n");
      out.write("<tr><td colspan=\"3\" style=\"background-color: #ccccc\">\n");
      out.write("<table width=\"100%\" border=\"\" cellspacing=20% cell padding=50%>\n");
      out.write("<tr>\n");
      out.write("<td align=\"middle\"><a href=\"home.htm\">HOME</a>\n");
      out.write("</td>\n");
      out.write("<td align=\"middle\"><i>\n");
      out.write("<a href=\"aboutus.htm\">ABOUT US</a>\n");
      out.write("</td>\n");
      out.write("<td align=\"middle\"><a href=\"books.htm\">COMPLAIN</a>\n");
      out.write("</td>\n");
      out.write("<td align=\"middle\"><a href=\"characters.htm\">STATION LIST</a>\n");
      out.write("</td>\n");
      out.write("<td align=\"middle\"><a href=\"gallery.htm\">GALLERY</a>\n");
      out.write("</td>\n");
      out.write("<td align=\"middle\"><a href=\"author.htm\">CONTACT US</a>\n");
      out.write("</td></i>\n");
      out.write("</tr>\n");
      out.write("<center>\n");
      out.write("</table>  \n");
      out.write("</tr>\n");
      out.write("<tr>    \n");
      out.write("    <td width=\"20%\" >\n");
      out.write("          <table cellspacing=\"0\" cellpadding=\"0\" class=\"left_block\" border=\"\" width=\"100%\" height=\"100%\" style=\"float:left; clear:both;\">\n");
      out.write("    <tr>\n");
      out.write("        <td height=\"20%\" class=\"left_block_header\" bgcolor=\"#b22d00\"><center><b><h2>OUR VISION</h2></b></center></td>\n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("    <td height=\"80%\"  valign=\"center\" align=\"center\" style=\"padding:5px;\">\n");
      out.write("        <br>\n");
      out.write("        <div class=\"start\" style=\"float:left; width:30px;\"><img src=\"images/start_comment.jpg\" alt=\"\" align=\"left\" /></div>\n");
      out.write("                        <font face=\"Verdana, Arial, Helvetica, sans-serif\">\n");
      out.write("                        There is no happiness except in the realization that we have accomplished something. </font>\n");
      out.write("        <div class=\"end\" style=\"float:right; width:30px;\"><img src=\"images/end_comment.jpg\" alt=\"\" /></div>\n");
      out.write("    <div id=\"separator\">&nbsp;</div>\n");
      out.write("\t</td>\n");
      out.write("  </tr>\n");
      out.write("</table>\n");
      out.write("  <td width=\"50%\" height=\"30\" align=\"center\">\n");
      out.write("      <table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\"class=\"center_block\">\n");
      out.write("      <tr>\n");
      out.write("      <marquee behavior=\"scroll\" direction=\"left\" onmouseover=\"this.stop();\" onmouseout=\"this.start();\" scrollamount=\"4\">\n");
      out.write("          <img src=\"images/Argentina.png\" width=\"200px\" height=\"200px\" alt=\"\" />\n");
      out.write("          <img src=\"images/201395164440893.jpg\" width=\"200px\" height=\"200px\" alt=\"\" />\n");
      out.write("          <img src=\"images/2231161984_e39301f260_m.jpg\" width=\"200px\" height=\"200px\" alt=\"\" />\n");
      out.write("          <img src=\"images/2010-SafeCommunity-story-image.jpg\" width=\"200px\" height=\"200px\" alt=\"\" />\n");
      out.write("          <img src=\"images/13_thumb1-685x320.jpg\" width=\"200px\" height=\"200px\" alt=\"\" />\n");
      out.write("      </marquee>\n");
      out.write("        \n");
      out.write("</tr>\n");
      out.write("     <tr>\n");
      out.write("        \n");
      out.write("         <td width=\"95\" align=\"left\" class=\"left_block_header\">    <div  align=\"left\"><img src=\"images/help-line-head.png\" width=\"95\" height=\"32\" alt=\"\" /></div></td>\n");
      out.write("             <td><div>\n");
      out.write("             <marquee behavior=\"scroll\" direction=\"left\" onmouseover=\"this.stop();\" onmouseout=\"this.start();\" scrollamount=\"4\">\n");
      out.write("        <img src=\"images/healp-line-bullet.png\" width=\"11\" height=\"13\" alt=\"\" />&nbsp;PCR : <span>100 (24X7) (Toll Free)</span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<img src=\"images/healp-line-bullet.png\" width=\"11\" height=\"13\" alt=\"\" />&nbsp;Eyes and Ears : <span>1090 (Toll Free)</span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<img src=\"images/healp-line-bullet.png\" width=\"11\" height=\"13\" alt=\"\" />&nbsp;Women in distress : <span>1091</span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<img src=\"images/healp-line-bullet.png\" width=\"11\" height=\"13\" alt=\"\" />&nbsp;Special Cell (North-Eastern States) : <span>1093</span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<img src=\"images/healp-line-bullet.png\" width=\"11\" height=\"13\" alt=\"\" />&nbsp;Missing Persons : <span>1094, 23241210</span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<img src=\"images/healp-line-bullet.png\" width=\"11\" height=\"13\" alt=\"\" />&nbsp;Traffic : <span>1095, 25844444</span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<img src=\"images/healp-line-bullet.png\" width=\"11\" height=\"13\" alt=\"\" />&nbsp;Senior Citizen : <span>1291</span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<img src=\"images/healp-line-bullet.png\" width=\"11\" height=\"13\" alt=\"\" />&nbsp;Vigilance : <span>1064</span>\n");
      out.write("        </marquee>\n");
      out.write("        </div> \n");
      out.write("         </td>\n");
      out.write("       \n");
      out.write("        \n");
      out.write("     </tr>\n");
      out.write("            </table>\n");
      out.write("  </td>\n");
      out.write("  <td height=\"30\" class=\"right_block_header\" >\n");
      out.write("       <table cellspacing=\"0\" cellpadding=\"0\" class=\"left_block\" border=\"\" width=\"100%\" height=100%\">\n");
      out.write("    <tr>\n");
      out.write("    <td height=\"30\" class=\"left_block_header\" bgcolor=\"#FFC088\"><center><b> <h2>News and Announcements</h2></b></center></td>\n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("        <td>\n");
      out.write("      <div id=\"news_scroll\" align=\"left\">\n");
      out.write("        <marquee behavior=\"scroll\" scrollamount=\"2\" direction=\"up\" onmouseover=\"this.stop()\" onmouseout=\"this.start()\" >\n");
      out.write("          <ul>\n");
      out.write("              * Bomb blast in delhi.<br>\n");
      out.write("              * 25 students died in manali.<br>\n");
      out.write("              * Modi to be next PM of INDIA.<br>\n");
      out.write("              </ul>\n");
      out.write("<div align=\"right\" id=\"news_more\">\n");
      out.write("  <a href=\"/Main/pages/Main_News.html\">more...</a>\n");
      out.write("</div>\n");
      out.write("        </marquee> \n");
      out.write("      </div>\n");
      out.write("        </td>\n");
      out.write("    </tr>\n");
      out.write("        </table>\n");
      out.write("</td>\n");
      out.write("<tr>\n");
      out.write("    <td>\n");
      out.write("      <table cellspacing=\"0\" cellpadding=\"0\" class=\"left_block\" border=\"\" width=\"100%\" height=\"100%\" style=\"float:left; clear:both;\">\n");
      out.write("          <tr>\n");
      out.write("              <td height=\"30\" class=\"left_block_header\" bgcolor=\"#F6D0AF\"><center><b><h2>CRIMINAL NEWS</h2></b></center></td>\n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("        <td height=\"80\">\n");
      out.write("   <div class=\"left-side-page-index\">\n");
      out.write("  <div style=\"width:250px;height:375px;line-height:3em;overflow:scroll;padding:5px;background-color:#FCFADD;color:#714D03;border:4px double #DEBB07;\">\n");
      out.write("This 'div' element uses 'overflow:scroll' to create scrollbars whenever the contents of the 'div' become too large. \n");
      out.write("   </div>\n");
      out.write("    </div>\n");
      out.write("        </td>\n");
      out.write("    </tr>\n");
      out.write("        </table>\n");
      out.write("        <td width=\"60%\" height=\"30\" align=\"center\">\n");
      out.write("            <div id=\"respond\">\n");
      out.write("          <h2>Write A Complaint</h2>\n");
      out.write("        <form action=\"complaint.jsp\" method=\"post\">\n");
      out.write("          <p>\n");
      out.write("            <input type=\"text\" name=\"id\" id=\"name\" value=\"\" size=\"22\" />\n");
      out.write("            <label for=\"name\"><small>COMPLAINT ID (required)</small></label>\n");
      out.write("          </p>\n");
      out.write("          \n");
      out.write("          <p>\n");
      out.write("            <input type=\"text\" name=\"criminalname\" id=\"email\" value=\"\" size=\"22\" />\n");
      out.write("            <label for=\"email\"><small>CRIMINAL NAME (optional)</small></label>\n");
      out.write("          </p>\n");
      out.write("          <p>\n");
      out.write("            <input type=\"text\" name=\"pid\" id=\"email\" value=\"\" size=\"22\" />\n");
      out.write("            <label for=\"email\"><small>P.S. ID (required)</small></label>\n");
      out.write("          </p>\n");
      out.write("          \n");
      out.write("          <U>DESCRIPTION:</U>\n");
      out.write("          <p>\n");
      out.write("            <textarea name=\"description\" id=\"comment\" cols=\"60%\" rows=\"8\"></textarea>\n");
      out.write("            <label for=\"comment\" style=\"display:none;\"><small>Comment (required)</small></label>\n");
      out.write("          </p>\n");
      out.write("          <p>\n");
      out.write("            <input name=\"submit\" type=\"submit\" id=\"submit\" value=\"Submit Complaint\" />\n");
      out.write("            &nbsp;\n");
      out.write("            <input name=\"reset\" type=\"reset\" id=\"reset\" tabindex=\"5\" value=\"Reset\" />\n");
      out.write("          </p>\n");
      out.write("        </td>\n");
      out.write("       \n");
      out.write("    <td height=\"30\" class=\"right_block_header\" align=\"right\" >   \n");
      out.write("        <table cellspacing=\"0\" cellpadding=\"0\" class=\"left_block\" border=\"\" width=\"100%\" height=100% \">\n");
      out.write("    <tr>\n");
      out.write("        <td height=\"10\" class=\"left_block_header\" bgcolor=\"#FFC088\"><center><b><h2>WANTED </h2></b></center></td>\n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("    <td height=\"80\"  valign=\"center\" align=\"center\">\n");
      out.write("       <marquee behavior=\"scroll\" direction=\"left\" onmouseover=\"this.stop();\" onmouseout=\"this.start();\" scrollamount=\"4\">\n");
      out.write("        <img src=\"images/Untitled_1.jpg\" width=\"100%\" height=\"100%\" alt=\"\" />\n");
      out.write("         <img src=\"images/Untitled_1.jpg\" width=\"100%\" height=\"100%\" alt=\"\" />\n");
      out.write("          <img src=\"images/Untitled_1.jpg\" width=\"100%\" height=\"100%\" alt=\"\" />\n");
      out.write("           <img src=\"images/Untitled_1.jpg\" width=\"100%\" height=\"100%\" alt=\"\" />\n");
      out.write("            <img src=\"images/Untitled_1.jpg\" width=\"100%\" height=\"100%\" alt=\"\" />\n");
      out.write("           \n");
      out.write("       </marquee>\n");
      out.write("       </td>\n");
      out.write("  </tr>\n");
      out.write("</table>\n");
      out.write("        </td>\n");
      out.write("</tr>\n");
      out.write("  </table>\n");
      out.write("  \n");
      out.write("\n");
      out.write("\n");
      out.write("<br>\n");
      out.write(" \n");
      out.write("\n");
      out.write("<hr>\n");
      out.write("<div class=\"footer-main\">\n");
      out.write("  <div class=\"footer\">\n");
      out.write("    <table border=\"0\" align=\"center\" cellpadding=\"0\" cellspacing=\"0\">\n");
      out.write("      <tr>\n");
      out.write("          <td>\n");
      out.write("              <a href=\"/student_panel_new/\" target=\"_blank\" class=\"top\"><b>Home</b></a>\n");
      out.write("\n");
      out.write("\t<span class=\"style5\">|</span> <a href=\"certificate.asp\" class=\"top\"><b>About Us</b></a>\t\n");
      out.write("\t<span class=\"style5\">|</span> <a href=\"colleges.asp\" class=\"top\"><b>Stations List</b></a>\t\n");
      out.write("\t<span class=\"style5\">|</span> <a href=\"contactus.asp\" class=\"top\"><b>Contact Us</b></a>\n");
      out.write("          </td></tr>\n");
      out.write("      <tr><br>\n");
      out.write("       <td align=\"center\"><br>Copyright&copy;CWC_2014 All Right Reserved </td>\n");
      out.write("        <td align=\"right\">&nbsp;</td>\n");
      out.write("     \n");
      out.write("      </tr>\n");
      out.write("    </table>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
