package day1;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author jesse
 * @date 2019/11/13  下午5:03
 */
public class Hello extends HttpServlet {
    public void service(HttpServletRequest req, HttpServletResponse resp)throws
            ServletException, IOException {
        PrintWriter out = resp.getWriter();
        out.println("<h1>hello world</h1>");
    }
}
