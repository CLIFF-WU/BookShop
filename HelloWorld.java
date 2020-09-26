//package servlet_examples;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class HelloWorld extends HttpServlet {

	int count =0;

	public void doGet(HttpServletRequest req, HttpServletResponse res)
			                         throws ServletException, IOException {
		doPost(req, res);

	}

	public void doPost(HttpServletRequest req, HttpServletResponse res)
			                          throws ServletException, IOException {

		res.setContentType("text/html; charset=Big5");
		PrintWriter out = res.getWriter();
		
		//以下三種方法以避免瀏覽器對文件的快取.
		//雖第1.2種可只擇一使用, 但建議兩者都寫上, 其一當備用界線.
		res.setHeader("Cache-Control", "no-store"); //HTTP1.1
		res.setHeader("Pragma", "no-cache"); //HTTP 1.0
		res.setDateHeader("Expires", 0);
		
		int size = res.getBufferSize(); // returns 8192 or greater
 	    log("The default buffer size is " + size);

		out.println("<HTML>");
		out.println("<HEAD><TITLE>Hello World</TITLE></HEAD>");
		out.println("<BODY>");
		out.println("<BIG>Hello World , 世界你好 !</BIG>="+(++count));
		out.println("</BODY></HTML>");
	}
}