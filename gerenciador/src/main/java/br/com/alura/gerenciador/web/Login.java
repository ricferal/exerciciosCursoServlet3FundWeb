package br.com.alura.gerenciador.web;

import java.util.HashMap;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import br.com.alura.gerenciador.Usuario;
import br.com.alura.gerenciador.dao.UsuarioDAO;

public class Login implements Tarefa{
	
	final static Map<String,String> USUARIOS_LOGADOS = new HashMap<>();
	
	@Override
	public String executa(HttpServletRequest req, HttpServletResponse resp) {
		// TODO Auto-generated method stub
		String senha = req.getParameter("senha");
		String email = req.getParameter("email");
		Usuario usuario = new UsuarioDAO().buscaPorEmailESenha(email, senha);
		if(usuario == null){
			return "<html><body>Usuario Invalido</body></html>";
		}else{
			HttpSession session = req.getSession();
			session.setAttribute("usuarioLogado", usuario);
			return "<html><body>Usuario logado: "+email+"</body></html>";
		}
	}
	

}
