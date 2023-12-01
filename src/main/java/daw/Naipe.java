/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package daw;

import java.util.Random;

/**
 *
 * @author alejandro
 */
public class Naipe {
    Random random = new Random();
   private int numeroCarta;
   private String palo ;
   private String[] arrayPalos = {"Oro","Basto","Espada","Copa"};

    public static void main(String[] args) {
        
        System.out.println(Palo.values());
    }
   
   
    public Naipe() {
        this.numeroCarta = random.nextInt(1, 11);;
        this.palo = arrayPalos[random.nextInt(1, 5)];
        
        }  
        
        
   
   
   
   
}
