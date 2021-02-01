import java.util.Scanner;

public class EjemploArregloInsertarElementoAumentoTamanoOrdenado {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] a = new int[7];

        for(int i = 0; i < a.length; i++){
            System.out.print("Ingrese " + i +" =");
            a[i] = sc.nextInt();
        }

        System.out.println();

        System.out.println("Ingrese el valor");
        int valor = sc.nextInt();
        int posicion = 0;

        //Guardamos la utlima posicion para evitar que se pierda
        int ultimo = a[a.length-1];

        //Mientras -> posicion < 6
        //Valor ingresado sea mayor al valor comparado en cada posicion
        while(posicion < 6 && valor > a[posicion]){
            posicion++;
        }

        //Hacemos el desplazamiento de valores hasta la posicion indicada
        for(int j = a.length-2; j >= posicion; j--){
            a[j+1] = a[j];
        }

        int[] b = new int[a.length+1];
        System.arraycopy(a,0,b,0,a.length);

        /*
            Eviar problemas se hace una condicion
            - Si el valor ingresado es mayor al ultimo numero del arreglo este ocupa ese lugar
            - Si no, solo se asigna el valor a su posicion ya dispuesta
         */
        if(valor > ultimo){
            b[b.length-1] = valor;
        }else{
            b[b.length-1] = ultimo;
            b[posicion] = valor;
        }

        for (int i = 0; i < b.length; i++) {
            System.out.println("Posicion -> " + (i) + " = " + b[i]);
        }

    }
}
