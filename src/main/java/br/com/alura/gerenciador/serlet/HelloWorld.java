package br.com.alura.gerenciador.serlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 
 * @author Cadu
 *
 * Criando uma classe servlet que utiliza o protocolo http
 * http trabalha com requisi��o e resposta, o navegador faz a requisi��o e a 
 * aplica��o retorna a resposta
 * Em http tem duas formas de enviar uma resposta:
 *    1. Definir um fluxo bin�rio(gerar um gr�fico, relat�rio em pdf)
 *       resp.getOutputStream();
 *    2. Um conjunto de caracteres(texto)
 *       resp.getWriter();
 * Anota��es configuram algo no c�digo java 
 */

// definindo a url que o navegador deve requisitar para chamar essa classe
@WebServlet(urlPatterns = "/hello")
public class HelloWorld extends HttpServlet{
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		
		PrintWriter out = resp.getWriter();
		// out imprime no fluxo de resposta do navegador
		out.println("<html>");
		out.println("<body>");
		out.println("Hello World!");
		out.println("</body>");
		out.println("</html>");
		
	}
	
}
