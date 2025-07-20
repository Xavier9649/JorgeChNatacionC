public class Participante {
    private String nombre;
    private int edad;
    private String genero;
    private boolean buenaSalud;
    private String tipoEntidad;

    //Constructor
    public Participante (String nombre, int edad, String genero, boolean saludBuena, String tipoEntidad) {
        this.nombre=nombre;
        this.edad=edad;
        this.genero=genero;
        this.buenaSalud = saludBuena;
        this.tipoEntidad=tipoEntidad;
    }

    //Métodos principales
    //Verificar si la persona puede o no participar
    public boolean puedeParticipar() {
        return (edad >=18 && edad <=25) && buenaSalud;
    }

    public String getInfo() {
        return "Nombre: " + nombre +
                ", edad: "+ edad +
                ", Género: " + genero +
                ", Salud: " + (buenaSalud ? "Buena" : "No apta") +
                ", Entidad: " + tipoEntidad;
    }

    public boolean isBuenaSalud() {
        return buenaSalud;
    }

    public int getEdad() {
        return edad;
    }
}