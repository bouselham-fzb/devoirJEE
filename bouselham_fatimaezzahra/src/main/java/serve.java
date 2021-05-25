

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.EtudiantDAO;
import com.model.Etudiant;

/**
 * Servlet implementation class serve
 */
@WebServlet("/serve")
public class serve extends HttpServlet {
	private static final long serialVersionUID = 1L;
	EtudiantDAO EtudiantM;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public serve() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		  EtudiantM = new EtudiantDAO();

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		
		
		   String lg=request.getParameter("login");
		   String ps=request.getParameter("password");
		   Etudiant e=EtudiantM.authentification(lg, ps);
		   if(e!=null)
		   {
			   HttpSession ses = request.getSession(true);
			   
			   
			   ses.setAttribute("etudiant", e);
			   
			   response.sendRedirect("livres.jsp");
		   }else
			  
			   {
			   	response.sendRedirect("index.jsp");
			   }
			
	}

}
