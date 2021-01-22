public class EjemploArreglosForInverso {
    public static void main(String[] args) {

        String[] product = new String[4];
        int tam = product.length;

        product[0] = "Pc gamer Auros";
        product[1] = "Bicliceta todo terreno";
        product[2] = "Teclado de Apple";
        product[3] = "Silla gamer";

        System.out.println("PRIMERA FORMA INVERSO");
        //Primera forma para Inverso
        for(int i = 0; i < tam; i++){
            System.out.println("Producto " + (tam-1-i) + ": Valor " + product[tam-1-i]);
        }

        System.out.println("\nSEGUNDA FORMA INVERSO");
        //Segunda Forma para Inverso
        for(int i = tam -1; i >= 0; i--){
            System.out.println("Producto " + i + ": Valor " + product[i]);
        }

    }
}
