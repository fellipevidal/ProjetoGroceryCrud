package elementos;

import org.openqa.selenium.By;

public class ElementosWeb {

	public By versao = By.xpath("//select[@id='switch-version-select']");
	public By nome = By.id("field-customerName");
	public By ultimoNome = By.id("field-contactLastName");
	public By firstName = By.id("field-contactFirstName");
	public By tel = By.id("field-phone");
	public By end = By.id("field-addressLine1");
	public By cidade = By.id("field-city");
	public By estado = By.id("field-state");
	public By cep = By.id("field-postalCode");
	public By pais = By.id("field-country");
	public By funcionario = By.xpath("//div[@class='chosen-container chosen-container-single']");
	public By chosen = By.xpath("//div[@class='chosen-search']");
	public By credito = By.id("field-creditLimit");
	
}
	
