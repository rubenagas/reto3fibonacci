/* Reto de Mouredev:
 * Reto #3
 * LA SUCESIÓN DE FIBONACCI
 *
 * Enunciado: Escribe un programa que imprima los 50 primeros números de la sucesión de Fibonacci empezando en 0.
 * La serie Fibonacci se compone por una sucesión de números en la que el siguiente siempre es la suma de los dos anteriores.
 * 0, 1, 1, 2, 3, 5, 8, 13...
 */
public class Main {
    public static void main(String[] args) {

        //Crear e inicializar las variables
        long var1 = 0;
        long var2 = 1;
        long res;

        //Realizar un bucle for para hacer la serie de fibonacci
        for (int i = 0; i < 50; i++) {
            System.out.println(var1);
            res = var1 + var2;
            var1 = var2;
            var2 = res;
        }
    }
}