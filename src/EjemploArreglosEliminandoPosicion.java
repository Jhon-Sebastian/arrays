import java.util.Scanner;

public class EjemploArreglosEliminandoPosicion {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] a = new int[10];
        int[] newArray = new int[9];

        //Llenamos el arreglo
        for (int i = 0; i < a.length; i++) {
            a[i] = i+1;
        }

        //Lo mostramos
        for (int i = 0; i < a.length; i++) {
            System.out.println("Posicion " + (i) + " = " + a[i]);
        }

        //Se pide la posicion en el que vamos a eliminar el dato
        System.out.println("\nIngrese una posicion a eliminar (0-9): \n");
        int deletePosicion = scanner.nextInt();

        //Se inicia desde la posicion a eliminar hasta el penultimo elementos para evitar un error ya que se usa i+1
        //El valor de la posicion siguiente se lo pasamos al actual
        for(int i = deletePosicion; i < a.length -1; i++){
            a[i] = a[i+1];
        }

        //Copiamos el arreglo actual en uno nuevo para mostrarlo sin el ultimo elemento
        //for(int i = 0; i < a.length -1; i++){
        //    newArray[i] = a[i];
        //}

        //Tambien se puede usar la clase System para copiar el arreglo
        // => Arreglo a copiar , Posicion en que inicia el arreglo actual, ARREGLO NUEVO, Posicion inicia el arreglo nuevo, cantidad de elementos a copiar
        System.arraycopy(a,0,newArray,0,newArray.length);

        System.out.println("\nArreglo con la posicion eliminada");
        for(int i = 0; i < newArray.length; i++){
            System.out.println("Posicion " + (i) + " = " + newArray[i]);
        }


    }
}
