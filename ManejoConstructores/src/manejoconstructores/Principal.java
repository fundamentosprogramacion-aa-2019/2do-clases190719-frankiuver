/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejoconstructores;

/**
 *
 * @author JOSE
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Entrenador entrenador1 = new Entrenador("RENE",34,"FUT");
        Entrenador entrenador2 = new Entrenador();
        System.out.printf("%s\n", entrenador1);
        System.out.printf("%s\n", entrenador2);       
        
        System.out.printf("Nombre %s - Edad %d\n", 
                entrenador1.getNombre(), entrenador1.getEdad());
        
        System.out.printf("Nombre %s - Edad %d\n", 
                entrenador2.getNombre(), entrenador2.getEdad());
        
        // proceso de cambio de valores
        
        entrenador1.setNombre("Rolando");
        System.out.printf("Nombre %s - Edad %d\n", 
                entrenador1.getNombre(), entrenador1.getEdad());
        
    }
    
}
