import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(value = "/add")
public class AddServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        registration(req, resp,"/registration.jsp");
    }
    private void registration(HttpServletRequest req, HttpServletResponse resp, String jspPage) throws ServletException, IOException {
        RequestDispatcher requestDispatcher = req.getRequestDispatcher(jspPage);
        requestDispatcher.include(req, resp);
    }
}
