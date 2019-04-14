import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class SetCookiesServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Cookie some_id=new Cookie("some_id", "123");
        some_id.setMaxAge(60 * 60 * 24); //в секундах
        response.addCookie(some_id);

        Cookie some_name=new Cookie("some_name", "Vasia");
        some_name.setMaxAge(60 * 60 * 24);
        response.addCookie(some_name);


    }
}
