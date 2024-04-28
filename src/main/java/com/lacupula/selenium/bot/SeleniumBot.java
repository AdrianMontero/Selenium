/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.lacupula.selenium.bot;

import com.lacupula.selenium.bot.vista.Login;
import java.sql.*;
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
        Login vLogin = new Login();
        vLogin.setVisible(true);
        System.out.println("Hello World!");
        
        //Conexion BBDD
        Connection c = null;
        try {
           Class.forName("org.sqlite.JDBC");
           c = DriverManager.getConnection("jdbc:sqlite:ogame.db");
        } catch ( Exception e ) {
           System.err.println( e.getClass().getName() + ": " + e.getMessage() );
           System.exit(0);
        }
        System.out.println("Opened database successfully");

      
        WebDriver driver = new ChromeDriver();
        driver.get("https://lobby.ogame.gameforge.com/es_ES/");
        Thread.sleep(4000);
    }
}
