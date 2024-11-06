package com.conceptandcoding.firstspring;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

import org.springframework.stereotype.Component;

@WebServlet("/simple-servlet")
@Component
public class MyServlet implements Servlet {

	@Override
	public void init(ServletConfig servletConfig) throws ServletException {
		// Initialization code here
	}

	@Override
	public ServletConfig getServletConfig() {
		return null;
	}

	@Override
	public void service(ServletRequest servletRequest, ServletResponse servletResponse)
			throws ServletException, IOException {
		servletResponse.setContentType("text/html");
		PrintWriter out = servletResponse.getWriter();
		out.println("<html><body>");
		out.println("<h1>Hello from the Servlet!</h1>");
		out.println("</body></html>");
	}

	@Override
	public String getServletInfo() {
		return "MyServlet";
	}

	@Override
	public void destroy() {
		// Cleanup code
	}
}
