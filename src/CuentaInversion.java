public class CuentaInversion extends Cuenta{
    private static final double DEPOSITO_INICIAL_INVERSION = 25000.0;
    private static final double SALDO_MINIMO_INVERSION = 10000.0;
    public CuentaInversion(Persona titular, String numeroUsuario) {
        super(titular, numeroUsuario);
    }

    @Override
    public void depositar(double cantidad, String numeroUsuario) {
        if (numeroUsuario.equals(getNumeroUsuario())){
            if (getSaldo() == 0.0 && cantidad >= DEPOSITO_INICIAL_INVERSION){
                setSaldo(getSaldo() + cantidad);
                System.out.println("Deposito exitoso.\nSu nuevo saldo es: " + getSaldo()+ " pesos");
            }else {
                System.out.println("el primer deposito debe ser de $25.000 como minimo");

            }
        }else {
            System.out.println("El numero de usuario no es correcto");
        }

    }

    @Override
    public void retirar(double cantidad, String numeroUsuario, String id) {
        if (numeroUsuario.equals(getNumeroUsuario())){
            if (id.equals(getTitular().getId())){
                if (getSaldo() >= cantidad && cantidad <= getSaldo() - SALDO_MINIMO_INVERSION){
                    setSaldo(getSaldo() - cantidad);
                    System.out.println("Retiro exitoso.\nSu nuevo saldo es: " + getSaldo()+ " pesos");
                }else {
                    System.out.println("la cuenta debe tener un saldo minimo de $10.000 " + "Solo puede retirar "+ (getSaldo() - SALDO_MINIMO_INVERSION) + " pesos");
                }
            }else {
                System.out.println("El id no es correcto");
            }
        }else {
            System.out.println("El numero de usuario no es correcto");
        }

    }
}
