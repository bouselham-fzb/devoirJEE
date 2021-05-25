

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.EtudiantDAO;

/**
 * Servlet implementation class serveadd
 */
@WebServlet("/serveadd")
public class serveadd extends HttpServlet {
	private static final long serialVersionUID = 1L;
	EtudiantDAO et;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public serveadd() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		et=new EtudiantDAO();

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		String name=request.getParameter("nom");
		String fname=request.getParameter("prenom");
		int eage=Integer.parseInt(request.getParameter("age"));
		String log=request.getParameter("login");
		String pass=request.getParameter("password");
		int nb=et.addEtudiant(name,fname,eage,log,pass);
		
		   response.sendRedirect("livres.jsp");
	}

}
