import java.io.*; 
import jakarta.servlet.*; 
import jakarta.servlet.http.*; 

public class SimpleServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
          Integer a = Integer.parseInt(request.getParameter("a"));
          Integer b = Integer.parseInt(request.getParameter("b"));
          out.println("<html><body>");
          out.println("A soma de " +
                  a + " e " + b + 
                  " será " + (a + b));
          out.println("</body></html>");
        } 
    }
}