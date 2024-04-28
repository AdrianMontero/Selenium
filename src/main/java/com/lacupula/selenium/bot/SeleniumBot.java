/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.lacupula.selenium.bot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
        
/**
 *
 * @author adrii
 */
public class SeleniumBot {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Hello World!");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.selenium.dev/selenium/web/web-form.html");
        Thread.sleep(4000);
    }
}
