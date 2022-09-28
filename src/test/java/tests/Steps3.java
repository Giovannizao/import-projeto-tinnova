/*package tests;


import elementos.Elementos3;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pages.Metodos;

public class Steps3 {

	Metodos metodos = new Metodos();
	Elementos3 elementos = new Elementos3();
	
	
	@Dado("que eu esteja no site {string}")
	public void que_eu_esteja_no_site(String appUrl) {
	metodos.abrirNavegador(appUrl, "acessando o site");	
	
	}
	
	@Quando("clicar em entrar")
	public void clicar_em_entrar() {
	metodos.clicar(elementos.getEntrar());
	    
	}

	@Entao("excluo o cadastro selecionado")
	public void excluo_o_cadastro_selecionado() {
		metodos.clicar(elementos.getExcluir());
	    
	}
}
