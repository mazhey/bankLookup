package BankBalanceLookup;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class BankServelt
 */
@WebServlet("/BankServelt")
public class BankServelt extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public BankServelt() {
        super();
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		processLogin(request,response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processLogin(request,response);
	}

	protected void processLogin(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String customerId = request.getParameter("customerid");
		CustomerSimpleMap c =new CustomerSimpleMap();
		Customer cust=c.findCustomer(customerId);
		//HttpSession session = request.getSession();
		 //session.setAttribute("customerBank",  cust);
		if (cust == null){
			getServletContext().getRequestDispatcher("/UnknownCustomerID.jsp").forward(request, response);}
		else{
		 if (cust.getBalance()<0){
			getServletContext().getRequestDispatcher("/NegativeBalance.jsp").forward(request, response);
		}else if(cust.getBalance()<2000 && cust.getBalance()>0){
			
			getServletContext().getRequestDispatcher("/RegularBalance.jsp").forward(request, response);
		}else if(cust.getBalance()>2000){
			getServletContext().getRequestDispatcher("/HighBalance.jsp").forward(request, response);
			
		}
		 
		}
		
	}
}
