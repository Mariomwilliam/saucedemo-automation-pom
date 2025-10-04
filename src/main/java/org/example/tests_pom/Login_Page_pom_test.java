package org.example.tests_pom;

import org.example.pages_pom.Login_Page_Pom;
import org.example.pages_pom.Home_page_pom;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_Page_pom_test {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");

        //  1. Login
        Login_Page_Pom login = new Login_Page_Pom(driver);
        login.login_page("standard_user", "secret_sauce");

        Thread.sleep(2000);

        //  2. Add to cart
        Home_page_pom home = new Home_page_pom(driver);
        home.add_to_cart();

        Thread.sleep(1000);

        //  3. Logout
        home.logout();

        Thread.sleep(1000);

        driver.quit();
    }
}