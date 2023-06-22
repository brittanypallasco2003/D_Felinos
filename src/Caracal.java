public class Caracal extends Felino{
    //ATRIBUTOS
    private String colorVientre;
    private int longSalto;

    //CONSTRUCTOR
    public Caracal(String nomComun,
                   String nomCientifico,
                   float peso,
                   String tamani,
                   String subfamilia,
                   String colorVientre,
                   int longSalto) {
        super(nomComun, nomCientifico, peso, tamani, subfamilia);
        this.colorVientre=colorVientre;
        this.longSalto=longSalto;
    }

    //GETTERS Y SETTERS


    public String getColorVientre() {
        return colorVientre;
    }

    public void setColorVientre(String colorVientre) {
        this.colorVientre = colorVientre;
    }

    public int getLongSalto() {
        return longSalto;
    }

    public void setLongSalto(int longSalto) {
        this.longSalto = longSalto;
    }

    public void imprimirDatos() {
        System.out.println("Info Caracal");
        System.out.println("Nombre de la especie: " + getNomComun());
        System.out.println("Nombre científico: " + getNomCientifico());
        System.out.println("Peso (Kg): " + getPeso());
        System.out.println("Tamaño: " + getTamanio());
        System.out.println("Subfamilia: " + getSubfamilia());
        System.out.println("Tamaño de la Población: "+getColorVientre());
        System.out.println("Distribución en Selva Subtropical: "+getLongSalto());
    }
}
