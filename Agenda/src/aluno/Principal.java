package aluno;

public class Principal {

	public static void main(String[] args) {
		
		Contato cont1 = new Contato("88997448130", "Keyssinho"); 
		Contato cont2 = new Contato("87988382096", "Torcaio"); 
		Contato cont3 = new Contato("88994496036", "Dudu");
		
		Cadastro cadastro = new Cadastro();
		
		cadastro.adicionarContato(cont1);
		cadastro.adicionarContato(cont2);
		cadastro.adicionarContato(cont3);
		
		cadastro.getContatos();
		
		cadastro.atualizarContato("88997448130", "Rei delas 2019");
		cadastro.atualizarContato("87988382096", "Corno manso");
		cadastro.atualizarContato("88994496036", "Aldacelio Cuseco");
		
		cadastro.getContatoByTel("88997448130");
		cadastro.getContatoByTel("87988382096");
		cadastro.getContatoByTel("88994496036");
		
		cadastro.getContatos();
		
		cadastro.removerContato("87988382096");
		
		cadastro.getContatos();
		
		cadastro.resetAgenda();
		
		cadastro.getContatos();
		
		
	}

}
