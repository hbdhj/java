package myeclipse;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class MyHelloWorldServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response)
    throws IOException, ServletException
    {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Hello World (Servlet Example)</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1 align=\"center\">Hello World (Servlet Example)</h1>");
        out.println("<p>Hello World -Hi</p>");
        out.println("</body>");
        out.println("</html>");
    }

}
