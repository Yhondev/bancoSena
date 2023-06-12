import java.util.List;

public abstract class Cuenta {
    Persona titular;
    private String id;
    private String numeroUsuario;
    private double saldo;
    private double [] ultimasOperaciones;


    public Cuenta(Persona titular, String numeroUsuario) {
        this.titular = titular;
        this.saldo = 0.0;
        this.numeroUsuario = numeroUsuario;
        this.id = "";
        this.ultimasOperaciones = new double[100];
    }
    public abstract void depositar(double cantidad, String numeroUsuario);

    public abstract void retirar(double cantidad, String numeroUsuario, String id);

    public Persona getTitular() {
        return titular;
    }



    public double getSaldo() {

        return saldo;

    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getId() {
        return id;
    }


    public String getNumeroUsuario() {
        return numeroUsuario;
    }



    public double[] getTransacciones() {
        return ultimasOperaciones;
    }

}
