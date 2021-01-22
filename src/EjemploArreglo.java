import java.util.Arrays;

public class EjemploArreglo {
    public static void main(String[] args) {

        // Declaracion   |    Inicializacion
           int[] numeros   =  new int[4];

        numeros[0] = 23;
        numeros[1] = 13;
        numeros[2] = 11;
        numeros[3] = 12;

        int i = numeros[0];
        int j = numeros[1];
        int k = numeros[2];
        int l = numeros[3];

        // NO ORDENADO
        System.out.println("NO ORDENADO\ni = " + numeros[0]);
        System.out.println("j = " + numeros[1]);
        System.out.println("k = " + numeros[2]);
        System.out.println("l = " + numeros[3]);

        // Arrays.sort() -> ordenado un array sin importar el tipo de datos
        Arrays.sort(numeros);

        // SI ORDENADO
        System.out.println("SI ORDENADO\ni = " + numeros[0]);
        System.out.println("j = " + numeros[1]);
        System.out.println("k = " + numeros[2]);
        System.out.println("l = " + numeros[3] + "\n");


        // ----------------------------------------------------------------------------------



        // Arreglo de String y ordenados
        String[] product = new String[4];

        // Si no se asigna valor -> queda null
        product[0] = "Pc gamer Auros";
        product[1] = "Bicliceta todo terreno";
        product[2] = "Teclado de Apple";
        product[3] = "Silla gamer";

        // Listado NO ordenado
        System.out.println("NO ORDENADO\nproducto[0] " + product[0]);
        System.out.println("producto[1] " + product[1]);
        System.out.println("producto[2] " + product[2]);
        System.out.println("producto[3] " + product[3]);


        // Ordenado Alfabeticamente -> Arrays.sort -> java.util
        Arrays.sort(product);

        // Listado SI ordenado
        System.out.println("\nSI ORDENADO\nproducto[0] " + product[0]);
        System.out.println("producto[1] " + product[1]);
        System.out.println("producto[2] " + product[2]);
        System.out.println("producto[3] " + product[3]);




    }
}
