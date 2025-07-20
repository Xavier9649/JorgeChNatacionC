public class ParticipanteEmpresa extends Participante {
    private String tipoEmpresa; // "Pública" o "Privada"

    //Constructor
    public ParticipanteEmpresa(String nombre, int edad, String genero, boolean buenaSalud, String tipoEmpresa) {
        super (nombre, edad, genero, buenaSalud, "Empresa");
        this.tipoEmpresa = tipoEmpresa;
    }
    //Metodo
    @Override
    public String getInfo() {
        return super.getInfo() + ", Tipo Empresa: " + tipoEmpresa;
    }

}
