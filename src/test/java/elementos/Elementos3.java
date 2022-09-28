package elementos;

import org.openqa.selenium.By;

public class Elementos3 {

	
	private By entrar = By.xpath("//*[@id=\"root\"]/div/div[2]");
	private By excluir = By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[4]/div[5]/div[3]");
	
	
	public By getEntrar() {
		return entrar;
	}
	public By getExcluir() {
		return excluir;
	}
	
}
