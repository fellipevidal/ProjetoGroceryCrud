package metodos;

import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import drivers.DriversFactory;

public class MetodosDeTestes extends DriversFactory {
	
	
	public void clicar(By elemento) {
		
		driver.findElement(elemento).click();
		
	}

	public void digitar(By elemento, String texto) {
		
		driver.findElement(elemento).sendKeys(texto);
		
	}
	
	public void validarTexto(By elemento, String textoEsperado) {
		
		String textoCapturado = driver.findElement(elemento).getText();
		assertTrue(textoCapturado.contains(textoEsperado));
		
	}
	
	public void esperar() {
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
	}
	
	public void tirarFoto(String nomeEvidencia) throws IOException {
		
		TakesScreenshot scrShot = (TakesScreenshot) driver;
		File srcFile = scrShot.getScreenshotAs(OutputType.FILE);
		File destFile = new File("./evidencias/" + nomeEvidencia + ".png");
		FileUtils.copyFile(srcFile, destFile);
		
	}
}

