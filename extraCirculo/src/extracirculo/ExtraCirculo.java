package extracirculo;
import java.util.Scanner;
import java.lang.Math; //Utilizo libreria Math para PI y potencias

public class ExtraCirculo {
    //public final static float PI = 3.14159265359f;
    public static Scanner leer = new Scanner(System.in);
    
    //Codifica un programa que calcule la longitud, area y volumen de un círculo
    public static void main(String[] args) {
        float r; //Declaro el radio primero porque lo necesita el while a continuacion
        
        do{
            System.out.print("Introduce el radio del círculo: "); r = leer.nextFloat();
            
        }while(r < 0); //No puede ser negativo
        
        System.out.println("\n- El área del círculo es de " + (Math.PI * Math.pow(r,2))+ " unidades.\n- El volumen del círculo es de " + (4/3 * Math.PI * Math.pow(r,3))  + " unidades.\n- La longitud del círculo es de " + (2 * Math.PI * r) + " unidades.");
    } 
}
//Esto es una prueba
