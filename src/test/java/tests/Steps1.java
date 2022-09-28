package tests;

/*import elementos.Elementos1;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pages.Metodos;

public class Steps1 {

	Metodos metodos = new Metodos();
	Elementos1 elementos = new Elementos1();

	@Dado("que eu esteja no site {string}")
	public void que_eu_esteja_no_site(String appUrl) {
		metodos.abrirNavegador(appUrl, "acessando o site");
		metodos.clicar(elementos.getEntrar());
		metodos.clicar(elementos.getEditar());
	}

	@Quando("realizar a alteracao de todos os campos")
	public void realizar_a_alteracao_de_todos_os_campos() {
		metodos.escrever("Antonio Luiz", elementos.getEditarnome());
		metodos.escrever("antonio.luiz@hotmail.com", elementos.getEditaremail());
		metodos.escrever("407.929.092-91", elementos.getEditarcpf());
		metodos.escrever("(11) 99229-2185", elementos.getEditartelefone());

	}

	@Entao("atualizo o cadastro")
	public void atualizo_o_cadastro() {
		metodos.clicar(elementos.getAtualizar());

	}
}
