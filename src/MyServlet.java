import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

@WebServlet(value = "/login")
public class MyServlet extends HttpServlet {
    List<User> users = new ArrayList<>();

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String login = req.getParameter("login");
        String password = req.getParameter("password");
        String name = req.getParameter("nameUser");
        PrintWriter out = resp.getWriter();
        List<User> users = UserDb.select();
        User newUser = getUser(login, password);
        if (newUser.getName() != null) {
            out.println("Welcome, " + newUser.getName());
            for (User u : users) {
                out.println(u);
            }
        } else if (name == null) {
            registration(req, resp);
        } else {
            if (!getUser(login, password).equals(newUser)) {
                registration(req, resp);
            } else {
                newUser.setId(users.size() + 1);
                newUser.setName(name);
                newUser.setLogin(login);
                newUser.setPassword(password);
                UserDb.insert(newUser);
                out.println("You are registered");
                out.println("Welcome, " + newUser.getName());
                users = UserDb.select();
                for (User u : users) {
                    out.println(u);
                }
            }
        }
    }

    private void registration(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/registration.jsp");
        requestDispatcher.include(req, resp);
    }

    private User getUser(String login, String password) {
        User us = new User();
        for (User user : users) {
            if (user.getLogin().equals(login) && user.getPassword().equals(password)) {
                us = user;
            }
        }
        return us;
    }
}
