import java.text.DecimalFormat;
import java.util.Scanner;

public class Ingresar {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Ingrese el numero de materias que desee registrar");
            int numMateria = scanner.nextInt();
            scanner.nextLine();
            String[] materia=new String[numMateria];
            for (int i = 0; i < numMateria; i++) {
                System.out.println("Ingrese la materia y la calificación:");
                materia[i]=scanner.nextLine();
            }
            ObtenerCalificacion obtenerCalificacion=new ObtenerCalificacion();
            ObtenerMateria obtenerMateria=new ObtenerMateria();
            double[] calificacion =obtenerCalificacion.obtenerCali(materia);
            String[] materias= obtenerMateria.obtenerNombreMateria(materia);
            int size = calificacion.length;
            double pro = 0;
            for (int j= 0; j < size; j++) {
                pro += calificacion[j] / size;
                System.out.println("Nombre de materia: " + materias[j] + " Calificación de parcial: " + calificacion[j]);
            }
            System.out.println("El promedio del parcial es: " + truncar(pro));
        }

    public static String truncar(double numero) {
        DecimalFormat df = new DecimalFormat("#.0");
        return df.format(numero);
    }
    }

