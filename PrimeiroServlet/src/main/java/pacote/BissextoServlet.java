package pacote;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import org.eclipse.jdt.internal.compiler.flow.ExceptionHandlingFlowContext;

/**
 * Servlet implementation class BissextoServlet
 */
public class BissextoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private String saudacao;
	
	public String getSaudacao() {
		return saudacao;
	}

	public void setSaudacao(String saudacao) {
		this.saudacao = saudacao;
	}

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public BissextoServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		Long id = 0L;
		boolean controle = false;
		
		try {
			
			id = Long.parseLong(req.getParameter("id"));
			
		} catch (Exception e) {
			controle = true;
		}
		
		
		PrintWriter saida = resp.getWriter();
		
		saida.print("<html lang=\"pt-br\"><head><meta charset=\"UTF-8\"></head>"
				  + "<title>" + getSaudacao() + "</title><body><h1><b><marquee>");
		
		if(controle) {
			saida.print("O valor fornecido para o ID do item é inválido");
		} else {
			saida.print("Removendo o item de ID " + id);
		}
		
		saida.print("</marquee></b></h1></body></html>");
		
	}

	@Override
	protected void doTrace(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
		
		arg1.setContentType("text/html");
		
		PrintWriter saida = arg1.getWriter();
		saida.print("<html lang=\"pt-br\"><head><meta charset=\"UTF-8\"></head>"
				  + "<title>" + getSaudacao() + "</title><body><h1><b>");
		
		arg0.getHeaderNames().asIterator().forEachRemaining(i -> {
			
			try {
				
				saida.print(i + " => " + arg0.getHeader(i) + "<br>");
				
			} catch(Exception e) {
				e.printStackTrace();
			}
			
		});
		
		saida.print("</b></h1></body></html>");	
		
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		setSaudacao("Seja bem-vindo(a)!");
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doDelete(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		Integer ano = 0;
		boolean bissexto = false;

		try {
			ano = Integer.parseInt(request.getParameter("ano"));
		} catch (Exception e) {
			e.printStackTrace();
		}

		if ((ano != 0) && ((ano % 4) == 0)) {
			bissexto = true;
		}

		PrintWriter saida = response.getWriter();

		saida.print("<html lang=\"pt-br\">" + "<head><meta charset=\"UTF-8\"></head>"
				+ "<title>" + getSaudacao() + "</title>" + "<body> "
				+ (ano == 0 ? "Valor inválido para ano"
				: bissexto ? "O ano " + ano + " é bissexto" :
					"O ano " + ano + " não é bissexto")
				
				+ " </body>" + "</html>");

	}

}
