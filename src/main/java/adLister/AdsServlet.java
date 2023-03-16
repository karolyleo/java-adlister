package adLister;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/ads")
public class AdsServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        Ads ads = DaoFactory.getAdsDao();
        List<Ad> adList = ads.all();
        System.out.println("Test");
        for(Ad ad: adList) {
            System.out.println(ad.getTitle());
        }
        req.setAttribute("adList", adList);

        req.getRequestDispatcher("ads/index.jsp").forward(req, resp);
//        resp.sendRedirect("ads/index.jsp");
    }
}
