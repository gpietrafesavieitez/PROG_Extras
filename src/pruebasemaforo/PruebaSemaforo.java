package pruebasemaforo;
import java.util.Scanner;

public class PruebaSemaforo {
    
    private static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        Semaforo objSemaforo = new Semaforo();
        int opcion;
        
        do{
            System.out.println("El color actual del semáforo es: " + objSemaforo.getColor());
            System.out.println("[0] Rojo\n[1] Ámbar\n[2] Verde\n[9] Salir");
            
            switch(opcion = leer.nextInt()){
                case 0: objSemaforo.setColor("ROJO"); break;
                case 1: objSemaforo.setColor("ÁMBAR"); break;
                case 2: objSemaforo.setColor("VERDE"); break;
                case 9: System.out.println("Chao!"); break;
                default: System.out.println("Valor incorrecto"); break;
            }
            
        }while(opcion != 9);
    }
}
