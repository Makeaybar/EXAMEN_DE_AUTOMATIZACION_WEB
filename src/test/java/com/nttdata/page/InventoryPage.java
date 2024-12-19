package com.nttdata.page;

import org.openqa.selenium.By;

public class InventoryPage {

    public static By productsTitle = By.cssSelector("span.title");
    public static By itemsCards = By.cssSelector("div.inventory_item");
    public static By carritoTitle = By.xpath("//*[@id=\"myModalLabel\"]");
    public static By TXTCARRITO = By.xpath("//*[@id=\"main\"]/div/div[1]/div/div[1]/h1");
    public static By TXTPRECIO = By.xpath("//*[@id=\"main\"]/div/div[1]/div/div[2]/ul/li/div/div[3]/div/div[2]/div/div[2]/span/strong");

}
