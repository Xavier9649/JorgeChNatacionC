public class ParticipanteUniversidad extends Participante {
    private String nombreUniversidad;

    //Constructor
    public ParticipanteUniversidad(String nombre, int edad, String genero, boolean buenaSalud, String nombreUniversidad) {
        super (nombre, edad, genero, buenaSalud, "Universidad");
        this.nombreUniversidad=nombreUniversidad;
    }
    //Metodo
    @Override
    public String getInfo() {
        return super.getInfo() + ", Universidad: " + nombreUniversidad;
    }

}
