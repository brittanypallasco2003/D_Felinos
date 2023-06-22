public class Lince extends Felino{
    //ATRIBUTOS
     private String formaOrejas;
    private String descCola;

    //CONSTRUCTOR
    public Lince(String nomComun,
                 String nomCientifico,
                 float peso,
                 String tamanio,
                 String subfamilia,
                 String formaOrejas,
                 String descCola) {
        super(nomComun, nomCientifico, peso, tamanio, subfamilia);
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
    public void imprimirDatos() {
        System.out.println("Info Lince");
        System.out.println("Nombre de la especie: " + getNomComun());
        System.out.println("Nombre científico: " + getNomCientifico());
        System.out.println("Peso (Kg): " + getPeso());
        System.out.println("Tamaño: " + getTamanio());
        System.out.println("Subfamilia: " + getSubfamilia());
        System.out.println("Forma de las Orejas: "+getFormaOrejas());
        System.out.println("Descripción de su cola: "+getDescCola());
    }
}
