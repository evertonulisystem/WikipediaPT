package br.edu.gotasdetecnologia.simples;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import javax.swing.*;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Artigo {
    String url;
    WebDriver driver;

    @Before
    public void iniciar(){
        url = "https://pt.wikipedia.org/";
        //System.setProperty("webdriver.chrome.driver","drivers/chromedriver92/chromedriver.exe");
        System.setProperty("webdriver.gecko.driver","drivers/firefox/geckodriver.exe");
        //driver = new ChromeDriver();
        driver= new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        //driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(120000, TimeUnit.MILLISECONDS);
        }
    String atualtitulo = "";

    @Test
    public void consultarArtigo() {
        driver.get(url);
        driver.findElement(By.name("search")).sendKeys("Ovos de Páscoa");
        driver.findElement(By.cssSelector("button.wvui-button.wvui-typeahead-search__submit.wvui-button--action-default.wvui-button--type-normal.wvui-button--framed")).click();
        //assertEquals("Ovo de Páscoa - Wikipédia, a enciclopédia livre", driver.getTitle());
        assertTrue(driver.getTitle().contains("livre"));
        atualtitulo = driver.getTitle();

        if (atualtitulo.contains("livre")) {
            JOptionPane.showMessageDialog(null,"SEJA BEM VINDO A AREA DA AUTOMAÇÃO","SUCESSO",JOptionPane.ERROR_MESSAGE);
            //System.out.println("Teste com sucesso meu garoto!");
        } else {
            System.out.println("Teste falhou boy.");
        }

    }
        @After
        public void finalizar() {
            //driver.quit();
            //driver.close();
        }

    }
