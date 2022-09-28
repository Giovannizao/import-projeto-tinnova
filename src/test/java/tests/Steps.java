package tests;

import elementos.Elementos;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pages.Metodos;

public class Steps {
	
	Metodos metodos = new Metodos();
	Elementos elementos = new Elementos();
	
	
	@Dado("que eu esteja no site {string}")
	public void que_eu_esteja_no_site(String appUrl) {
	metodos.abrirNavegador(appUrl, "acessando o site");	
	metodos.clicar(elementos.getEntrar());
	metodos.clicar(elementos.getAdicionar());
	
	}

	@Quando("realizar o preenchimento de todos os campos")
	public void realizar_o_preenchimento_de_todos_os_campos() {
	metodos.escrever("Junior Luiz Alves", elementos.getDigiteseunome());	
	metodos.escrever("junior.alves@hotmail.com", elementos.getDigiteseuemail());
	metodos.escrever("404.905.090-91", elementos.getDigiteseucpf());
	metodos.escrever("(11) 99689-4885", elementos.getDigiteseutelefone());
	
		
		
	}

	@Entao("finalizo o cadastro")
	public void finalizo_o_cadastro() {
		
	    
	}

	
	
}
