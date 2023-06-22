public class Gato extends Felino {

    //ATRIBUTOS
    private String dieta;
    private String colorPelaje;

    //CONSTRUCTOR
    public Gato(String nomComun,
                String nomCientifico,
                float peso,
                String tamanio,
                String subfamilia,
                String dieta,
                String colorPelaje) {
        super(nomComun, nomCientifico, peso, tamanio, subfamilia);
        this.dieta=dieta;
        this.colorPelaje=colorPelaje;
    }

    //GETTERS Y SETTERS
    public String getDieta() {
        return dieta;
    }

    public void setDieta(String dieta) {
        this.dieta = dieta;
    }

    public String getColorPelaje() {
        return colorPelaje;
    }

    public void setColorPelaje(String colorPelaje) {
        this.colorPelaje = colorPelaje;
    }


}
