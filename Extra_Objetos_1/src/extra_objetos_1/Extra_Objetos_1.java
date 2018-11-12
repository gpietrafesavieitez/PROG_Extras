package extra_objetos_1;
import javax.swing.JOptionPane;

public class Extra_Objetos_1{
    private static Garaxe garaxe = new Garaxe(1,null,null);
    private static String teclado;

    public static void main(String[] args){
        
        do{
            teclado = JOptionPane.showInputDialog(null,"¿Aparcar coche? (s/n)");
            if(teclado.equals("s")){
                
                JOptionPane.showInputDialog(null,"Introduce a marca:");
                JOptionPane.showInputDialog(null,"Introduce a matrícula:");
                if(garaxe.aparcar()){
                    System.out.println("PLAZAS DISPONIBLES");
                }else{
                    System.out.println("COMPLETO");
                }
                
            }
                
            
        }while(!"n".equals(teclado));
        
        
        
        
    }
    
}
