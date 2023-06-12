public class Main {
    public static void main(String[] args) {

    Empleado empleado1 = new Empleado("pedro", "supervisor",3);
    empleado1.setSalario(2000.0);
    empleado1.setPuesto("contador");
    Cliente cliente1 = new Cliente("carlos", "45534");
    Cuenta cuentaSena = new CuentaInversion(cliente1, "001");
    Cuenta cuentaSena2 = new CuentaAhorro(cliente1, "001");

    cuentaSena.depositar(30000.0, "001");
    cuentaSena.retirar(25000.0, "001", "45534");

    cuentaSena2.depositar(3000.0, "001");
    cuentaSena2.retirar(1000.0, "001", "45534");




    }
}
