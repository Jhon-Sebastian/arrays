import java.util.Scanner;

public class EjemploArreglosParesImpares {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] x = new int[10];
        int[] a = null;
        int[] b = null;

        System.out.println("Ingrese 10 numeros: ");
        for (int i = 0; i < x.length; i++) {
            x[i] = sc.nextInt();
        }

        calcularParesEImpares(x,a,b);

    }
    private static void calcularParesEImpares(int[] x, int[] a, int[] b){
        int par = 0;
        int impar = 0;
        for(int i = 0; i < x.length; i++){
            if(x[i] % 2 == 0){
                par++;
            }else{
                impar++;
            }
        }
        a = new int[par];
        b = new int[impar];
        int j=0,k=0;
        for(int i = 0; i < x.length; i++){
            if(x[i] % 2 == 0){
                a[j++] = x[i];
            }else{
                b[k++] = x[i];
            }

        }
        System.out.println("Arreglo Normal");
        for(int i = 0; i < x.length; i++){
            System.out.print(x[i]+", ");
        }
        System.out.println("\nArreglo Pares");
        for(int i = 0; i < a.length; i++){
            System.out.print(a[i]+", ");
        }
        System.out.println("\nArreglo Impares");
        for(int i = 0; i < b.length; i++){
            System.out.print(b[i]+", ");
        }
    }
}
