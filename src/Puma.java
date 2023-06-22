public class Puma extends Felino{
    //ATRIBUTOS
    private int velocidad_max;
    private String esperanza_vida;

    //CONSTRUCTOR
    public Puma(String nomComun,
                String nomCientifico,
                float peso,
                String tamanio,
                String subfamilia,
                int velocidad_max,
                String esperanza_vida) {
        super(nomComun, nomCientifico, peso, tamanio, subfamilia);
        this.velocidad_max=velocidad_max;
        this.esperanza_vida=esperanza_vida;
    }

    //GETTERS Y SETTERS
    public int getVelocidad_max() {
        return velocidad_max;
    }

    public void setVelocidad_max(int velocidad_max) {
        this.velocidad_max = velocidad_max;
    }

    public String getEsperanza_vida() {
        return esperanza_vida;
    }

    public void setEsperanza_vida(String esperanza_vida) {
        this.esperanza_vida = esperanza_vida;
    }
    public void imprimirDatos() {
        System.out.println("Info Puma");
        System.out.println("Nombre de la especie: " + getNomComun());
        System.out.println("Nombre científico: " + getNomCientifico());
        System.out.println("Peso (Kg): " + getPeso());
        System.out.println("Tamaño: " + getTamanio());
        System.out.println("Subfamilia: " + getSubfamilia());
        System.out.println("Velocidad Máxima: "+getVelocidad_max());
        System.out.println("Esperanza de Vida: "+getEsperanza_vida());
    }

}
