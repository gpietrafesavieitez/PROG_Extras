package ordenador;
import javax.swing.JOptionPane;

public class Aplicacion {

    public static void main(String[] args) {
        try{
            int nucleos = Integer.parseInt(JOptionPane.showInputDialog(null,"Nucleos do procesador:","Ordenador",3));
            int ram = Integer.parseInt(JOptionPane.showInputDialog(null,"Memoria ram:","Ordenador",3));
            boolean inalambrico = JOptionPane.showConfirmDialog(null,"E o rato inalambrico?","Ordenador",JOptionPane.YES_NO_OPTION) == 0;
            String modelo = JOptionPane.showInputDialog(null,"Modelo do rato:","Ordenador",3);
            int numTeclas = Integer.parseInt(JOptionPane.showInputDialog(null,"Numero teclas do teclado:","Ordenador",3));
            String marca = JOptionPane.showInputDialog(null,"Marca do monitor:","Ordenador",3);
            float pulgadas = Float.parseFloat(JOptionPane.showInputDialog(null,"Pulgadas do monitor:","Ordenador",3));
            Ordenador pc = new Ordenador(nucleos, ram, inalambrico, modelo, numTeclas, marca, pulgadas);
            System.out.println(pc.visualizarAtributos());
            System.out.println(pc.calcularPrezo() + "€");
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null,"Formato incorrecto!","Ordenador",0);
        }
    }
}
