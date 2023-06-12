public  class Empleado {
    private String nombre;
    private String puesto;
    private double salario;
    private String [] trabajadoresBanco = new String[10];
    private int añostrabajados;

    public Empleado(String nombre, String puesto, int añostrabajados) {
        this.nombre = nombre;
        this.puesto = puesto;
        this.añostrabajados = añostrabajados;
    }
    public String mostrarTrabajadoresBanco() {
        String salida = "";
        for (int i = 0; i < trabajadoresBanco.length; i++) {
            salida += trabajadoresBanco[i] + "\n";
        }return salida;
    }
    public int obtenerDiasVacaciones() {
        int diasVacaciones = 5 + (añostrabajados * 2);
        return Math.min(diasVacaciones, 20); // Limitar a un máximo de 20 días de vacaciones
    }

    public String obtenerPuesto(String tipo) {
        return tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String[] getTrabajadoresBanco() {
        return trabajadoresBanco;
    }

    public void setTrabajadoresBanco(String[] trabajadoresBanco) {
        this.trabajadoresBanco = trabajadoresBanco;
    }

    public int getAñostrabajados() {
        return añostrabajados;
    }

    public void setAñostrabajados(int añostrabajados) {
        this.añostrabajados = añostrabajados;
    }
}
