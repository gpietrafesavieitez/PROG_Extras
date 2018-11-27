package herdanza;
import java.util.GregorianCalendar;
import java.util.Date;

public class Herdanza {

    public static void main(String[] args) {
        GregorianCalendar dI = new GregorianCalendar(2018,3,15);
        GregorianCalendar dN = new GregorianCalendar(2005,3,3);
        Empregado em = new Empregado("Maria","profesora",dI,dN);
        System.out.println("empregado:" + em.toString());
        Secretario se = new Secretario("+34002113826","Anton","administrativo",dI,dN);
        System.out.println("empregado:" + em.calcularSoldo("aa"));
        System.out.println("secretario:" + se.calsularSoldo());
    }
}
