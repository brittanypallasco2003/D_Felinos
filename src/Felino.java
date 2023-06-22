public class Felino {

    //ATRIBUTOS
    private String nomComun;
    private String nomCientifico;
    private float peso;
    private String tamanio;
    private String subfamilia;

    //CONSTRUCTOR
    public Felino(String nomComun, String nomCientifico, float peso, String tamani, String subfamilia) {
        this.nomComun = nomComun;
        this.nomCientifico = nomCientifico;
        this.peso = peso;
        this.tamanio = tamanio;
        this.subfamilia = subfamilia;
    }

    //GETTERS Y SETTERS
    public String getNomComun() {
        return nomComun;
    }

    public void setNomComun(String nomComun) {
        this.nomComun = nomComun;
    }

    public String getNomCientifico() {
        return nomCientifico;
    }

    public void setNomCientifico(String nomCientifico) {
        this.nomCientifico = nomCientifico;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public String getTamanio() {
        return tamanio;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }

    public String getSubfamilia() {
        return subfamilia;
    }

    public void setSubfamilia(String subfamilia) {
        this.subfamilia = subfamilia;
    }

    public String cazar(){
        return "Atrapan a sus presas mediante el acecho, o bien, persiguiéndolas";
    }
}
