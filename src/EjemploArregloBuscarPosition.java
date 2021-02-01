import java.util.Scanner;

public class EjemploArregloBuscarPosition {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //int[] a = new int[10];

        //System.out.print("Ingrese 10 numeros");
        //for(int i = 0; i < 10; i++){
        //    a[i] = sc.nextInt();
        //}

        //System.out.println("\nIngrese un numero a buscar");
        //int buscar = sc.nextInt();

        //encontrarPosicionWhile(buscar,a);
        //encontrarPosicionFor(buscar,a);
        encontrarPosicionString(sc);



    }

    private static void encontrarPosicionWhile(int buscar,int[] a){
        int i = 0;
        //Se hace el ciclo buscar la posicion, si la encuntra se sale y queda guardada en i
        while(i < a.length && a[i] != buscar){
            i++;
        }
        //Con la posicion validamos si existe o no el numero a buscar
        if(i == a.length){ // Si llega a 10 fue porque ningun numero es igual al que buscamos
            System.out.println("No se encontro el numero");
        }else if(a[i] == buscar){
            System.out.println("Encontrado en la posicion WHILE= " + i);
        }
    }

    private static void encontrarPosicionFor(int buscar, int[] a){
        //LO MISMO PERO CON FOR
        int j = 0;
        for(; j  < a.length && a[j] != buscar; j++){}
        if(j == a.length){
            System.out.println("No se encontro el numero");
        }else if(a[j] == buscar){
            System.out.println("Encontrado en la posicion FOR= " + j);
        }
    }

    private static void encontrarPosicionString(Scanner sc){
       String[] nombres = new String[4];

        System.out.print("Ingrese 4 nombres\n");
        for(int i = 0; i < nombres.length; i++){
            nombres[i] = sc.nextLine();
        }

        System.out.println("\nIngrese un nombre a buscar");
        String buscar = sc.nextLine();

        int j = 0;
        for(; j < nombres.length && !nombres[j].equals(buscar); j++){}
        if(j == nombres.length){
            System.out.println("No se encontro el nombre a buscar");
        }else if(nombres[j].equals(buscar)){
            System.out.println("Encontrado en la posicion = " + j);
        }

    }

}
