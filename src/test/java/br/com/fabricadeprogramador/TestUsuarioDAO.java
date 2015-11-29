package br.com.fabricadeprogramador;

import br.com.fabricadeprogramador.persistencia.entidade.Usuario;
import br.com.fabricadeprogramador.persistencia.jdbc.UsuarioDAO;

public class TestUsuarioDAO {

	public static void main(String[] args) {
		testExcluir();
	}
	
	public static void testExcluir(){
		// excluindo o usuário
		Usuario usu = new Usuario();
		usu.setId(3);
		
		//excluindo usuario no banco
		UsuarioDAO usuDAO = new UsuarioDAO();
		usuDAO.excluir(usu); 
		System.out.println("Excluído com sucesso!");
	
	
}
	
	public static void testAlterar(){
		// Alterando o usuário
		Usuario usu = new Usuario();
		usu.setId(1);
		usu.setNome("Fabbius Maximus");
		usu.setLogin("fabbius");
		usu.setSenha("123");
		//excluindo usuario no banco
		UsuarioDAO usuDAO = new UsuarioDAO();
		usuDAO.alterar(usu); 
		System.out.println("Alterado com sucesso!");
	
	
}
	
		public static void testCadastrar(){
			// criando o usuário
			Usuario usu = new Usuario();	
			usu.setNome("Fabbio");
			usu.setLogin("fabbio");
			usu.setSenha("123");
			//cadastrando usuario no banco
			UsuarioDAO usuDAO = new UsuarioDAO();
			usuDAO.cadastar(usu); 
			System.out.println("Cadastrado com sucesso!");
		
		
	}

}
