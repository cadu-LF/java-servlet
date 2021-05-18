package gerenciador;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class NovaEmpresa
 */
@WebServlet("/nova-empresa")
public class NovaEmpresa extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("Cadastro realizado");

		// uma requesição feita pelo navegador
		// request.getParameter(); retorna sempre uma String e lê um parâmetro
		String nome = request.getParameter("nome");
		
		PrintWriter out = response.getWriter();
		out.println("<html><body>Empresa " + nome + " cadastrada com sucesso</body></html>");
		
		
	}

}
