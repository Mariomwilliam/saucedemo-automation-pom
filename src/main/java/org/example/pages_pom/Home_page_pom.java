package org.example.pages_pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Home_page_pom {

    WebDriver driver;

    // Locators
    By add_cart = By.id("add-to-cart-sauce-labs-backpack");
    By menu = By.id("react-burger-menu-btn");
    By logout = By.id("logout_sidebar_link");

    public Home_page_pom(WebDriver driver) {
        this.driver = driver;
    }

    // Actions
    public void add_to_cart() {
        driver.findElement(add_cart).click();
    }

    public void open_menu() {
        driver.findElement(menu).click();
    }

    public void logout() {
        open_menu();
        driver.findElement(logout).click();
    }
    public boolean isOnHomePage() {
        return driver.getPageSource().contains("Products");
    }

}
