package herdanza;
import java.util.GregorianCalendar;
import java.util.Date;

public class Empregado { // Superclase
    private String nome,titulacion;
    private GregorianCalendar inicioTraballo,dataNacemento;

    public Empregado() {
    }

    public Empregado(String nome, String titulacion, GregorianCalendar inicioTraballo, GregorianCalendar dataNacemento) {
        this.nome = nome;
        this.titulacion = titulacion;
        this.inicioTraballo = inicioTraballo;
        this.dataNacemento = dataNacemento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTitulacion() {
        return titulacion;
    }

    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }

    public GregorianCalendar getInicioTraballo() {
        return inicioTraballo;
    }

    public void setInicioTraballo(GregorianCalendar inicioTraballo) {
        this.inicioTraballo = inicioTraballo;
    }

    public GregorianCalendar getDataNacemento() {
        return dataNacemento;
    }

    public void setDataNacemento(GregorianCalendar dataNacemento) {
        this.dataNacemento = dataNacemento;
    }
    
    public float calcularSoldo(String bbb){
        return 20f;
    }

    @Override
    public String toString() {
        return "Empregado{" + "nome=" + nome + ", titulacion=" + titulacion + ", inicioTraballo=" + inicioTraballo + ", dataNacemento=" + dataNacemento + '}';
    }
}
