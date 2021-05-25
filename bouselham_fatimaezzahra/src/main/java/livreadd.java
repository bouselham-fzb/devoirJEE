

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.dao.LivreDAO;


/**
 * Servlet implementation class livreadd
 */
@WebServlet("/livreadd")
public class livreadd extends HttpServlet {
	private static final long serialVersionUID = 1L;
       LivreDAO lv;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public livreadd() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		lv=new LivreDAO();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		PrintWriter out = response.getWriter();
		String ref=request.getParameter("ref");
		String titre=request.getParameter("titre");
		String auteur=request.getParameter("auteur");
		String categorie=request.getParameter("categorie");
		int nb=lv.addlivre(ref,titre,auteur,categorie);
		
		   response.sendRedirect("livres.jsp");
	}

}
