package testes;

import org.junit.Test;
import org.openqa.selenium.By;

import metodos.MetodosDeTestes;

public class ExecutarTeste1 {

	MetodosDeTestes metodos = new MetodosDeTestes();

	@Test
	public void enviarForm() {

		metodos.abrirNavagedor("https://www.selenium.dev/selenium/web/web-form.html");
		metodos.escreverCampos(By.name("my-text"), "Fernando Carvalho");
		metodos.escreverCampos(By.name("my-password"), "2023");
		metodos.escreverCampos(By.name("my-textarea"), "Feliz na evolução, buscando ser melhor a cada dia.");
		metodos.escreverCampos(By.xpath("//select[@class = 'form-select']"), "two");
		metodos.escreverCampos(By.xpath("//input[@placeholder= 'Type to search...']"), "Seattle");
		metodos.clicar(By.xpath("//button[@type='submit']"));		
		//metodos.fecharNavegador();
		
	}
	
	

}
