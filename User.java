import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class User extends HttpServlet
{
public void doGet(HttpServletRequest request, HttpServletResponse response)throws IOException, ServletException
{
response.setContentType("text/html");
PrintWriter out=response.getWriter();

out.println("<html>"); 
out.println("<body>");

out.println("<form acton='Check'>");

out.println("Name:<input type='text'name='uname'><br>");

out.println("Password:<input type='password'name='pass'><br>");

out.println("Gender:Male<input type='radio'name='gender'value='M'><br>");
out.println("Female<input type='radio'name='gender'value='F'><br>");

out.println("<input type='submit'value='Submit'>");

out.println("</form>");
out.println("</body>");
out.println("</html>");
}
}