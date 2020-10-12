package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import clientWS_Calc.MyCalculator;



/**
 * Servlet implementation class MyCalc_Servlet
 */
@WebServlet("/MyCalc_Servlet")
public class MyCalc_Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyCalc_Servlet() {
        super();

    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// response.getWriter().append("Served at: ").append(request.getContextPath());
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// doGet(request, response);
		MyCalculator client = new MyCalculator();
		String type = request.getParameter("type").toString();
		PrintWriter out = response.getWriter();
		if (type.contains("number")) {
			String value = request.getParameter("value").toString();
			if(value.equals("")){
				out.write("error: Please, provide a value!");  
			}else{
				String result = "";
				if(type.equals("number")) {
					result = client.convert2word(value);
					out.write("" + result);
				}else{
					return;
				}
			}
		}else {
			String intA = request.getParameter("intA").toString();
			String intB = request.getParameter("intB").toString();

			if(intA.equals("") || intB.equals("")){
				out.write("error: Please, provide a value!");  
			}else{
				int result = 0;
				if(type.contains("add")) {
				result = client.addition(intA,intB);
				out.write("" + result);
				}
				if(type.contains("sub")) {
					result = client.substraction(intA, intB);
					out.write("" + result);
				}
				if(type.contains("times")) {
					result= client.multiplication(intA, intB);
					out.write("" + result);
				}
				if(type.contains("div")) {
				result = client.division(intA, intB);
				out.write("" + result);
				}
				else {
					return;
				}
			}				
		}				 
		out.flush();
	    out.close();
	}

}
