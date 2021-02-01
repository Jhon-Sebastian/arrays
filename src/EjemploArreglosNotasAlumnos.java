
import java.util.Scanner;

public class EjemploArreglosNotasAlumnos {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        /*
            Recoger las notas de los estudiantes de cada materia
            - Hacer un promedio de cada asignatura
            - Promedio general de las 3 materias
            - Promedio general de 1 alumno en especifico
         */

        double[] classMathematics, classHistory, classLanguage;
        classMathematics = new double[7];
        classHistory = new double[7];
        classLanguage = new double[7];
        double sumMathe = 0, sumHistory = 0, sumLang = 0;

        System.out.println("\nIngrese 7 notas de Matematicas");
        for (int i = 0; i < classMathematics.length; i++) {
            classMathematics[i] = sc.nextDouble();
        }

        System.out.println("Ingrese 7 notas de Historia");
        for (int i = 0; i < classHistory.length; i++) {
            classHistory[i] = sc.nextDouble();
        }

        System.out.println("Ingrese 7 notas de Lenguaje");
        for (int i = 0; i < classLanguage.length; i++) {
            classLanguage[i] = sc.nextDouble();
        }

        //Suma de las notas para poder sacar el promedio
        for (int i = 0; i < 7; i++) {
            sumMathe += classMathematics[i];
            sumHistory += classHistory[i];
            sumLang += classLanguage[i];
        }

        //Promedios
        double promMath = sumMathe/classMathematics.length;
        double promHist = sumHistory/classHistory.length;
        double promLang = sumLang/classLanguage.length;

        //Mostrar promedio de cada asignatura
        System.out.println("Promedio Clase Mathematics = " + promMath);
        System.out.println("Promedio Clase History = " + promHist);
        System.out.println("Promedio Clase Language = " + promLang);
        System.out.println("Promedio general de las 3 asignaturas " + ((promMath+promHist+promLang)/3));

        //Obtener el promedio general de un alumno en especifico
        System.out.println("\nIngrese (0-6) el numero del alumno");
        int id = sc.nextInt();
        System.out.println("Promedio alumno = " + (  (classHistory[id] + classMathematics[id] + classLanguage[id] )/3 ));

    }
}
