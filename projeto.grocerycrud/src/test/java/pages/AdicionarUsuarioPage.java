package pages;

import java.io.IOException;

import org.openqa.selenium.By;

import elementos.ElementosWeb;
import metodos.MetodosDeTestes;

public class AdicionarUsuarioPage {
	
	MetodosDeTestes metodos = new MetodosDeTestes();
	ElementosWeb elemento = new ElementosWeb();
	
	By addUusario = By.xpath("//a[@href='/v1.x/demo/bootstrap_theme_v4/add']");
	By msg = By.xpath("//div[@id='report-success']/p");
	By btnSalvar = By.xpath("//button[@id='form-button-save']");

	public void selecionarVersao(String versao) {

	metodos.digitar(elemento.versao, versao);	
	
	}
	
	public void addUsuario() {
		
		metodos.clicar(addUusario);
	}
	
	public void preencherCampos(String nome, String ultimoNome, String firstName, String tel, String end, String cidade, String estado, String cep, String pais, String credito) {
		
		metodos.digitar(elemento.nome, nome);
		metodos.digitar(elemento.ultimoNome, ultimoNome);
		metodos.digitar(elemento.firstName, firstName );
		metodos.digitar(elemento.tel, tel);
		metodos.digitar(elemento.end, end);
		metodos.digitar(elemento.cidade, cidade);
		metodos.digitar(elemento.estado, estado);
		metodos.digitar(elemento.cep, cep);
		metodos.digitar(elemento.pais, pais);
		metodos.clicar(elemento.funcionario);
		metodos.digitar(elemento.credito, credito);
		
	}
	
	
	public void salvar() {
		
		metodos.clicar(btnSalvar);
	}
	
	
	
	public void validarMensagem(String addUsuario) throws IOException {
		
		metodos.validarTexto(msg, addUsuario);
		metodos.tirarFoto("CT01 - Adicionar Usuario");
	}
	
	public void aguardar() {
		
		metodos.esperar();
	}
	
}