package metodos;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MetodosDeTestes {

	WebDriver driver;

	// Configurar browser
	public void abrirNavagedor(String url) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();

	}

	// Preencher os campos
	public void escreverCampos(By elemento, String input) {
		driver.findElement(elemento).sendKeys(input);

	}

	public void clicar(By elemento) {
		driver.findElement(elemento).click();
	}

	// public void validarMsg(By elemento, String textoSite) {
	// String textoEscrito = driver.findElement(elemento).getText();
	// assertTrue(textoEscrito);

//	}

	public void fecharNavegador() {
		driver.quit();

	}

	public void printScreen(String nomeEvidencia) {
		try {
			TakesScreenshot scrShot = (TakesScreenshot) driver;
			File srcFile = scrShot.getScreenshotAs(OutputType.FILE);
			File destFile = new File("./evidencia/" + nomeEvidencia + ".png");
			FileUtils.copyFile(srcFile, destFile);

		} catch (Exception e) {

			System.err.println("*************Erro***************");
			System.err.println("***********Causa do Erro*************" + e.getCause());

		}
		
		

	}

}
