package feedback_app;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/feedback")
public class FeedbackServlet extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String email=req.getParameter("useremail");
		String phone=req.getParameter("usephone");
		String feedbackmessage =  req.getParameter("usemessage");
		resp.setContentType("text/html");
		PrintWriter writer= resp.getWriter();
		writer.println("Feedback Servlet Working");
		writer.println(email);
		writer.println(phone);
		writer.println(feedbackmessage);
		
	}

}
