package com.generation;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa un numero de la semana y te dire que dia es:" +
                "\n1) Lunes" +
                "\n2) Martes" +
                "\n3) Miercoles" +
                "\n4) Jueves" +
                "\n5) Viernes" +
                "\n6) Sabado" +
                "\n7) Domingo");
        int opcion = sc.nextInt();
        sc.nextLine();

        String dia = "invalido";
        switch (opcion) {
            case 1:
                dia = "Lunes";
                break;
            case 2:
                dia = "Martes";
                break;
            case 3:
                dia = "Miercoles";
                break;
            case 4:
                dia = "Jueves";
                break;
            case 5:
                dia = "Viernes";
                break;
            case 6:
                dia = "Sabado";
                break;
            case 7:
                dia = "Domingo";
                break;
            default:
                System.out.println("La opcion que seleccionaste es invalida");
                break;
        }
        System.out.println("El dia que seleccionaste es: "+dia);
    }
}