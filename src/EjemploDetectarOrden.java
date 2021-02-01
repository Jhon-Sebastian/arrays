import java.util.Scanner;

public class EjemploDetectarOrden {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] x = new int[7];

        System.out.println("Ingrese 7 numeros");
        for (int i = 0; i < x.length; i++) {
            x[i] = sc.nextInt();
        }

        detectarOrden(x);

    }

    private static void detectarOrden(int[] x){
        boolean ascendente = false;
        boolean descendente = false;

        for(int i = 0; i < x.length -1; i++){
            if(x[i] > x[i+1]){
                descendente = true;
            }
            if(x[i] < x[i+1]){
                ascendente = true;
            }
        }
        if(ascendente == true && descendente == true){
            System.out.println("Arreglo Desordenando " );
        }
        if(ascendente == false && descendente == false){
            System.out.println("Son todos iguales " );
        }
        if(ascendente == true && descendente == false){
            System.out.println("Ascendente" );
        }
        if(ascendente == false && descendente == true){
            System.out.println("Descendente" );
        }
    }
}
