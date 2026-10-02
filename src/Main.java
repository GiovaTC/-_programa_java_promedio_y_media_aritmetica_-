// Programa básico de consola en Java para IntelliJ IDEA que permite
// ingresar una cantidad de números por teclado y calcular su promedio o
// medios aritméticos .


import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        // SOLICITAR LA CANTIDAD DE NUMEROS.
        System.out.print("¿ cuantos numeros desea ingresar? : ");
        int cantidad = teclado.nextInt();

        double suma = 0;

        // ENTRADA DE LOS NUMEROS.
        for (int i = 1; i <= cantidad; i++) {

            System.out.print("Ingrese el numero " + i + ": ");
            double numero = teclado.nextDouble();

            suma = suma + numero;
        }

        // CALCULAR LA MEDIA O PROMEDIO.
        double promedio = suma / cantidad;

        // Mostrar resultados
        System.out.println();
        System.out.println("================================");
        System.out.println("       RESULTADO");
        System.out.println("================================");
        System.out.println("Cantidad de números: " + cantidad);
        System.out.println("Suma: " + suma);
        System.out.println("Promedio: " + promedio);
        System.out.println("Media aritmética: " + promedio);
        System.out.println("================================");

        teclado.close();
    }
}