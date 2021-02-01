public class EjemploDesplazarPosicion {
    public static void main(String[] args) {

        int[] a = new int[10];
        for (int i = 0; i < 10; i++) {
            a[i] = i+1;
        }

        int ultimo = a[a.length-1];
        for (int i = a.length-2; i >= 0; i--) {
           a[i+1] = a[i];
        }
        a[0] = ultimo;

        System.out.println();
        for (int i = 0; i < a.length; i++) {
            System.out.println("Posicion " + (i) + " = " + a[i]);
        }

    }
}
