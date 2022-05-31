package steps;

import java.io.IOException;

import io.cucumber.java.es.Dado;
import io.cucumber.java.it.Quando;
import io.cucumber.java.pt.Entao;
import pages.AdicionarUsuarioPage;

public class AdicionarUsuarioTeste {
	
	AdicionarUsuarioPage addUsuario = new AdicionarUsuarioPage();

	@Dado("que esteja com bootstrap v4")
	public void queEstejaComBootstrapV4() {
		
		addUsuario.selecionarVersao("Bootstrap V4 Theme");

	}

	@Dado("acione add customer")
	public void acioneAddCustomer() {
		
		addUsuario.addUsuario();
		
	}

	@Quando("salvar o formulario")
	public void salvarOFormulario() {
		
		addUsuario.preencherCampos("john", "wick", "revers", "11-9531-3412", "rua compton", "New York", "Oklahoma", "06123-125", "EUA", "30000");
		addUsuario.salvar();

		
	}

	@Entao("validamos mensagem de sucesso")
	public void validamosMensagemDeSucesso() throws IOException {
		
		addUsuario.aguardar();
		addUsuario.validarMensagem("Your data has been successfully stored into the database.");
		
		
	
	}

}
