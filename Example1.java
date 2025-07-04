import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class Example1 extends HttpServlet
{
public void doGet(HttpServletRequest request, HttpServletResponse response)throws IOException, ServletException
{
response.setContentType("text/html");
PrintWriter out=response.getWriter();;

out.println("<html>");
out.println("<body>");

out.println("<Form action='Example2'>");
out.println("First Number:<input type='text'><br>");
out.println("second Number:<input type='text'><br>");
out.println("<input type='submit'name='table'>");

out.println("</body>");
out.println("</html>");
}
}