

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;

@WebServlet("/InterfaceDemo")
public class InterfaceDemo implements Servlet {
	ServletConfig config=null;
	public void inti(ServletConfig config) {
		this.config=config;
		System.out.println("intialization compplete");
	}

    public void services(ServletRequest req,ServletResponse res)
    
     throws IOException,ServletException{
    	res.setContentType("text/html");
    	PrintWriter pwriter=res.getWriter();
    	pwriter.print("<html>");
    	pwriter.print("<body>");
    	pwriter.print("in the service() method<br>");
    	pwriter.print("</body>");
    	pwriter.print("/html");
    }
	public void destroy() {
		System.out.println("in destroy() method");
	}
	public ServletConfig getServletConfig() {
		return config;
	}
	public String getServletInfo() {
		return "this is a sample servlet info";
	}
}