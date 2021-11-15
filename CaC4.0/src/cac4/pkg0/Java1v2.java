/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cac4.pkg0;
import java.util.Scanner;
import cac4.pkg0.Java1ClaseAlumno;


/**
 *
 * @author User
 */
public class Java1v2 {

    /**
     * @param args the command line arguments
     */

    
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        Scanner input = new Scanner(System.in);
                
        System.out.println("Ingrese Nombre: ");
        String nombre = input.next();
        System.out.println("Ingrese Apellido: ");
        String apellido = input.next();
        System.out.println("Ingrese Edad: ");
        int edad = input.nextInt();
        System.out.println("Ingrese Hobbie: ");
        String hobbie = input.next();
        System.out.println("Ingrese Editor de Codigo Preferido: ");
        String prefCodeEditor = input.next();
        System.out.println("Ingrese SO que utiliza: ");
        String SO = input.next();
        
        Java1ClaseAlumno alumno = new Java1ClaseAlumno(nombre, apellido, edad, hobbie, prefCodeEditor, SO);
        alumno.mostrar();
        
        
        
    }
    
}
