package sumasprefijas;

 // @author Adriana Leon


 
public class SumasPrefijas {

 

    
    public static void main(String[] args) {
       if (args.length == 0) {
            System.out.println("Se debe proporcionar al menos un número como argumento.");
            return;
        } //Este if es solo un pequeño recordatorio que el usuario debe insertar mínimo un número para que el programa
       // funcione

        int[] numeros = new int[args.length];
        int[] SumP = new int[args.length]; //
        

        for (int i = 0; i < args.length; i++) {
            numeros[i] = Integer.parseInt(args[i]);
            SumP[i] = (i == 0) ? numeros[i] : SumP[i - 1] + numeros[i];
        }

        for (int i = 0; i < args.length; i++) {
            System.out.println(numeros[i] + ", " + SumP[i]);
        }
    }
    }
       

