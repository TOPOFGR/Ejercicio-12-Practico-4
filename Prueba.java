/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practico.pkg4;

/**
 *
 * @author TOPOF
 */
public class Prueba {
    public static void main(String[] args) {
         Libro libro1 = new Libro();
         Libro libro2 = new Libro();
         
         libro1.setTitulo("Las mil y una Noches");
         libro1.setOriginal(true);
         libro1.setPrestable(false);
         
         libro2.setTitulo("El Hobbit");
         libro2.setOriginal(false);
         libro2.setPrestable(true);
         
         System.out.println("Primer libro "+ libro1 + "\n"+ "Segundo libro "+ libro2);
    }
}
