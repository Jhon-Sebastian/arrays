public class EjemploArreglosCombinados {

    public static void main(String[] args) {

        int[] a = new int[10];  //Arreglo 1
        int[] b = new int[10];  //Arreglo 2
        Integer[] c = new Integer[20]; //Arreglo 3

        //Llenando datos

        for (int i = 0; i < a.length; i++){
            a[i] = i+1;
        }

        for (int i = 0; i < b.length; i++){
            b[i] = (i+1)*5;
        }


        // COMBINANDO LOS 2 ARREGLOS
        int aux = 0;
        for(int i = 0; i < a.length; i++){
            c[aux++] = a[i]; // Se asigna el valor a la posicion 0 -> luego se incrementa
            c[aux++] = b[i]; // Se asgina el valor a la posicion 1 -> luego se incrementa
        }



        // MOSTRANDO ARREGLO
        System.out.println("Arreglo generado a partir de los 2 primeros");
        for (int i = 0; i < c.length; i++){
            System.out.println("c[i] = " + c[i]);
        }




        System.out.println("Arreglo Inverso\n");
        //arregloInverso(c);

        System.out.println("\n Ordenamiento Burbuja\n");
        //ordenamientoBurbujaOptimizado(c);

        System.out.println("\nArrelgo Final -> 2 elementos de arreglo a y b intercalados\n");
        combinarDosArreglosConDosElementos(a,b,c);

    }

    private static void arregloInverso(Integer[] c){
        int largo = c.length;
        for (int i = 0; i < largo/2; i++){
            int actual = c[i];
            int inverso = c[largo-1-i];
            c[i] = inverso;
            c[largo-1-i] = actual;
        }

        for (int i = 0; i < c.length; i++){
            System.out.println("c[i] = " + c[i]);
        }
    }

    private static void ordenamientoBurbujaOptimizado(Integer[] c){
        Integer largo = c.length;
        for(int i = 0; i < largo; i++){
            for(int j = 0; j < largo - 1 -i; j++){
                if(c[j+1].compareTo(c[j]) < 0){
                    Integer aux = c[j];
                    c[j] = c[j+1];
                    c[j+1] = aux;
                }
            }
        }

        for (int i = 0; i < c.length; i++){
            System.out.println("c[i] = " + c[i]);
        }
    }

    private static void combinarDosArreglosConDosElementos(int[] a, int[] b, Integer[] c){
        /*
            Combinar 2 arreglos en un tercer arreglo
            pero en lugar de intercarlar -> 1 elemento de a y 1 elemento de b
            ahora es 2 elementos de a 2 elementos de b
         */
        Integer aux = 0;
        for(int i = 0; i < a.length; i+=2){
            for(int j = 0; j < 2; j++){
                c[aux++] = a[i+j];
            }
            for(int j = 0; j < 2; j++){
                c[aux++] = b[i+j];
            }
        }

        //Mostrando arreglo
        for(int i = 0; i < a.length; i++){
            System.out.println("c[i] = " + c[i]);
        }



        /*
        PRACTICA ESCRITA 2 ELEMETENTOS POR CADA ARREGLO EN UN TERCER ARREGLO

        // a = 1,2,3,4,5,6,7,8,9,10
        // b = 5,10,15,20,25,30,35,40

        // c = 1,2,5,10,3,4

                int aux = 0;
                for(int i = 0; i < a.length; i+=2){       i = 2
                    for(int j = 0; j < 2; j++){
                      c[aux++] = a[i+j];                  aux = 6 ->  i = 2  ->  j = 2,
                    }
                    for(int j = 0; j < 2; j++){
                      c[aux++] = b[i+j];
                    }
                }
         */

    }

}
