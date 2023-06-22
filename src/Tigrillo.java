public class Tigrillo extends Felino {

    //ATRIBUTOS
     private int tamPoblacion;
     private String distSelvaTrop;

    //CONSTRUCTOR
    public Tigrillo(String nomComun,
                    String nomCientifico,
                    float peso, String tamanio,
                    String subfamilia,
                    int tamPoblacion,
                    String distSelvaTrop) {
        super(nomComun, nomCientifico, peso, tamanio, subfamilia);
        this.tamPoblacion=tamPoblacion;
        this.distSelvaTrop=distSelvaTrop;
    }
    //GETTERS Y SETTERS

    public int getTamPoblacion() {
        return tamPoblacion;
    }

    public void setTamPoblacion(int tamPoblacion) {
        this.tamPoblacion = tamPoblacion;
    }

    public String getDistSelvaTrop() {
        return distSelvaTrop;
    }

    public void setDistSelvaTrop(String distSelvaTrop) {
        this.distSelvaTrop = distSelvaTrop;
    }
}
