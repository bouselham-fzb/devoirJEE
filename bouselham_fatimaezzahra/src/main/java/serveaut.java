

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.LivreDAO;
import com.model.Livre;

/**
 * Servlet implementation class serveaut
 */
@WebServlet("/serveaut")
public class serveaut extends HttpServlet {
	private static final long serialVersionUID = 1L;
       LivreDAO la;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public serveaut() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
   
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		la = new LivreDAO();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	/*	PrintWriter out = response.getWriter();

		String aut=request.getParameter("aut");
		String msg="";
		List<Livre> las=new ArrayList<Livre>();
		las=la.livreByAuthor(aut);
		
			   if(las != null)
			   {
				   msg = "la liste des livre de l'auteur "+ aut;
				   request.setAttribute("message", msg);
				   response.sendRedirect("Alivres.jsp?auteur="+request.getParameter("cat"));

				 //this.getServletContext().getRequestDispatcher("/Alivres.jsp").forward(request,response);
			   }
			   else { msg = "auteur n'existe pas !!";
					   
			   request.setAttribute("message", msg);
			  //this.getServletContext().getRequestDispatcher("/livres.jsp").forward(request,response);
			   response.sendRedirect("Alivres.jsp");

			   }*/
			PrintWriter out = response.getWriter();
				String a=request.getParameter("aut");
				System.out.println("coooooooocoooo"+a);
				List<Livre> las=new ArrayList<Livre>();
				las=la.livreByAuthor(a);
				request.setAttribute("atr", las);
					   if(las != null)
					   {
						   request.getRequestDispatcher("Alivres.jsp").forward(request, response);
				//	   response.sendRedirect("Clivres.jsp?categorie="+request.getParameter("cat"));
					   }
				   else
					  
					   {
						out.print("auteur "+a+"n'existe pas");
					   	response.sendRedirect("livres.jsp");
					   }
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
