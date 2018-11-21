package ordenador;

public class Ordenador {
    private Cpu procesador;
    private Raton raton;
    private Teclado teclado;
    private Monitor pantalla;
    
    public Ordenador(){
        procesador = new Cpu();
        raton = new Raton();
        teclado = new Teclado();
        pantalla = new Monitor();
    }
    
    public Ordenador(int nucleos, int ram, boolean inalambrico, String modelo, int numTeclas, String marca, float pulgadas){
        procesador = new Cpu(nucleos, ram);
        raton = new Raton(inalambrico, modelo);
        teclado = new Teclado(numTeclas);
        pantalla = new Monitor(marca, pulgadas);
    }
    
    public float calcularPrezo(){
        float prezoRaton;
        if(raton.isInalambrico()){
            prezoRaton = 1.5f;
        }else{
            prezoRaton = 1;
        }
        return prezoRaton + procesador.getRam() * 5 + teclado.getNumTeclas() * 0.7f + pantalla.getPulgadas() * 12;
    }
    
    public String visualizarAtributos(){
        return procesador.toString() + "\n" + raton.toString() + "\n" + teclado.toString() + "\n" + pantalla.toString();
    }
}
