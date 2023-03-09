import javax.servlet.annotation.WebServlet;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet("/hello")
public class HelloNameDefault extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        String name = req.getParameter("name");
        if (name == null) {
            res.getWriter().println("<h1>Hello, World!</h1>");
        } else {
            res.getWriter().println("<h1>Hello, " + name + "!</h1>");
        }
    }

}
