package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.ContractEmployee;
import com.model.Employee;
import com.model.EmployeeManager;
import com.model.RegularEmployee;

/**
 * Servlet implementation class AddEmployee
 */
@WebServlet("/AddEmployee")
public class AddEmployee extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddEmployee() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 response.setContentType("text/html");
		    PrintWriter pw = response.getWriter();
		    String ack = "";
		    try
		    {
		      EmployeeManager EM = new EmployeeManager();
		      //Employee Class
		      int id = Integer.parseInt(request.getParameter("id"));
		      String name = request.getParameter("name");
		      Employee E = new Employee();
		      E.setId(id);
		      E.setName(name);
		      
		      //Regular Employee Class
		      int rid = Integer.parseInt(request.getParameter("rid"));
		      String rname = request.getParameter("rname");
		      double salary = Double.parseDouble(request.getParameter("salary"));
		      int bonus = Integer.parseInt(request.getParameter("bonus"));
		      RegularEmployee R = new RegularEmployee();
		      R.setId(rid);
		      R.setName(rname);
		      R.setSalary(salary);
		      R.setBonus(bonus);
		      
		      //Contract Employee Class
		      int cid = Integer.parseInt(request.getParameter("cid"));
		      String cname = request.getParameter("cname");
		      double payperhour = Double.parseDouble(request.getParameter("payperhour"));
		      String duration = request.getParameter("duration");
		      ContractEmployee C = new ContractEmployee();
		      C.setId(cid);
		      C.setName(cname);
		      C.setPayperhour(payperhour);
		      C.setDuration(duration);
		      
		      ack = EM.insertData(E, R, C);
		    }catch(Exception e)
		    {
		      ack = e.getMessage();
		    }
		    pw.println(ack);
		    RequestDispatcher RD = request.getRequestDispatcher("index.jsp");
		    RD.include(request, response);
		  }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
