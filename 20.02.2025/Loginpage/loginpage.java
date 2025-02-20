import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;



/**
 * Servlet implementation class MyFirstServlet
 */
@WebServlet("/loginpage")
public class loginpage extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		 //response.getWriter().append("Served at: ").append(request.getContextPath());

		// Get PrintWriter to write response
		response.setContentType("text/html");
		PrintWriter pwriter = response.getWriter();
		pwriter.println("<html><body>");
		pwriter.println("<form  action='Login' method='post'>");
		pwriter.println("Username: <input type='text' name='uname'/> <br/>");
		pwriter.println("Password: <input type='password' name='upass'/> <br/>");
		pwriter.println("<input type='submit' value='Login'/>");

		pwriter.println("</form>");

		pwriter.println("</body></html>");
	}
}
