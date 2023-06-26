import java.io.FileInputStream;

public class App {
    public static void main(String[] args) throws Exception {
        

        //abrir fichero
        try {
             FileInputStream fichero = new FileInputStream("ejemplo.txt");
             fichero.close();
        } catch (Exception e) {
System.out.println(e.getMessage());        }
        
        try {
            int array[] = { 1, 2, 3, 4, 5, 6, 7 };
            llenarArray(array);
        } catch (ArrayIndexOutOfBoundsException e) {
           
        }

        try {
            System.out.println(divideCero(5, 0));
        } catch (ArithmeticException e) {
            System.out.println("No se puede dividir por 0");
        }
        /*
         * FileNotFound tratando de acceder a un fichero que no existe.
         */

    }

    public static int divideCero(int dividendo, int divisor) throws ArithmeticException {
        try {
            return dividendo / divisor;
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        return dividendo / divisor;
    }

    public static int[] llenarArray(int array[]) throws ArrayIndexOutOfBoundsException {
        try {
            for (int i = 0; i <= 9; i++) {
                array[i] = array[i];
            }

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage() +" Posicion maxima alcanzada") ;
        }

        return array;
    }

}
