import java.util.Scanner;

public class EjemploArreglosNumeroMayor {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] x = new int[5];

        for(int i = 0; i < x.length; i++){
            System.out.println("Ingrese el num " + (i+1) + " :");
            x[i] = sc.nextInt();
        }

        numMayor(x);

    }

    private static void numMayor(int[] x){
        int mayor = 0;
        for(int i = 0; i < x.length; i++){
            if(x[i] > mayor){
                mayor = x[i];
            }
        }
        System.out.println("\nEl numero mayor es: " + mayor);
    }

}
