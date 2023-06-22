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
}
