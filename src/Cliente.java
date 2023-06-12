public class Cliente extends Persona{
    public Cliente(String nombre, String id) {
        super(nombre, id);
    }

    @Override
    public String obtenerPuesto(String tipo) {
        return null;
    }

    @Override
    public Cuenta abrirCuenta(String tipo) {
        return null;
    }
}
