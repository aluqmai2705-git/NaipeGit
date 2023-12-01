/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package daw;

/**
 *
 * @author alejandro
 */
public enum Palo {
    OROS("Oro", 1),
    BASTOS("Basto", 2),
    ESPADAS("Espada", 3),
    COPAS("Copa", 4),;
    
    private String nombre;
    private int numeroPalo;

    private Palo(String nombre, int numeroPalo) {
        this.nombre = nombre;
        this.numeroPalo = numeroPalo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNumeroPalo() {
        return numeroPalo;
    }
    
    
}
