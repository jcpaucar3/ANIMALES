package com.mycomany.pryanimales;

import java.util.Scanner;

public class PryAnimales {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Mamifero");
        System.out.print("Ingrese el nombre del mamifero: ");
        String nombreMamifero = scanner.nextLine();
        System.out.print("Ingrese la edad del mamifero: ");
        int edadMamifero = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Ingrese el tipo de pelaje: ");
        String tipoPelaje = scanner.nextLine();

        Mamifero mamifero = new Mamifero(tipoPelaje, nombreMamifero, edadMamifero);

        System.out.println("Ave");
        System.out.print("Ingrese el nombre del ave: ");
        String nombreAve = scanner.nextLine();
        System.out.print("Ingrese la edad del ave: ");
        int edadAve = scanner.nextInt();
        System.out.print("Ingrese la envergadura de las alas: ");
        double envergaduraAlas = scanner.nextDouble();

        Ave ave = new Ave(envergaduraAlas, nombreAve, edadAve);

        System.out.println("Reptil");
        scanner.nextLine();
        System.out.print("Ingrese el nombre del reptil: ");
        String nombreReptil = scanner.nextLine();
        System.out.print("Ingrese la edad del reptil: ");
        int edadReptil = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Ingrese el tipo de escamas: ");
        String tipoEscamas = scanner.nextLine();

        Reptil reptil = new Reptil(tipoEscamas, nombreReptil, edadReptil);

        boolean continuar = true;
        while (continuar) {
            System.out.println("Menu de Opciones");
            System.out.println("1. Alimentar Mamifero");
            System.out.println("2. Amamantar crías (Mamifero)");
            System.out.println("3. Alimentar Ave");
            System.out.println("4. Hacer volar Ave");
            System.out.println("5. Alimentar Reptil");
            System.out.println("6. Hacer arrastrar Reptil");
            System.out.println("7. Salir");
            System.out.print("Seleccione una opcion: ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    mamifero.Comer();
                    break;
                case 2:
                    mamifero.amamantarCrias();
                    break;
                case 3:
                    ave.Comer();
                    break;
                case 4:
                    ave.Volar();
                    break;
                case 5:
                    reptil.Comer();
                    break;
                case 6:
                    reptil.Arrastrarse();
                    break;
                case 7:
                    continuar = false;
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no valida. Intente nuevamente.");
            }
        }

        scanner.close();
    }
}
