import logic.Cart;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

@WebServlet(name="SecondServlet")
public class SecondServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        HttpSession session=request.getSession();

        String current_user=(String) session.getAttribute("current_user");



//        Cart cartFromWeb=(Cart) session.getAttribute("cart");
//        String name=request.getParameter("name");
//        int quantity= Integer.parseInt(request.getParameter("quantity"));
//
//
//        if (cartFromWeb == null) {
//
//            cartFromWeb=new Cart();
//            cartFromWeb.setName(name);
//            cartFromWeb.setQuantity(quantity);
//
//        }
//
//            session.setAttribute("cart", cartFromWeb);

        response.sendRedirect("/secondWebApplication_war_exploded/second.jsp");// url или страница

    }
}

