import java.text.SimpleDateFormat;
import java.util.Arrays;

public class EjemploArreglosFor {
    public static void main(String[] args) {
        
        String[] product = new String[4];
        int tam = product.length;
        
        product[0] = "Pc gamer Auros";
        product[1] = "Bicliceta todo terreno";
        product[2] = "Teclado de Apple";
        product[3] = "Silla gamer";

        System.out.println("------------\n");
        for(int i = 0; i < tam; i++){
            System.out.println("Producto " + i + " : "+ product[i]);
        }

        Arrays.sort(product);
        System.out.println("\n === Usando for each y ordenado ===");
        for(String ele : product){
            System.out.println("ele = " + ele);
        }

        System.out.println("\n === Usando while y ordenado ===");
        int i = 0;
        while( i < tam){
            System.out.println("pro = " + product[i]);
            i++;
        }

    }
}
