package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class lastlogin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.1//EN\" \"http://www.w3.org/TR/xhtml11/DTD/xhtml11.dtd\">\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\" xml:lang=\"en\">\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("  <title>ARaynorDesign Template</title>\n");
      out.write("  <meta name=\"description\" content=\"free website template\" />\n");
      out.write("  <meta name=\"keywords\" content=\"enter your keywords here\" />\n");
      out.write("  <meta http-equiv=\"content-type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("  <meta http-equiv=\"X-UA-Compatible\" content=\"IE=9\" />\n");
      out.write("  <link rel=\"stylesheet\" type=\"text/css\" href=\"res/style1.css\" />\n");
      out.write("  <script type=\"text/javascript\" src=\"res/jquery.min.js\"></script>\n");
      out.write("  <script type=\"text/javascript\" src=\"res/image_slide.js\"></script>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("  <div id=\"main\">\n");
      out.write("    <div id=\"header\">\n");
      out.write("\t  <div id=\"banner\">\n");
      out.write("\t    <div id=\"welcome\">\n");
      out.write("\t      <h1>Grey Theme</h1>\n");
      out.write("\t    </div><!--close welcome-->\n");
      out.write("\t    <div id=\"welcome_slogan\">\n");
      out.write("\t      <h1>Your Company Slogan Here</h1>\n");
      out.write("\t    </div><!--close welcome_slogan-->\n");
      out.write("\t  </div><!--close banner-->\n");
      out.write("    </div><!--close header-->\n");
      out.write("\n");
      out.write("\t<div id=\"menubar\">\n");
      out.write("      <ul id=\"menu\">\n");
      out.write("        <li class=\"current\"><a href=\"index.html\">Home</a></li>\n");
      out.write("        <li><a href=\"ourwork.html\">Our Work</a></li>\n");
      out.write("        <li><a href=\"testimonials.html\">Testimonials</a></li>\n");
      out.write("        <li><a href=\"projects.html\">Projects</a></li>\n");
      out.write("        <li><a href=\"contact.html\">Contact Us</a></li>\n");
      out.write("      </ul>\n");
      out.write("    </div><!--close menubar-->\t\n");
      out.write("    \n");
      out.write("\t<div id=\"site_content\">\t\t\n");
      out.write("\n");
      out.write("\t  <div class=\"sidebar_container\">       \n");
      out.write("\t\t<div class=\"sidebar\">\n");
      out.write("          <div class=\"sidebar_item\">\n");
      out.write("            <h2>New Website</h2>\n");
      out.write("            <p>Welcome to our new website. Please have a look around, any feedback is much appreciated.</p>\n");
      out.write("          </div><!--close sidebar_item--> \n");
      out.write("        </div><!--close sidebar-->     \t\t\n");
      out.write("\t\t<div class=\"sidebar\">\n");
      out.write("          <div class=\"sidebar_item\">\n");
      out.write("            <h2>Latest Update</h2>\n");
      out.write("            <h3>September 2012</h3>\n");
      out.write("            <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Pellentesque cursus tempor enim.</p>         \n");
      out.write("\t\t  </div><!--close sidebar_item--> \n");
      out.write("        </div><!--close sidebar-->\n");
      out.write("\t\t<div class=\"sidebar\">\n");
      out.write("          <div class=\"sidebar_item\">\n");
      out.write("            <h3>September 2012</h3>\n");
      out.write("            <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Pellentesque cursus tempor enim.</p>         \n");
      out.write("\t\t  </div><!--close sidebar_item--> \n");
      out.write("        </div><!--close sidebar-->  \n");
      out.write("\t\t<div class=\"sidebar\">\n");
      out.write("          <div class=\"sidebar_item\">\n");
      out.write("            <h3>September 2012</h3>\n");
      out.write("            <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Pellentesque cursus tempor enim.</p>         \n");
      out.write("\t\t  </div><!--close sidebar_item--> \n");
      out.write("        </div><!--close sidebar-->  \t\t\n");
      out.write("        <div class=\"sidebar\">\n");
      out.write("          <div class=\"sidebar_item\">\n");
      out.write("            <h2>Contact</h2>\n");
      out.write("            <p>Phone: +44 (0)1234 567891</p>\n");
      out.write("            <p>Email: <a href=\"mailto:info@youremail.co.uk\">info@youremail.co.uk</a></p>\n");
      out.write("          </div><!--close sidebar_item--> \n");
      out.write("        </div><!--close sidebar-->\n");
      out.write("       </div><!--close sidebar_container-->\t\n");
      out.write("\t\n");
      out.write("      <ul class=\"slideshow\">\n");
      out.write("        <li class=\"show\"><img width=\"680\" height=\"250\" src=\"res/home_1.jpg\" alt=\"&quot;Enter your caption here&quot;\" /></li>\n");
      out.write("        <li><img width=\"680\" height=\"250\" src=\"res/home_2.jpg\" alt=\"&quot;Enter your caption here&quot;\" /></li>\n");
      out.write("      </ul>   \t \n");
      out.write("\t \n");
      out.write("\t  <div id=\"content\">\n");
      out.write("        <div class=\"content_item\">\n");
      out.write("\t\t  <h1>Welcome To Your Website</h1> \n");
      out.write("\t      <p>This standards compliant, simple, fixed width website template is released as an 'open source' design (under the Creative Commons Attribution 3.0 Licence), which means that you are free to download and use it for anything you want (including modifying and amending it). If you wish to remove the &lsquo;ARaynorDesign&rsquo; link in the footer of the template, please contact me first, but other than that...</p>\n");
      out.write("\t\t  \n");
      out.write("\t\t  <div class=\"content_image\">\n");
      out.write("\t\t    <img src=\"res/content_image1.jpg\" alt=\"image1\"/>\n");
      out.write("\t      </div>\n");
      out.write("\t\t  <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Pellentesque cursus tempor enim. Aliquam facilisis neque non nunc posuere eget volutpat metus tincidunt.</p>\n");
      out.write("\t\t  <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Pellentesque cursus tempor enim.</p>\n");
      out.write("\t\t  <br style=\"clear:both\"/>\n");
      out.write("\t\t  \n");
      out.write("\t\t  <div class=\"content_container\">\n");
      out.write("\t\t    <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Pellentesque cursus tempor enim. Aliquam facilisis neque non nunc posuere eget volutpat metus tincidunt.</p>\n");
      out.write("\t\t  \t<div class=\"button_small\">\n");
      out.write("\t\t      <a href=\"#\">Read more</a>\n");
      out.write("\t\t    </div><!--close button_small-->\n");
      out.write("\t\t  </div><!--close content_container-->\n");
      out.write("          <div class=\"content_container\">\n");
      out.write("\t\t    <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Pellentesque cursus tempor enim. Aliquam facilisis neque non nunc posuere eget volutpat metus tincidunt.</p>          \n");
      out.write("\t\t  \t<div class=\"button_small\">\n");
      out.write("\t\t      <a href=\"#\">Read more</a>\n");
      out.write("\t\t    </div><!--close button_small-->\t\t  \n");
      out.write("\t\t  </div><!--close content_container-->\t\t\t  \n");
      out.write("\t\t</div><!--close content_item-->\n");
      out.write("      </div><!--close content-->   \n");
      out.write("\t</div><!--close site_content--> \n");
      out.write("    \n");
      out.write("\t<div id=\"content_grey\">\n");
      out.write("\t  <div class=\"content_grey_container_box\">\n");
      out.write("\t\t<h4>Latest Blog Post</h4>\n");
      out.write("\t    <p> Phasellus laoreet feugiat risus. Ut tincidunt, ante vel fermentum iaculis.</p>\n");
      out.write("\t\t<div class=\"readmore\">\n");
      out.write("\t\t  <a href=\"#\">Read more</a>\n");
      out.write("\t\t</div><!--close readmore-->\n");
      out.write("\t  </div><!--close content_grey_container_box-->\n");
      out.write("      <div class=\"content_grey_container_box\">\n");
      out.write("       <h4>Latest News</h4>\n");
      out.write("\t    <p> Phasellus laoreet feugiat risus. Ut tincidunt, ante vel fermentum iaculis.</p>\n");
      out.write("\t    <div class=\"readmore\">\n");
      out.write("\t\t  <a href=\"#\">Read more</a>\n");
      out.write("\t\t</div><!--close readmore-->\n");
      out.write("\t  </div><!--close content_grey_container_box-->\n");
      out.write("      <div class=\"content_grey_container_boxl\">\n");
      out.write("\t\t<h4>Latest Projects</h4>\n");
      out.write("\t    <p> Phasellus laoreet feugiat risus. Ut tincidunt, ante vel fermentum iaculis.</p>\n");
      out.write("\t    <div class=\"readmore\">\n");
      out.write("\t\t  <a href=\"#\">Read more</a>\n");
      out.write("\t\t</div><!--close readmore-->\t  \n");
      out.write("\t  </div><!--close content_grey_container_box1-->      \n");
      out.write("\t  <br style=\"clear:both\"/>\n");
      out.write("    </div><!--close content_grey-->   \n");
      out.write(" \n");
      out.write("  </div><!--close main-->\n");
      out.write("  \n");
      out.write("  <div id=\"footer\">\n");
      out.write("\t  <a href=\"http://validator.w3.org/check?uri=referer\">Valid XHTML</a> | <a href=\"http://fotogrph.com/\">Images</a> | website template by <a href=\"http://www.araynordesign.co.uk\">ARaynorDesign</a>\n");
      out.write("  </div><!--close footer-->  \n");
      out.write("  \n");
      out.write("</body>\n");
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
