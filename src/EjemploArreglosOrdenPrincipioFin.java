public class EjemploArreglosOrdenPrincipioFin {
    public static void main(String[] args) {

        int[] numbers = new int[10];
        int[] b = new int[10];

        for(int i = 0; i < numbers.length; i++){
            numbers[i] = i + 1;
        }

        // Mostrar el primer y ultimo numero y asi sucesivamente
        int aux = 0;
        for(int i = 0; i < numbers.length/2; i++){
            //System.out.print("numbers = " + numbers[i]);
            //System.out.println("numbers = " + numbers[numbers.length-1-i]);
            
            //Ahora guardamos esos datos en un nuevo arreglo
            b[aux++] = numbers[i];
            b[aux++] = numbers[numbers.length-1-i];
        }
        
        for(int i = 0; i < b.length; i++){
            System.out.println("b[i] = " + b[i]);
        }

    }
}
