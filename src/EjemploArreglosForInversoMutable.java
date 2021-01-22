import java.util.Arrays;
import java.util.Collections;

public class EjemploArreglosForInversoMutable {

    public static void arregloInverso(String[] valores){
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

    public static void main(String[] args) {
        
        String[] valores = {"Rompe cabezas","Pc gamer","Tecladoo gamer","Pantalla LCD" ," Perro amigo"};
        int length = valores.length;

        System.out.println("NORMAL");
        Arrays.sort(valores);
        for(int i = 0; i < length; i++){
            System.out.println("i = " + i +" "+ valores[i]);
        }

        arregloInverso(valores);

        for(int i = 0; i < length; i++){
        System.out.println("i = "+ i +" " + valores[i]);
        }

        //Other form is use the API Collectiosn of java.util
        //Collections.reverse(Arrays.asList(valores));

        /*
        System.out.println("\nUSE API OF COLLECTIONS JAVA");
        for(int i = 0; i < length; i++){
            System.out.println("i = "+ i +" " + valores[i]);
        }
        */
    }
}
