import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/count")
public class Count extends HttpServlet {
    int counter = 0;
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        String reset = req.getParameter("reset");
        counter++;
        if(reset == null) {
            res.getWriter().println("<h1> You have visited this page " + counter +" times!");
        } else {
            counter = 0;
            res.getWriter().println("<h1> You have reset the counter to: " + counter +" !");
        }
    }
}