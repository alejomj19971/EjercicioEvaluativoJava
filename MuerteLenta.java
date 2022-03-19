package com.company;
import java.sql.SQLOutput;
import java.util.Scanner;

public class  MuerteLenta {
    private int numPersonas, numeroPlato, opcion;
    private double totalCompra,totalneto;


    public void ingreseDatos() {

        Scanner inputData = new Scanner(System.in);
        System.out.println(" Bienvenidos a Restaurante Muerte lenta");
        System.out.println("Ingrese el número de personas : ");
        numPersonas = inputData.nextInt();

    }

    public void tomarPedido() {

        Scanner inputData = new Scanner(System.in);
        totalCompra = 0;

        int propina;
        int deseaContinuar = 1;
        int numerohamburguesa, numperro, numsalchipapa, numchorizos;
        double costohamburguesa, costoperro, costosalchipapa, costochorizo, descuento,descuento2,propina1;
        numchorizos=0;
        numerohamburguesa=0;
        numperro=0;
        numsalchipapa=0;
        costochorizo = 0;
        costohamburguesa = 0;
        costoperro = 0;
        costosalchipapa = 0;

        while (deseaContinuar == 1) {


            System.out.println("    Productos      ");
            System.out.println("  Hamburguesas : 10000");
            System.out.println("  Perros       : 8000");
            System.out.println("  Salchipapas  : 6000");
            System.out.println("  Chorizos     : 7000");



                    System.out.println("Ingrese el número de Hamburguesas : ");
                    numerohamburguesa = inputData.nextInt();
                    costohamburguesa = numerohamburguesa * 10000;

                    System.out.println("Ingrese el número de Perros : ");
                    numperro = inputData.nextInt();
                    costoperro = numperro * 6000;


                    System.out.println("Ingrese el número de Salchipapas : ");
                    numsalchipapa = inputData.nextInt();
                    costosalchipapa = numsalchipapa * 6000;


                    System.out.println("Ingrese el número de Chorizos : ");
                    numchorizos = inputData.nextInt();
                    costochorizo = numchorizos * 7000;



            System.out.println("Para ingresar otra orden oprima 1 de lo contrario 2");
            deseaContinuar = inputData.nextInt();
        }

        totalCompra = costochorizo + costohamburguesa + costoperro + costosalchipapa;


        if (totalCompra > 20000) {
            descuento = totalCompra * 0.1;
            System.out.println("Se le aplico un descuento por compras superiores a 200000 y es de " + descuento);

        } else {
            descuento=0;

        }


        if (numchorizos > 1 || numerohamburguesa > 1 || numperro > 1 || numsalchipapa > 1) {
            descuento2 = totalCompra  * 0.5;
            System.out.println("Se le aplico un descuento por comprar dos productos iguales y es de "+descuento2);
        }
        else {
            descuento2=0;
        }


        System.out.println(" Si Desea incluir la propina oprima 1 de lo contrario 2 :");
        propina = inputData.nextInt();

        if (propina == 1) {

            propina1 =  totalCompra * 0.10;

        } else {
            propina1=0;
        }


        totalneto=totalCompra-descuento-descuento2+propina1;

        System.out.println(" Gracias por elegirnos ");
        System.out.println(" El valor total de su cuenta es ");
        System.out.println(" Costo de los productos                   : "+totalCompra);
        System.out.println(" Descuento por compras superiores a 20000 :-"+descuento);
        System.out.println(" Descuento por comprar productos iguales  :-"+descuento2);
        System.out.println(" Propina                                  :  "+propina1);
        System.out.println("Total neto de la compra                   :  "+totalneto);

    }


    public static void main(String[] args){
        MuerteLenta muerteLenta;
        muerteLenta=new MuerteLenta();
        muerteLenta.ingreseDatos();
        muerteLenta.tomarPedido();

    }






}


