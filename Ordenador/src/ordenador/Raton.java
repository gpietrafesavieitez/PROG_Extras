package ordenador;

public class Raton {
    private boolean inalambrico;
    private String modelo;

    public Raton() {
    }

    public Raton(boolean inalambrico, String modelo) {
        this.inalambrico = inalambrico;
        this.modelo = modelo;
    }

    public boolean isInalambrico() {
        return inalambrico;
    }

    public void setInalambrico(boolean inalambrico) {
        this.inalambrico = inalambrico;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "Raton{" + "inalambrico=" + inalambrico + ", modelo=" + modelo + '}';
    }
}
