import java.util.Scanner;

public class EjemploArreglosDesplazarPosicionOrdenando {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] a = new int[7];

        for(int i = 0; i < a.length-1; i++){
            System.out.print("Ingrese " + i +" =");
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

        System.out.println();

        System.out.println("Ingrese el valor");
        int valor = sc.nextInt();
        int posicion = 0;

        int i = 0;
        for (; i < a.length-1; i++) {
            if(valor < a[i]){
                posicion = i;
                break;
            }
        }

        for(int j = a.length-2; j >= i; j--){
            a[j+1] = a[j];
        }
        a[posicion] = valor;

        for (int j = 0; j < a.length; j++) {
            System.out.println("Posicion "+ (j) +" = "+a[j]);
        }

        /*
            Otra forma de buscar la posicion
            posicion = 0;
            while(posicion  < 6  && posicion > a[posicion){
                posicion++;
            }
         */

    }
}
