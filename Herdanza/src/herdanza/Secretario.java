package herdanza;
import java.util.GregorianCalendar;
import java.util.Date;

public class Secretario extends Empregado { // Subclase
    private String telefonoMovil;

    public Secretario() {
    }

    public Secretario(String telefonoMovil) {
        super();
        this.telefonoMovil = telefonoMovil;
    }
    
    public Secretario(String telefonoMovil, String nome, String titulacion, GregorianCalendar inicioTraballo, GregorianCalendar dataNacemento) {
        super(nome, titulacion, inicioTraballo, dataNacemento);
        this.telefonoMovil = telefonoMovil;
    }

    public String getTelefonoMovil() {
        return telefonoMovil;
    }
    
    public void setTelefonoMovil(String telefonoMovil) {
        this.telefonoMovil = telefonoMovil;
    }
    
    @Override
    public float calcularSoldo(String aaa){
        return 40f;
    }
    
    public float calsularSoldo(){
        return 70f + super.calcularSoldo("xxx");
    }

    @Override
    public String toString() {
        return "Secretario{" + "telefonoMovil=" + telefonoMovil + '}';
    }
}
