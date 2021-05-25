

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
import javax.servlet.http.HttpSession;

import com.dao.LivreDAO;
import com.model.Etudiant;
import com.model.Livre;

/**
 * Servlet implementation class servecat
 */
@WebServlet("/servecat")
public class servecat extends HttpServlet {
	private static final long serialVersionUID = 1L;
       LivreDAO lc;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public servecat() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		lc=new LivreDAO();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter out = response.getWriter();

		String c=request.getParameter("cat");
		System.out.println("coooooooocoooo"+c);
		List<Livre> lgs=new ArrayList<Livre>();
		lgs=lc.livreByCategorie(c);
		request.setAttribute("ctg", lgs);
			   if(lgs != null)
			   {
				   request.getRequestDispatcher("Clivres.jsp").forward(request, response);
		//	   response.sendRedirect("Clivres.jsp?categorie="+request.getParameter("cat"));
			   }
		   else
			  
			   {
				out.print("la catégorie "+c+"n'existe pas");
			   	response.sendRedirect("livres.jsp");
			   }
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		
	}

}
