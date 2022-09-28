package elementos;

import org.openqa.selenium.By;

public class Elementos1 {
	
	// Elementos edição de cadastro
	
	private By entrar = By.xpath("//*[@id=\"root\"]/div/div[2]");
	private By editar = By.cssSelector("#root > div > div.sc-jqUVSM.jkrDKT > div.sc-jSMfEi.iuhvyf > div:nth-child(4) > div:nth-child(5) > div:nth-child(3) > svg > path");
	private By editarnome = By.xpath("//*[@id=\"root\"]/div/div[2]/input");
	private By editaremail = By.xpath("//*[@id=\"root\"]/div/div[3]/input");
	private By editarcpf = By.xpath("//*[@id=\"root\"]/div/div[4]/input");
	private By editartelefone = By.xpath("//*[@id=\"root\"]/div/div[5]/input");
	private By atualizar = By.xpath("//*[@id=\"root\"]/div/div[6]");
	public By getEntrar() {
		return entrar;
	}
	public By getEditar() {
		return editar;
	}
	public By getEditarnome() {
		return editarnome;
	}
	public By getEditaremail() {
		return editaremail;
	}
	public By getEditarcpf() {
		return editarcpf;
	}
	public By getEditartelefone() {
		return editartelefone;
	}
	public By getAtualizar() {
		return atualizar;
	}

}
