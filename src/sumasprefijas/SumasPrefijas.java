public class sumasprefijas {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Debe proporcionar al menos un número como argumento.");
            return;
        }

        int[] numeros = new int[args.length];
        int[] SumP = new int[args.length];

        // Recopilación de números e cálculo de la suma prefija
        for (int i = 0; i < args.length; i++) {
            numeros[i] = Integer.parseInt(args[i]);
            SumP[i] = (i == 0) ? numeros[i] : SumP[i - 1] + numeros[i];
        }
        
        // Impresión de números y suma prefija
        for (int i = 0; i < args.length; i++) {
            System.out.println(numeros[i] + ", " + SumP[i]);
        }
    }
}
