
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet_1
 */
@WebServlet("/Servlet_1")
public class Servlet_1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private String message;

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		message = "Hello My Lady";
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

		// Create cookies for first and last names.
		Cookie full_name = new Cookie("full_name", request.getParameter("full_name"));
		Cookie email = new Cookie("email", request.getParameter("email"));

		// Set expiry date after 24 Hrs for both the cookies.
		full_name.setMaxAge(60 * 60 * 24);
		email.setMaxAge(60 * 60 * 24);

		// Add both the cookies in the response header.
		response.addCookie(full_name);
		response.addCookie(email);

		Cookie cookie = null;
		Cookie[] cookies = null;

		// Get an array of Cookies associated with this domain
		cookies = request.getCookies();
		
		// Set response content type
		response.setContentType("text/html");

		// Actual logic goes here.
		PrintWriter out = response.getWriter();
		out.println("<h1>" + message + "</h1>");
		try {

		} catch (Exception e) {

		}
		response.getWriter().append("Full Name: ").append(request.getParameter("full_name"));
		response.getWriter().append("<br>");
		response.getWriter().append("Email: ").append(request.getParameter("email"));

		if (cookies != null) {
			out.println("<h2> Found Cookies Name and Value</h2>");

			for (int i = 0; i < cookies.length; i++) {
				cookie = cookies[i];
				out.print("Name : " + cookie.getName() + ",  ");
				out.print("Value: " + cookie.getValue() + " <br/>");
			}
		} else {
			out.println("<h2>No cookies founds</h2>");
		}
	}

	// Method to handle POST method request.
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

}
