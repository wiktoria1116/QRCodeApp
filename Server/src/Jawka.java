

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;

/**
 * Servlet implementation class Jawka
 */
@WebServlet("/welcome")
public class Jawka extends HttpServlet {
	private static final long serialVersionUID = 1L;


	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("Input Init");
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	System.out.println("Input Destroy");
	}

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Input Service");
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	private Jackson jackson = Jackson();
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		Codes codes = new Codes(1, "001" , "http://192.168.0.59:8085/NaszServer/index.html");
        String codesJsonString = this.jackson.toJson(codes);
 
        PrintWriter out = response.getWriter();
        response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");
        out.print(codesJsonString);
        out.flush();  

	}

	private Jackson Jackson() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
		PrintWriter out = response.getWriter();
		int id = Integer.parseInt(request.getParameter("id"));
		String name = request.getParameter("uname");
		String path = request.getParameter("pass");
		
		try {
			Class.forName("org.sqlite.JDBC");
			Connection conn=DriverManager.getConnection("jdbc.sqlite:C:\\Program Files\\Apache Software Foundation\\Tomcat 9.0\\maps.sqlite");
			Statement st = conn.createStatement();
			String sql = "insert into map (Name,Uname,Password,Image)";
			st.executeUpdate(sql);
			out.println("Data is succefully inserted into map table");
		}catch(ClassNotFoundException e) {e.printStackTrace();
		}
		

		catch(Exception e)
		{
		JOptionPane.showMessageDialog(null, e);
		
		}
	
	}

}
