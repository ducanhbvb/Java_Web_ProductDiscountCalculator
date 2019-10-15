import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "DiscountServlet", urlPatterns = "/converter" )
public class DiscountServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String description = request.getParameter("description");
        float price = Float.parseFloat(request.getParameter("price"));
        float percent = Float.parseFloat(request.getParameter("percent"));
        float discountAmount = price * percent * 0.01f;
        float discountPrice =price - discountAmount;
        PrintWriter writer = response.getWriter();
        writer.println("<html>\n" +
                "    <head>\n" +
                "        <title>Product Discount Calculator</title>\n" +
                "        <link rel=\"stylesheet\" type=\"text/css\" href=\"style.css\" />\n" +
                "    </head>\n" +
                "    <body>\n" +
                "        <div id=\"content\">\n" +
                "            <h1>Product Discount Calculator</h1>\n" +
                "            <label>Product Description: </label>\n" +
                "            <span>zas</span><br/>\n" +
                "            <label>Price: </label>\n" +
                "            <spa   n>$"+price+"</span><br/>\n" +
                "            <label>Discount Percent: </label>\n" +
                "            <span>%"+percent+"</span><br/>\n" +
                "            <label>Discount Amount: </label>\n" +
                "            <span>$"+discountAmount+"</span><br/>\n" +
                "            <label>Discount Price: </label>\n" +
                "            <span>$"+discountPrice+"</span><br/>\n" +
                "        </div>\n" +
                "    </body>\n" +
                "</html>");
    }
}
