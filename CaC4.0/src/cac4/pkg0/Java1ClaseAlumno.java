/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cac4.pkg0;



/**
 *
 * @author User
 */
public class Java1ClaseAlumno {
    private String nombre;
    private String apellido;
    private int edad;
    private String hobbie;
    private String codeEditor;
    private String OS;
    
    //Colores de fondo y fuente
    public static final String ANSI_RESET = "\u001B[0m";    
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_CYAN_BACKGROUND = "\u001B[46m";
    
    Java1ClaseAlumno(String n, String a, int e,String h, String ce, String os){
        this.nombre = n;
        this.apellido = a;
        this.edad = e;
        this.hobbie = h;
        this.codeEditor = ce;
        this.OS = os;
    }
    
    void mostrar(){
        System.out.println("\tBienvenido al Sistema\n");
        System.out.println(ANSI_CYAN_BACKGROUND+"Los datos ingresados son:\t\n"+ANSI_RESET);
        System.out.println(ANSI_RED+"Nombre: "+nombre+"\n"+ANSI_RESET);
        System.out.println(ANSI_RED+"Apellido: "+apellido+"\n"+ANSI_RESET);
        System.out.println(ANSI_RED+"Edad: "+edad+"\n"+ANSI_RESET);
        System.out.println(ANSI_RED+"Hobbie: "+hobbie+"\n"+ANSI_RESET);
        System.out.println(ANSI_RED+"Editor de Codigo: "+codeEditor+"\n"+ANSI_RESET);
        System.out.println(ANSI_RED+"Sistema Operativo: "+OS+"\n"+ANSI_RESET);
    }
    
}