package com.nttdata.page;

import org.openqa.selenium.By;

public class LoginPage {

    //Localizadores de elementos
    public static By userInput = By.xpath("//*[@id=\"field-email\"]");
    public static By passInput = By.xpath("//*[@id=\"field-password\"]");
    public static By loginButton = By.id("submit-login");
    public static By IniciarSesion = By.xpath("//*[@id=\"_desktop_user_info\"]/div/a/span");
    public static By CLICKCLOTHESt = By.xpath("//*[@id=\"category-3\"]/a");
    public static By CLICKMEN = By.xpath("//*[@id=\"left-column\"]/div[1]/ul/li[2]/ul/li[1]/a");
    public static By CLICKPRODCUTO = By.xpath("//*[@id=\"js-product-list\"]/div[1]/div/article/div/div[1]/a/picture/img");
    public static By CLICKCANTPRODUCTO = By.xpath("//*[@id=\"add-to-cart-or-refresh\"]/div[2]/div/div[1]/div/span[3]/button[1]");
    public static By BTNAÑADIRCARRITO = By.xpath("//*[@id=\"add-to-cart-or-refresh\"]/div[2]/div/div[2]/button");
    public static By BTNCARRITO = By.xpath("//*[@id=\"blockcart-modal\"]/div/div/div[2]/div/div[2]/div/div/a");


}
