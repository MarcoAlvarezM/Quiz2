/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package quiz2;

import javax.swing.JOptionPane;

/**
 *
 * @author Marco
 */
public class Quiz2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Importe de cancion
        
        Cancion cancion = new Cancion("1234567", "A Little Messed Up", "June", "2:51", 2019);

        // Mostrar datos usando getters
        System.out.println("El ID de la cancion es: " + cancion.getId());
        System.out.println("El nombre de la cancion es: " + cancion.getTitulo());
        System.out.println("El autor de la cancion es: " + cancion.getAutor());
        System.out.println("La duracion de la cancion es: " + cancion.getDuracion());
        System.out.println("El anio de creacion es: " + cancion.getAnio());
    }
}

