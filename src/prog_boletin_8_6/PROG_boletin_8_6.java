package prog_boletin_8_6;

import java.util.Scanner;

public class PROG_boletin_8_6 {

    public static void main(String[] args) {
        Scanner scaner1 = new Scanner(System.in);
        System.out.println("Introduce nombre del artículo:");
        String nomArt = scaner1.next();
        System.out.println("Introduce las ventas anuales del artículo:");
        float vtaAnual = scaner1.nextFloat();

        Articulo art1 = new Articulo();
        art1.setNombreArticulo(nomArt);
        art1.setVentasAnuales(vtaAnual);
        System.out.println("El tipo es: " + art1.tipoArticulo());

    }

}
