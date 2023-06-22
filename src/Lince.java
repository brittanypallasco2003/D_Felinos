public class Lince extends Felino{
    //ATRIBUTOS
     private String formaOrejas;
    private String descCola;

    //CONSTRUCTOR
    public Lince(String nomComun,
                 String nomCientifico,
                 float peso,
                 String tamani,
                 String subfamilia,
                 String formaOrejas,
                 String descCola) {
        super(nomComun, nomCientifico, peso, tamani, subfamilia);
        this.formaOrejas=formaOrejas;
        this.descCola=descCola;
    }

    //GETTERS Y SETTERS

    public String getFormaOrejas() {
        return formaOrejas;
    }

    public void setFormaOrejas(String formaOrejas) {
        this.formaOrejas = formaOrejas;
    }

    public String getDescCola() {
        return descCola;
    }

    public void setDescCola(String descCola) {
        this.descCola = descCola;
    }
}
