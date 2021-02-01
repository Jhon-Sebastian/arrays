import java.util.Scanner;

public class EjemploArreglosInsertarElementoAumentoTamano {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] a = new int[10];
        //Llenamos el arreglo
        for (int i = 0; i < a.length; i++) {
            a[i] = i+1;
        }

        //Show the array
        System.out.println();
        for (int i = 0; i < a.length; i++) {
            System.out.println("Position " + (i) + " = "+ a[i]);
        }

        //Input the value
        System.out.println("\nIngresar el valor: \n");
        int value = sc.nextInt();

        //Input de position
        System.out.println("Posicion de (0-9): \n");
        int position = sc.nextInt();

        //Guardamos la ultima posicion para luego usarla, si no se perdera
        int ultimo = a[a.length-1];
        //Iniciamos desde la posicion 8 para que este vaya teniendo el valor de su penultima posicion con respecto a la actual
        for(int i = a.length -2 ; i >= position; i--){
            a[i+1] = a[i];
        }
        //
        int[] b = new int[a.length+1];

        //Copiamos el arreglo actual y lo pasamos al nuevo que tiene una posicion mas para guardar el valor que se esta
        // perdiendo
        System.arraycopy(a,0,b,0,a.length);

        //Pasamos el valor y la posicion indica al nuevo arreglo con
        b[position] = value;
        //Asiganmos el valor a la ultima posicion del nuevo arreglo -> b.length = 11
        b[b.length-1] = ultimo;

        for (int i = 0; i < b.length; i++) {
            System.out.println("Position " + (i) + ", " + b[i]);
        }


    }
}
