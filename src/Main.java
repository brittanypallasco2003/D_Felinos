import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    //INSTANCIAS
        Gato felino1=new Gato("","",0,"","","","");;
        Tigrillo felino2=new Tigrillo("","",0,"","",0,"");
        Puma felino3=new Puma("","",0,"","",0,"");
        Lince felino4=new Lince("","",0,"","","","");
        Caracal felino5=new Caracal("","",0,"","","",0);;

        //VARIABLES
        String nomComun, nomCientifico, tamanio,subfamilia,dieta, colorPelaje, distSelvaTrop, formaOrejas, descCola, esperanza_vida, colorVientre;
        float peso;
        long tamPoblacion;
        int velocidad_max, longSalto;

        //MENU
        int opc;
        int exist=0;
        Scanner entrada = new Scanner(System.in);
        do{
            System.out.println("-----------------------INFORMACIÓN FELINOS-----------------------");
            System.out.println("1. Gato");
            System.out.println("2. Tigrillo");
            System.out.println("3. Puma");
            System.out.println("4. Lince");
            System.out.println("5. Caracal");
            System.out.println("6. Mostrar todos las especies de felinos del sistema");
            System.out.println("7. Salir");
            System.out.println("Ingrese el genero del felino al cual quiere ingresa informacion:"); opc=entrada.nextInt();
            entrada.nextLine();
            switch (opc){
                case 1:
                    System.out.println("Género seleccionado: Gatos");
                    System.out.println("Ingrese la información que se le pide a continuación: ");
                    System.out.print("Nombre de la especie: "); nomComun=entrada.nextLine();
                    felino1.setNomComun(nomComun);
                    System.out.print("Nombre científico: "); nomCientifico=entrada.nextLine();
                    felino1.setNomCientifico(nomCientifico);
                    System.out.print("Peso (Kg): "); peso=entrada.nextFloat();  entrada.nextLine();
                    felino1.setPeso(peso);
                    System.out.print("Tamaño: "); tamanio=entrada.nextLine();
                    felino1.setTamanio(tamanio);
                    System.out.print("Subfamilia: ");subfamilia=entrada.nextLine();
                    felino1.setSubfamilia(subfamilia);
                    System.out.print("Dieta: ");dieta=entrada.nextLine();
                    felino1.setDieta(dieta);
                    System.out.print("Color de su pelaje: ");colorPelaje=entrada.nextLine();
                    felino1.setColorPelaje(colorPelaje);
                    exist++;
                    break;
                case 2:
                    System.out.println("Género seleccionado: Tigrillo");
                    System.out.println("Ingrese la información que se le pide a continuación: ");
                    System.out.print("Nombre de la especie: "); nomComun=entrada.nextLine();
                    felino2.setNomComun(nomComun);
                    System.out.print("Nombre científico: "); nomCientifico=entrada.nextLine();
                    felino2.setNomCientifico(nomCientifico);
                    System.out.print("Peso (Kg): "); peso=entrada.nextFloat();  entrada.nextLine();
                    felino2.setPeso(peso);
                    System.out.print("Tamaño: "); tamanio=entrada.nextLine();
                    felino2.setTamanio(tamanio);
                    System.out.print("Subfamilia: ");subfamilia=entrada.nextLine();
                    felino2.setSubfamilia(subfamilia);
                    System.out.print("Tamaño de la Población: ");tamPoblacion=entrada.nextLong(); entrada.nextLine();
                    System.out.print("Distribución en selvas subtropicales");distSelvaTrop=entrada.nextLine();
                    exist++;
                    break;
                case 3:
                    System.out.println("Género seleccionado: Puma");
                    System.out.println("Ingrese la información que se le pide a continuación: ");
                    System.out.print("Nombre de la especie: "); nomComun=entrada.nextLine();
                    felino3.setNomComun(nomComun);
                    System.out.print("Nombre científico: "); nomCientifico=entrada.nextLine();
                    felino3.setNomCientifico(nomCientifico);
                    System.out.print("Peso (Kg): "); peso=entrada.nextFloat();  entrada.nextLine();
                    felino3.setPeso(peso);
                    System.out.print("Tamaño: "); tamanio=entrada.nextLine();
                    felino3.setTamanio(tamanio);
                    System.out.print("Subfamilia: ");subfamilia=entrada.nextLine();
                    felino3.setSubfamilia(subfamilia);
                    System.out.print("Velocidad Máxima: ");velocidad_max=entrada.nextInt(); entrada.nextLine();
                    felino3.setVelocidad_max(velocidad_max);
                    System.out.print("Esperanza de vida: ");esperanza_vida=entrada.nextLine();
                    felino3.setEsperanza_vida(esperanza_vida);
                    exist++;
                    break;
                case 4:
                    System.out.println("Género seleccionado: Lince");
                    System.out.println("Ingrese la información que se le pide a continuación: ");
                    System.out.print("Nombre de la especie: "); nomComun=entrada.nextLine();
                    felino4.setNomComun(nomComun);
                    System.out.print("Nombre científico: "); nomCientifico=entrada.nextLine();
                    felino4.setNomCientifico(nomCientifico);
                    System.out.print("Peso (Kg): "); peso=entrada.nextFloat();  entrada.nextLine();
                    felino4.setPeso(peso);
                    System.out.print("Tamaño: "); tamanio=entrada.nextLine();
                    felino4.setTamanio(tamanio);
                    System.out.print("Subfamilia: ");subfamilia=entrada.nextLine();
                    felino4.setSubfamilia(subfamilia);
                    System.out.print("Forma Orejas: ");formaOrejas=entrada.nextLine();
                    felino4.setFormaOrejas(formaOrejas);
                    System.out.print("Descripción de su cola: ");descCola=entrada.nextLine();
                    felino4.setDescCola(descCola);
                    exist++;
                    break;
                case 5:
                    System.out.println("Género seleccionado: Caracal");
                    System.out.println("Ingrese la información que se le pide a continuación: ");
                    System.out.print("Nombre de la especie: "); nomComun=entrada.nextLine();
                    felino5.setNomComun(nomComun);
                    System.out.print("Nombre científico: "); nomCientifico=entrada.nextLine();
                    felino5.setNomCientifico(nomCientifico);
                    System.out.print("Peso (Kg): "); peso=entrada.nextFloat();  entrada.nextLine();
                    felino5.setPeso(peso);
                    System.out.print("Tamaño: "); tamanio=entrada.nextLine();
                    felino5.setTamanio(tamanio);
                    System.out.print("Subfamilia: ");subfamilia=entrada.nextLine();
                    felino5.setSubfamilia(subfamilia);
                    System.out.print("Color del vientre: ");colorVientre=entrada.nextLine();
                    felino5.setColorVientre(colorVientre);
                    System.out.print("Longitud de sus saltos: ");longSalto=entrada.nextInt();
                    felino5.setLongSalto(longSalto);
                    exist++;
                    break;
                case 6:
                    if (exist>0) {
                        System.out.println("FELINOS REGISTRADOS");
                        felino1.imprimirDatos();
                        System.out.println("----------------------------------------------------------");
                        felino2.imprimirDatos();
                        System.out.println("----------------------------------------------------------");
                        felino3.imprimirDatos();
                        System.out.println("----------------------------------------------------------");
                        felino4.imprimirDatos();
                        System.out.println("----------------------------------------------------------");
                        felino5.imprimirDatos();
                    }
                    else {
                        System.out.println("No existen todavía registros");
                    }
                    break;
                case 7:
                    System.out.println("SALIENDO...");
                    break;

                default:
                    System.out.println("Opción Inválida");
            }
        }while (opc!=7);
    }
}