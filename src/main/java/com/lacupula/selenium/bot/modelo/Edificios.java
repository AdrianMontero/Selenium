/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lacupula.selenium.bot.modelo;

/**
 *
 * @author adrii
 */
public class Edificios {
    public String nombre;
    private int nivel;
    private double precioMetal;
    private double precioCristral;

    public Edificios(String nombre, int nivel, double precioMetal, double precioCristral, double precioDeuterio) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.precioMetal = precioMetal;
        this.precioCristral = precioCristral;
        this.precioDeuterio = precioDeuterio;
    }
    private double precioDeuterio;
    
    
}
