package com.nttdata.steps;

import com.nttdata.page.LoginPage;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class LoginSteps {

    private WebDriver driver;

    //constructor
    public LoginSteps(WebDriver driver){
        this.driver = driver;
    }

    /**
     * Escribir el usuario
     * @param user el usuario
     */
    public void typeUser(String user){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement iniciarSesionButton = wait.until(ExpectedConditions.visibilityOfElementLocated(LoginPage.IniciarSesion));
        iniciarSesionButton.click();
        WebElement userInputElement = driver.findElement(LoginPage.userInput);
        userInputElement.sendKeys(user);
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(444));
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        //wait.until(ExpectedConditions.visibilityOfElementLocated(LoginPage.loginButton));



    }

    /**
     * Escribir el password
     * @param password el password del usuario
     */
    public void typePassword(String password){
        this.driver.findElement(LoginPage.passInput).sendKeys(password);
    }

    /**
     * Hacer click en el botón login
     */
    public void login(){
        this.driver.findElement(LoginPage.loginButton).click();
        WebDriverWait wait = new WebDriverWait(this.driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(LoginPage.CLICKCLOTHESt)).click();
        try {
            Thread.sleep(4000); // Pausa de 2 segundos
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        WebDriverWait wait1 = new WebDriverWait(this.driver, Duration.ofSeconds(10));
        wait1.until(ExpectedConditions.elementToBeClickable(LoginPage.CLICKMEN)).click();
        try {
            Thread.sleep(4000); // Pausa de 2 segundos
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        //JavascriptExecutor js = (JavascriptExecutor) driver;
        //js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
//        WebDriverWait wait2 = new WebDriverWait(this.driver, Duration.ofSeconds(10));
//        wait2.until(ExpectedConditions.elementToBeClickable(LoginPage.CLICKMEN)).click();
//        try {
//            Thread.sleep(4000); // Pausa de 2 segundos
//        } catch (InterruptedException e) {
//            Thread.currentThread().interrupt();
//        }
        WebDriverWait wait3 = new WebDriverWait(this.driver, Duration.ofSeconds(10));
        wait3.until(ExpectedConditions.elementToBeClickable(LoginPage.CLICKPRODCUTO)).click();
        try {
            Thread.sleep(4000); // Pausa de 2 segundos
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        WebDriverWait wait4 = new WebDriverWait(this.driver, Duration.ofSeconds(10));
        wait4.until(ExpectedConditions.elementToBeClickable(LoginPage.CLICKCANTPRODUCTO)).click();
        try {
            Thread.sleep(4000); // Pausa de 2 segundos
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        WebDriverWait wait5 = new WebDriverWait(this.driver, Duration.ofSeconds(10));
        wait5.until(ExpectedConditions.elementToBeClickable(LoginPage.BTNAÑADIRCARRITO)).click();
        try {
            Thread.sleep(4000); // Pausa de 2 segundos
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    public void finalizarcompra() {
        WebDriverWait wait = new WebDriverWait(this.driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(LoginPage.BTNCARRITO)).click();
        try {
            Thread.sleep(4000); // Pausa de 2 segundos
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
