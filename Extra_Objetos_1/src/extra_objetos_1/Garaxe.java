package extra_objetos_1;

public class Garaxe {
    private int numeroCoches;
    private String matricula,marca;
    
    public Garaxe(){
    }
    
    public Garaxe(int numeroCoches,String matricula,String marca){
        this.numeroCoches = numeroCoches;
        this.matricula = matricula;
        this.marca = marca;
    }
    
    public int getNumeroCoches(){
        return numeroCoches;
    }
    
    public String getMatricula(){
        return matricula;
    }
    
    public String getMarca(){
        return marca;
    }
    
    public void setNumeroCoches(int numeroCoches){
        this.numeroCoches = numeroCoches;
    }
    
    public void setMatricula(String matricula){
        this.matricula = matricula;
    }
    
    public void setMarca(String marca){
        this.marca = marca;
    }
    
    public boolean aparcar(){
        if(numeroCoches < 3){
            numeroCoches++;
            return true;
        }else{
            return false;
        }
    }
        
}
