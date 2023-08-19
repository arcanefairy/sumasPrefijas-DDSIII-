
package sumasprefijas2;

/**
 *
 * @author Hp
 */
public class SumasPrefijas2 {

   
    public static void main(String[] args) {
       if (args.length < 3) {
            System.out.println("Debe proporcionar al menos tres números como argumentos.");
            return;
        }

        int x = Integer.parseInt(args[0]); // Valor de x
        int[] numeros = new int[args.length - 1]; // Arreglo de números

        // Recopilación de números del arreglo
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = Integer.parseInt(args[i + 1]);
        }
        
        boolean buscar = false;

        // Verificar si existe un par de elementos cuya suma sea x
        for (int i = 0; i < numeros.length - 1; i++) {
            for (int j = i + 1; j < numeros.length; j++) {
                if (numeros[i] + numeros[j] == x) {
                    buscar = true;
                    break;
                }
            }
            if (buscar) {  
                break;
            }
        }
        
        // Imprimir el resultado
        if (buscar) {
            System.out.println("Si");
        } else {
            System.out.println("No");
        }
        
    }
    
}
