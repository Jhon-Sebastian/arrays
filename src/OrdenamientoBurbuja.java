import java.util.ArrayList;
import java.util.List;

public class OrdenamientoBurbuja {

    private static void arregloInverso(String[] valores){
        int length = valores.length;
        System.out.println("\nMUTADO");
        //Inverso pero modificando la estrucutra y los valores internos
        for(int i = 0; i < length/2; i++){
            String actual = valores[i];
            String inverso = valores[length-1-i];
            valores[i] = inverso;
            valores[length-1-i] = actual;
        }
    }
    private static void ordenamientoBurbujarOptimizado(String[] valores){
        int length = valores.length;
        for(int i = 0; i < length; i++){ //Recorre
            for(int j = 0; j < length -1 -i; j++){ // Compara tabla UNICODE
                if(valores[j+1].compareTo(valores[j]) < 0){ // i < j
                    String aux = valores[j];
                    valores[j] = valores[j+1];
                    valores[j+1] = aux;
                }
            }
        }

        for(int i = 0; i < length; i++){
            System.out.println("valores[i] = " + valores[i]);
        }
    }

    public static void main(String[] args) {

        String[] valores = {"Apple watch","Pc gamer","Teclado gamer","Pantalla LCD" ,"Safari"};
        int length = valores.length;

        ordenamientoBurbujarOptimizado(valores);

        Integer[] num = {8,5,2,3,6,1};

        /*
        String A = "aadd",B="aadd";
        String[] valorA = new String[A.length()];
        String[] valorB = new String[B.length()];
        for(int i = 0; i < valorA.length; i++){
            if(valorA[i] == valorB[i]){
                System.out.println("Iguales");
            }
        }
        */

        /*
            Comparacion en la tabla UNICODE:

            * Si arroja < 0 entonces la cadena que llama al método es primero lexicográficamente
            * Si arroja = 0 entonces las dos cadenas son lexicográficamente equivalentes
            * Si arroja > 0 entonces el parámetro pasado al método compareTo es lexicográficamente el primero.

         */

        //Ordenamiento burbuja
        for(int i = 0; i < length; i++){ //Recorre
            for(int j = 0; j < length; j++){ // Compara tabla UNICODE
                if(valores[i].compareTo(valores[j]) < 0){ // i < j
                    String auxiliar = valores[i];
                    valores[i] = valores[j];
                    valores[j] = auxiliar;
                }
            }
        }

        //Ejemplo Ordenamiento con numeros
        for(int i = 0; i < num.length; i++){
            for(int j = 0; j < num.length; j++){
                if(num[i].compareTo(num[j]) < 0){
                    Integer auxiliar = num[i];
                    num[i] = num[j];
                    num[j] = auxiliar;
                }
            }
        }

        //Imprimiento numeros
        for(int i = 0; i < num.length; i++){
            System.out.println("i = "+ num[i]);
        }

        System.out.println();

        //Mosstrando arreglo de Strings
        for(int i = 0; i < length; i++){
            System.out.println("i = "+ i +" " + valores[i]);
        }

    }
}
