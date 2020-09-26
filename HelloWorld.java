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
		
		//�H�U�T�ؤ�k�H�קK�s�������󪺧֨�.
		//����1.2�إi�u�ܤ@�ϥ�, ����ĳ��̳��g�W, ��@��ƥάɽu.
		res.setHeader("Cache-Control", "no-store"); //HTTP1.1
		res.setHeader("Pragma", "no-cache"); //HTTP 1.0
		res.setDateHeader("Expires", 0);
		
		int size = res.getBufferSize(); // returns 8192 or greater
 	    log("The default buffer size is " + size);

		out.println("<HTML>");
		out.println("<HEAD><TITLE>Hello World</TITLE></HEAD>");
		out.println("<BODY>");
		out.println("<BIG>Hello World , �@�ɧA�n !</BIG>="+(++count));
		out.println("</BODY></HTML>");
	}
}