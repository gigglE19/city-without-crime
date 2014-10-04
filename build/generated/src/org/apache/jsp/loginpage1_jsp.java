package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class loginpage1_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_setDataSource_user_url_password_driver_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_query_var;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_setDataSource_user_url_password_driver_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_query_var = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_s_setDataSource_user_url_password_driver_nobody.release();
    _jspx_tagPool_s_query_var.release();
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
      out.write("    \n");
      out.write("\n");
      out.write(" ");
      if (_jspx_meth_s_setDataSource_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("  <title>ARaynorDesign Template</title>\n");
      out.write("  <meta name=\"description\" content=\"free website template\" />\n");
      out.write("  <meta name=\"keywords\" content=\"enter your keywords here\" />\n");
      out.write("  <meta http-equiv=\"content-type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("  <meta http-equiv=\"X-UA-Compatible\" content=\"IE=9\" />\n");
      out.write("  <link rel=\"stylesheet\" type=\"text/css\" href=\"res/style1.css\" />\n");
      out.write("  <script type=\"text/javascript\" src=\"res/jquery.min.js\"></script>\n");
      out.write("  <script type=\"text/javascript\" src=\"res/image_slide.js\"></script>\n");
      out.write("  ");
      if (_jspx_meth_s_query_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                        ");
      if (_jspx_meth_s_query_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                        ");
      if (_jspx_meth_s_query_2(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                        ");
      if (_jspx_meth_s_query_3(_jspx_page_context))
        return;
      out.write("\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("  <div id=\"main\">\n");
      out.write("    <div id=\"header\">\n");
      out.write("\t  <div id=\"banner\">\n");
      out.write("              \n");
      out.write("                            <form action=\"auth\" method=\"post\" style=\"width: 400px;\n");
      out.write("  float: right;\n");
      out.write("  height: 10px;\n");
      out.write("  margin: 0;\n");
      out.write("  padding-left: 20px;\n");
      out.write("  background: transparent;\">\n");
      out.write("            \n");
      out.write("           P.S. ID : <input type=\"text\" name=\"name\" placeholder=\"enter your ID\"/>\n");
      out.write("           \n");
      out.write("            Password : <input type=\"password\" name=\"pass\"placeholder=\"password\" />\n");
      out.write("            &nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("            &nbsp; &nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("            &nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("            &nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("             &nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("               &nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("               <input type=\"submit\" value=\"LOGIN\" />\n");
      out.write("          \n");
      out.write("        </form>\n");
      out.write("              \n");
      out.write("\t    <div id=\"welcome\">\n");
      out.write("\t      <h1>City Without Crime</h1>\n");
      out.write("\t    </div><!--close welcome-->\n");
      out.write("            \n");
      out.write("     \n");
      out.write("            \n");
      out.write("\t    <div id=\"welcome_slogan\">\n");
      out.write("\t      <h1>Service Before Self</h1>\n");
      out.write("\t    </div><!--close welcome_slogan-->\n");
      out.write("          \n");
      out.write("          \n");
      out.write("                \n");
      out.write("       \n");
      out.write("              \n");
      out.write("                      \n");
      out.write("    </div>\n");
      out.write("    </div><!--close header-->\n");
      out.write("\n");
      out.write("\t<div id=\"menubar\">\n");
      out.write("      <ul id=\"menu\">\n");
      out.write("        <li class=\"current\"><a href=\"#\">Home</a></li>\n");
      out.write("        <li><a href=\"about.html\">About US</a></li>\n");
      out.write("        <li><a href=\"psuser.jsp\">Police Stations</a></li>\n");
      out.write("        <li><a href=\"crimeuser.jsp\">Crime News</a></li>\n");
      out.write("        <li><a href=\"contactus.html\">Contact Us</a></li>\n");
      out.write("      </ul>\n");
      out.write("    </div><!--close menubar-->\t\n");
      out.write("    \n");
      out.write("\t<div id=\"site_content\">\t\t\n");
      out.write("\n");
      out.write("\t  <div class=\"sidebar_container\">       \n");
      out.write("\t\t<div class=\"sidebar\">\n");
      out.write("          <div class=\"sidebar_item\">\n");
      out.write("            <h2>Complaint Status</h2>\n");
      out.write("            \n");
      out.write("                             <br>\n");
      out.write("                        <form action=\"compstatus.jsp\" method=\"post\">\n");
      out.write("        COMPLAIN ID:<select name=\"id\">\n");
      out.write("            <option value=\"id\">--SELECT ID--</option>\n");
      out.write("          \n");
      out.write("                  ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("        </select>        \n");
      out.write("                 \n");
      out.write("        <br><br>   \n");
      out.write("            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("            <input type=\"submit\" value=\"submit\">\n");
      out.write("    </form>\n");
      out.write("            \n");
      out.write("          </div><!--close sidebar_item--> \n");
      out.write("        </div><!--close sidebar-->     \t\t\n");
      out.write("\t\t<div class=\"sidebar\">\n");
      out.write("          <div class=\"sidebar_item\">\n");
      out.write("            <h2>Crime News</h2>\n");
      out.write("            <h3>June 2014</h3>\n");
      out.write("            <p><U>NEWS CONTAINS THE POLICE STATION ID AND DETAILS</U></p>         \n");
      out.write("\t\t  </div><!--close sidebar_item--> \n");
      out.write("        </div><!--close sidebar-->\n");
      out.write("        \n");
      out.write("        ");
      if (_jspx_meth_c_forEach_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t  \t\t\n");
      out.write("        <div class=\"sidebar\">\n");
      out.write("          <div class=\"sidebar_item\">\n");
      out.write("            <h2>Contact</h2>\n");
      out.write("            <p>Phone: +91 (0)11 567891</p>\n");
      out.write("            <p>Email: delhip@indiaps.co.in</p>\n");
      out.write("          </div><!--close sidebar_item--> \n");
      out.write("        </div><!--close sidebar-->\n");
      out.write("       </div><!--close sidebar_container-->\t\n");
      out.write("\t\n");
      out.write("      <ul class=\"slideshow\">\n");
      out.write("          <li class=\"show\"><img width=\"680\" height=\"250\" src=\"res/home_1.jpg\" alt=\"&quot;Department&quot;\" /></li>\n");
      out.write("        <li><img width=\"680\" height=\"250\" src=\"res/home_2.jpg\" alt=\"&quot;Headquaters&quot;\" /></li>\n");
      out.write("      </ul>   \t \n");
      out.write("\t \n");
      out.write("\t  <div id=\"content\">\n");
      out.write("        <div class=\"content_item\">\n");
      out.write("\t\t  <h1>Welcome To City Without Crime Website</h1>\n");
      out.write("                  \n");
      out.write("                  <div  align=\"left\"><img src=\"res/emer.gif\" width=\"95\" height=\"32\" alt=\"\" /></div>   \n");
      out.write("                      \n");
      out.write("       \n");
      out.write("                  <marquee behavior=\"scroll\" direction=\"left\" onmouseover=\"this.stop();\" onmouseout=\"this.start();\" scrollamount=\"4\">\n");
      out.write("        ");
      if (_jspx_meth_c_forEach_2(_jspx_page_context))
        return;
      out.write("  \n");
      out.write("                  </marquee>\n");
      out.write("                  \n");
      out.write("                  \n");
      out.write("\t      <p>SAFECITY is an information aggregation platform to help identify hotspots in a city where abuse has been reported. This platform only provides information based on voluntary unverified reports.\n");
      out.write("This should not be taken as a substitute or replacement for the law enforcement process. This will only be successful if people come out and pin the creeps who are harassing us on the roads</p>\n");
      out.write("\t\t  \n");
      out.write("\t\t  <div class=\"content_image\">\n");
      out.write("\t\t    <img src=\"res/content_image1.jpg\" alt=\"image1\"/>\n");
      out.write("\t      </div>\n");
      out.write("\t\t  <p>SAFECITY is a project that helps to identify locations where women have experienced or witnessed any type of sexual harassment ? verbal comments, graphic behavior, menace? anything. By starting this project we wish to highlight a serious social issue and we believe we are taking a step towards changing the way our society thinks and reacts. In time we hope it will lead to a safe and non-violent environment for all.</p>\n");
      out.write("   \n");
      out.write("\t\t  <br style=\"clear:both\"/>\n");
      out.write("                  \n");
      out.write("                  <div  align=\"left\"><img src=\"res/help-line-head.png\" width=\"95\" height=\"32\" alt=\"\" /></div>   \n");
      out.write("                      \n");
      out.write("                     <marquee behavior=\"scroll\" direction=\"left\" onmouseover=\"this.stop();\" onmouseout=\"this.start();\" scrollamount=\"4\">\n");
      out.write("        <img src=\"res/healp-line-bullet.png\" width=\"11\" height=\"13\" alt=\"\" />&nbsp;PCR : <span>100 (24X7) (Toll Free)</span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<img src=\"res/healp-line-bullet.png\" width=\"11\" height=\"13\" alt=\"\" />&nbsp;Eyes and Ears : <span>1090 (Toll Free)</span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<img src=\"res/healp-line-bullet.png\" width=\"11\" height=\"13\" alt=\"\" />&nbsp;Women in distress : <span>1091</span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<img src=\"res/healp-line-bullet.png\" width=\"11\" height=\"13\" alt=\"\" />&nbsp;Special Cell (North-Eastern States) : <span>1093</span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<img src=\"res/healp-line-bullet.png\" width=\"11\" height=\"13\" alt=\"\" />&nbsp;Missing Persons : <span>1094, 23241210</span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<img src=\"res/healp-line-bullet.png\" width=\"11\" height=\"13\" alt=\"\" />&nbsp;Traffic : <span>1095, 25844444</span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<img src=\"res/healp-line-bullet.png\" width=\"11\" height=\"13\" alt=\"\" />&nbsp;Senior Citizen : <span>1291</span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<img src=\"res/healp-line-bullet.png\" width=\"11\" height=\"13\" alt=\"\" />&nbsp;Vigilance : <span>1064</span>\n");
      out.write("                     </marquee>\n");
      out.write("                  \n");
      out.write("                  <div class=\"content_container\">\n");
      out.write("\t\t    <p>We propose that we PIN THE CREEPS! aWe all share our little experiences; upload our horrid stories, the photographs or the videos and most importantly the location where it happened.\n");
      out.write("\"We strongly believe that all women have the right to live safely, irrespective of which city they stay in. We also believe that a woman should be able to move around without fear or distress; without having to calculate which road she has to travel on so that she will be safe; without having to worry about the clothes she wears or the people she is with.</p>\n");
      out.write("\t\t  \t<div class=\"button_small\">\n");
      out.write("\t\t      <a href=\"about.html\">Read more</a>\n");
      out.write("\t\t    </div><!--close button_small-->\n");
      out.write("\t\t  </div>\n");
      out.write("                  \n");
      out.write("\t\t  \n");
      out.write("\t\t  <div class=\"content_container\">\n");
      out.write("                      \n");
      out.write("                      <DIV style=\"COLOR:#000000;font-size: 22PX;font-family:Georgia;\"><u>LODGE A COMPLAINT</u></DIV>\n");
      out.write("                      <br>\n");
      out.write("                      <form action=\"complaint.jsp\" method=\"post\">\n");
      out.write("          \n");
      out.write("          \n");
      out.write("             <p>\n");
      out.write("                <label for=\"email\">CRIMINAL NAME (optional)</label>\n");
      out.write("            <input type=\"text\" name=\"criminalname\" id=\"email\" value=\"\" size=\"22\" />\n");
      out.write("          \n");
      out.write("          </p>\n");
      out.write("          <p>\n");
      out.write("          <label for=\"email\">POLICE STATION ID(required)</label><select name=\"pid\">\n");
      out.write("            <option value=\"pid\">--SELECT P.S. ID--</option>\n");
      out.write("          \n");
      out.write("                  ");
      if (_jspx_meth_c_forEach_3(_jspx_page_context))
        return;
      out.write("\n");
      out.write("            \n");
      out.write("          </select>\n");
      out.write("          </p>\n");
      out.write("          <p>\n");
      out.write("    \n");
      out.write("          <A HREF=\"psid.jsp\">--->get details about your police stations<---</a>\n");
      out.write("          </p> \n");
      out.write("          \n");
      out.write("          <U>DESCRIPTION:</U>\n");
      out.write("          <p>\n");
      out.write("              <label for=\"comment\" style=\"display:none;\">res/Comment (required)</label>\n");
      out.write("            <textarea name=\"description\" id=\"comment\" cols=\"30%\" rows=\"8\"></textarea>\n");
      out.write("            \n");
      out.write("          </p>\n");
      out.write("          <p>\n");
      out.write("            <input type=\"submit\" id=\"submit\" value=\"Submit Complaint\" />\n");
      out.write("            &nbsp;\n");
      out.write("            <input type=\"reset\"  id=\"reset\"  value=\"Reset\" />\n");
      out.write("          </p>\n");
      out.write("        </form>\n");
      out.write("                      \n");
      out.write("                      \n");
      out.write("                      \n");
      out.write("                    \n");
      out.write("                      \n");
      out.write("                      \n");
      out.write("\t\t  \t<!--close button_small-->\n");
      out.write("\t\t  </div><!--close content_container-->\n");
      out.write("          <!--close content_container-->\t\t\t  \n");
      out.write("\t\t</div><!--close content_item-->\n");
      out.write("      </div><!--close content-->   \n");
      out.write("\t</div><!--close site_content--> \n");
      out.write(" \n");
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

  private boolean _jspx_meth_s_setDataSource_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:setDataSource
    org.apache.taglibs.standard.tag.rt.sql.SetDataSourceTag _jspx_th_s_setDataSource_0 = (org.apache.taglibs.standard.tag.rt.sql.SetDataSourceTag) _jspx_tagPool_s_setDataSource_user_url_password_driver_nobody.get(org.apache.taglibs.standard.tag.rt.sql.SetDataSourceTag.class);
    _jspx_th_s_setDataSource_0.setPageContext(_jspx_page_context);
    _jspx_th_s_setDataSource_0.setParent(null);
    _jspx_th_s_setDataSource_0.setDriver((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${initParam.db_driver}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    _jspx_th_s_setDataSource_0.setUrl((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${initParam.db_url}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    _jspx_th_s_setDataSource_0.setUser((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${initParam.db_user}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    _jspx_th_s_setDataSource_0.setPassword((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${initParam.db_password}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_s_setDataSource_0 = _jspx_th_s_setDataSource_0.doStartTag();
    if (_jspx_th_s_setDataSource_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_setDataSource_user_url_password_driver_nobody.reuse(_jspx_th_s_setDataSource_0);
      return true;
    }
    _jspx_tagPool_s_setDataSource_user_url_password_driver_nobody.reuse(_jspx_th_s_setDataSource_0);
    return false;
  }

  private boolean _jspx_meth_s_query_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:query
    org.apache.taglibs.standard.tag.rt.sql.QueryTag _jspx_th_s_query_0 = (org.apache.taglibs.standard.tag.rt.sql.QueryTag) _jspx_tagPool_s_query_var.get(org.apache.taglibs.standard.tag.rt.sql.QueryTag.class);
    _jspx_th_s_query_0.setPageContext(_jspx_page_context);
    _jspx_th_s_query_0.setParent(null);
    _jspx_th_s_query_0.setVar("result");
    int[] _jspx_push_body_count_s_query_0 = new int[] { 0 };
    try {
      int _jspx_eval_s_query_0 = _jspx_th_s_query_0.doStartTag();
      if (_jspx_eval_s_query_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_s_query_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_push_body_count_s_query_0[0]++;
          _jspx_th_s_query_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_s_query_0.doInitBody();
        }
        do {
          out.write("\n");
          out.write("                        select * from complaint order by id;\n");
          out.write("\n");
          out.write("                    ");
          int evalDoAfterBody = _jspx_th_s_query_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_s_query_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
          out = _jspx_page_context.popBody();
          _jspx_push_body_count_s_query_0[0]--;
      }
      if (_jspx_th_s_query_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_s_query_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_s_query_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_s_query_0.doFinally();
      _jspx_tagPool_s_query_var.reuse(_jspx_th_s_query_0);
    }
    return false;
  }

  private boolean _jspx_meth_s_query_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:query
    org.apache.taglibs.standard.tag.rt.sql.QueryTag _jspx_th_s_query_1 = (org.apache.taglibs.standard.tag.rt.sql.QueryTag) _jspx_tagPool_s_query_var.get(org.apache.taglibs.standard.tag.rt.sql.QueryTag.class);
    _jspx_th_s_query_1.setPageContext(_jspx_page_context);
    _jspx_th_s_query_1.setParent(null);
    _jspx_th_s_query_1.setVar("result1");
    int[] _jspx_push_body_count_s_query_1 = new int[] { 0 };
    try {
      int _jspx_eval_s_query_1 = _jspx_th_s_query_1.doStartTag();
      if (_jspx_eval_s_query_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_s_query_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_push_body_count_s_query_1[0]++;
          _jspx_th_s_query_1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_s_query_1.doInitBody();
        }
        do {
          out.write("\n");
          out.write("                        select pid from policestation;\n");
          out.write("\n");
          out.write("                    ");
          int evalDoAfterBody = _jspx_th_s_query_1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_s_query_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
          out = _jspx_page_context.popBody();
          _jspx_push_body_count_s_query_1[0]--;
      }
      if (_jspx_th_s_query_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_s_query_1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_s_query_1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_s_query_1.doFinally();
      _jspx_tagPool_s_query_var.reuse(_jspx_th_s_query_1);
    }
    return false;
  }

  private boolean _jspx_meth_s_query_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:query
    org.apache.taglibs.standard.tag.rt.sql.QueryTag _jspx_th_s_query_2 = (org.apache.taglibs.standard.tag.rt.sql.QueryTag) _jspx_tagPool_s_query_var.get(org.apache.taglibs.standard.tag.rt.sql.QueryTag.class);
    _jspx_th_s_query_2.setPageContext(_jspx_page_context);
    _jspx_th_s_query_2.setParent(null);
    _jspx_th_s_query_2.setVar("result2");
    int[] _jspx_push_body_count_s_query_2 = new int[] { 0 };
    try {
      int _jspx_eval_s_query_2 = _jspx_th_s_query_2.doStartTag();
      if (_jspx_eval_s_query_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_s_query_2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_push_body_count_s_query_2[0]++;
          _jspx_th_s_query_2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_s_query_2.doInitBody();
        }
        do {
          out.write("\n");
          out.write("                        select id from complaint;\n");
          out.write("\n");
          out.write("                    ");
          int evalDoAfterBody = _jspx_th_s_query_2.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_s_query_2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
          out = _jspx_page_context.popBody();
          _jspx_push_body_count_s_query_2[0]--;
      }
      if (_jspx_th_s_query_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_s_query_2[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_s_query_2.doCatch(_jspx_exception);
    } finally {
      _jspx_th_s_query_2.doFinally();
      _jspx_tagPool_s_query_var.reuse(_jspx_th_s_query_2);
    }
    return false;
  }

  private boolean _jspx_meth_s_query_3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:query
    org.apache.taglibs.standard.tag.rt.sql.QueryTag _jspx_th_s_query_3 = (org.apache.taglibs.standard.tag.rt.sql.QueryTag) _jspx_tagPool_s_query_var.get(org.apache.taglibs.standard.tag.rt.sql.QueryTag.class);
    _jspx_th_s_query_3.setPageContext(_jspx_page_context);
    _jspx_th_s_query_3.setParent(null);
    _jspx_th_s_query_3.setVar("result3");
    int[] _jspx_push_body_count_s_query_3 = new int[] { 0 };
    try {
      int _jspx_eval_s_query_3 = _jspx_th_s_query_3.doStartTag();
      if (_jspx_eval_s_query_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_s_query_3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_push_body_count_s_query_3[0]++;
          _jspx_th_s_query_3.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_s_query_3.doInitBody();
        }
        do {
          out.write("\n");
          out.write("                        select description from emergency;\n");
          out.write("\n");
          out.write("                    ");
          int evalDoAfterBody = _jspx_th_s_query_3.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_s_query_3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
          out = _jspx_page_context.popBody();
          _jspx_push_body_count_s_query_3[0]--;
      }
      if (_jspx_th_s_query_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_s_query_3[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_s_query_3.doCatch(_jspx_exception);
    } finally {
      _jspx_th_s_query_3.doFinally();
      _jspx_tagPool_s_query_var.reuse(_jspx_th_s_query_3);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setVar("data");
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${result2.rows}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                      <option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${data.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${data.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</option>\n");
          out.write("            ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_1.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_1.setParent(null);
    _jspx_th_c_forEach_1.setVar("data");
    _jspx_th_c_forEach_1.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${result.rows}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_1 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
      if (_jspx_eval_c_forEach_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("\t\t<div class=\"sidebar\">\n");
          out.write("          <div class=\"sidebar_item\">\n");
          out.write("            <h3>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${data.pid}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</h3>\n");
          out.write("            <p>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${data.description}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</p>         \n");
          out.write("\t\t  </div><!--close sidebar_item--> \n");
          out.write("        </div><!--close sidebar-->  \n");
          out.write("        ");
          int evalDoAfterBody = _jspx_th_c_forEach_1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_1.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_1);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_2 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_2.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_2.setParent(null);
    _jspx_th_c_forEach_2.setVar("data");
    _jspx_th_c_forEach_2.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${result3.rows}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_2 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_2 = _jspx_th_c_forEach_2.doStartTag();
      if (_jspx_eval_c_forEach_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("            <img src=\"res/healp-line-bullet.png\" width=\"11\" height=\"13\" alt=\"\" /><id style=\"color:red\"><U>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${data.description}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</u></id>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
          out.write("        ");
          int evalDoAfterBody = _jspx_th_c_forEach_2.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_2[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_2.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_2.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_2);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_3 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_3.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_3.setParent(null);
    _jspx_th_c_forEach_3.setVar("data");
    _jspx_th_c_forEach_3.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${result1.rows}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_3 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_3 = _jspx_th_c_forEach_3.doStartTag();
      if (_jspx_eval_c_forEach_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                      <option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${data.pid}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${data.pid}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</option>\n");
          out.write("            ");
          int evalDoAfterBody = _jspx_th_c_forEach_3.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_3[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_3.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_3.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_3);
    }
    return false;
  }
}
