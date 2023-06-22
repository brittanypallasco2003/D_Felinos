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

    public void imprimirDatos(){
        System.out.println("Info Gato");
        System.out.println("Nombre de la especie: "+getNomComun());
        System.out.println("Nombre científico: "+getNomCientifico());
        System.out.println("Peso (Kg): "+getPeso());
        System.out.println("Tamaño: "+getTamanio());
        System.out.println("Subfamilia: "+getSubfamilia());
        System.out.println("Dieta: "+getDieta());
        System.out.println("Color de su pelaje: "+getColorPelaje());
    }
}
