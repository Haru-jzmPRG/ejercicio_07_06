public class App {
    public static void main(String[] args) throws Exception {
        // int[] numeros = new int[12];

        // System.out.println("Vaya introduciendo números enteros pulsando INTRO");
        // for (int i = 0; i < 12; i++) {
        //     numeros[i] = Integer.parseInt(System.console().readLine());
        // }

        // for (int i = 0; i < 12; i++) {
        //     numeros[i] = i+1;
        //     if (numeros[i] == 11) { 
        //         numeros[i] = 0;
        //     }
        // }

        // for (int i = 0; i < 12; i++) {
        //     System.out.printf("|%3d|", i);
        // }
        // System.out.println();

        // for (int i = 0; i < 12; i++) {
        //     System.out.printf("|%3d|", numeros[i]);
        // }

        //Corrección
final int N = 12;          // Tamaño del array
        int[] numero = new int[N]; // Array donde guardaremos los 12 números
        int i;                     // Variable índice para los bucles

        System.out.println("Vaya introduciendo números enteros y pulsando INTRO");

        // -----------------------------
        // LECTURA DE LOS 12 NÚMEROS
        // -----------------------------
        for (i = 0; i < N; i++) {
            numero[i] = Integer.parseInt(System.console().readLine());
        }

        System.out.println();

        for (int i = 0; i < 12; i++) {
            System.out.printf("|%3d|", numeros[i]);
        }
    }
}
