import java.io.*; 
import jakarta.servlet.*; 
import jakarta.servlet.http.*; 

public class LoginServlet extends HttpServlet {
    private static final String admin = "admin";
    private static final String passw = "admin";

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
            String username = request.getParameter("username");
            String password = request.getParameter("password");
            
            request.getSession().setAttribute("username", username);

            response.sendRedirect(login(username, password));
    }

    private String login(String username, String password) {
        if (admin.equals(username) && passw.equals(password)) {
            return "admin";
        } else {
            return "user.jsp";
        }
    }
}