package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class ajoutequipe_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
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

      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.0 Transitional//EN\">\r\n");
      out.write("<HTML>\r\n");
      out.write("<HEAD>\r\n");
      out.write("<TITLE>Gestion de baseball</TITLE>\r\n");
      out.write("<META HTTP-EQUIV=\"Content-Type\" CONTENT=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<META NAME=\"author\" CONTENT=\"Marc Frappier\">\r\n");
      out.write("<META NAME=\"description\" CONTENT=\"page d'accueil Gestion de baseball\">\r\n");
      out.write("</HEAD>\r\n");
      out.write("<BODY>\r\n");
      out.write("<CENTER>\r\n");
      out.write("<H1>Gestion de baseball</H1>\r\n");
      out.write("<BR>\r\n");
      out.write("<FORM ACTION=\"AjoutEquipe\" METHOD=\"POST\">\r\n");
      out.write("1.Nom de l'equipe (obligatoire) : <INPUT TYPE=\"TEXT\" NAME=\"nomEquipe\"\r\n");
      out.write("  VALUE=\"\">\r\n");
      out.write("2.Terrain de l'equipe : <INPUT TYPE=\"TEXT\" NAME=\"terrainEquipe\"\r\n");
      out.write("  VALUE=\"\">\r\n");
      out.write("3.Adresse de l'equipe (obligatoire avec 2) : <INPUT TYPE=\"TEXT\" NAME=\"adresseTerrainEquipe\"\r\n");
      out.write("  VALUE=\"\">\r\n");
      out.write("<BR>\r\n");
      out.write("<BR>\r\n");
      out.write("<INPUT TYPE=\"SUBMIT\" NAME=\"creerEquipe\"VALUE=\"CreerEquipe\">\r\n");
      out.write("</FORM>\r\n");
      out.write("</CENTER>\r\n");
      out.write("<BR>\r\n");
      out.write("<a href=\"Login\">Retour au menu</a>\r\n");
      out.write("<BR>\r\n");
      out.write("Date et heure :\r\n");
      out.write("</BODY>\r\n");
      out.write("</HTML>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
