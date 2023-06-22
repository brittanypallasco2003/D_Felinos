public class Tigrillo extends Felino {

    //ATRIBUTOS
     private long tamPoblacion;
     private String distSelvaTrop;

    //CONSTRUCTOR
    public Tigrillo(String nomComun,
                    String nomCientifico,
                    float peso, String tamanio,
                    String subfamilia,
                    long tamPoblacion,
                    String distSelvaTrop) {
        super(nomComun, nomCientifico, peso, tamanio, subfamilia);
        this.tamPoblacion=tamPoblacion;
        this.distSelvaTrop=distSelvaTrop;
    }
    //GETTERS Y SETTERS

    public long getTamPoblacion() {
        return tamPoblacion;
    }

    public void setTamPoblacion(long tamPoblacion) {
        this.tamPoblacion = tamPoblacion;
    }

    public String getDistSelvaTrop() {
        return distSelvaTrop;
    }

    public void setDistSelvaTrop(String distSelvaTrop) {
        this.distSelvaTrop = distSelvaTrop;
    }

    public void imprimirDatos() {
        System.out.println("Info Tigrillo");
        System.out.println("Nombre de la especie: " + getNomComun());
        System.out.println("Nombre científico: " + getNomCientifico());
        System.out.println("Peso (Kg): " + getPeso());
        System.out.println("Tamaño: " + getTamanio());
        System.out.println("Subfamilia: " + getSubfamilia());
        System.out.println("Tamaño de la Población: "+getTamPoblacion());
        System.out.println("Distribución en Selva Subtropical: "+getDistSelvaTrop());
    }
}
