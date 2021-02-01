import java.util.Scanner;

public class EjemploDesplazarPosicionAgregandoNumero {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] a = new int[10];

        for(int i = 0; i < a.length -1; i++){
            a[i] = i+1;
        }
        //Imprimir Arreglo para comprobrar
        for (int i = 0; i < a.length; i++) {
            System.out.println("Posicion " +(i) + " = " + a[i]);
        }
        System.out.println();


        //Datos de entrada
        System.out.println("Imprimir de posicion de (0-9)");
        int posicion = sc.nextInt();
        System.out.println("Digite el valor");
        int valor = sc.nextInt();


        //Operacion
        for(int i = a.length -2 ; i >= posicion-1; i--){
           a[i+1] = a[i];
        }
        a[posicion-1] = valor;


        //Imprimir resultado
        for (int i = 0; i < a.length; i++) {
            System.out.println("Posicion " +(i) + " = " + a[i]);
        }

    }

}
