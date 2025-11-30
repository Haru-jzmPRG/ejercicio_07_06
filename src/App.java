public class App {
    public static void main(String[] args) throws Exception {
        int[] numeros = new int[12];

        System.out.println("Vaya introduciendo números enteros pulsando INTRO");
        for (int i = 0; i < 12; i++) {
            numeros[i] = Integer.parseInt(System.console().readLine());
        }

        for (int i = 0; i < 12; i++) {
            numeros[i] = i+1;
            if (numeros[i] == 11) { 
                numeros[i] = 0;
            }
        }

        for (int i = 0; i < 12; i++) {
            System.out.printf("|%3d|", i);
        }
        System.out.println();

        for (int i = 0; i < 12; i++) {
            System.out.printf("|%3d|", numeros[i]);
        }
    }
}
