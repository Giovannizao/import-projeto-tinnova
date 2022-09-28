package elementos;

import org.openqa.selenium.By;

public class Elementos {

	
	// Criar cadastro
	
	private By entrar = By.xpath("//*[@id=\"root\"]/div/div[2]");
	private By adicionar = By.xpath("//*[@id=\"root\"]/div/div[3]");
	private By digiteseunome = By.xpath("//*[@id=\"root\"]/div/div[2]/input");
	private By digiteseuemail = By.xpath("//*[@id=\"root\"]/div/div[3]/input");
	private By digiteseucpf = By.xpath("//*[@id=\"root\"]/div/div[4]/input");
	private By digiteseutelefone = By.xpath("//*[@id=\"root\"]/div/div[5]/input");
	private By guardar = By.xpath("//*[@id=\"root\"]/div/div[6]");
	
			

	public By getGuardar() {
		return guardar;
	}



	public By getDigiteseunome() {
		return digiteseunome;
	}



	public By getDigiteseuemail() {
		return digiteseuemail;
	}



	public By getDigiteseucpf() {
		return digiteseucpf;
	}



	public By getDigiteseutelefone() {
		return digiteseutelefone;
	}



	public By getAdicionar() {
		return adicionar;
	}
	
	public By getEntrar() {
		return entrar;
	}




	
}