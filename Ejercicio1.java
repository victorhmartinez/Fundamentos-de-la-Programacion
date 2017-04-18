/**Elabore un algoritmo que calcule e imprima el costo de producción de un artículo,teniendo como dato 
 * la descripción y el número de unidades producidas. El costo se calcula multiplica el número de unidades 
 * producidas por un factor de costo de materiales de 3.5 y sumando al producto un costo fijo de 10 700.
*/
package ejercicio1;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada=new Scanner (System.in);
        // Declaracion de variables
        String descrip;
        double unit, costmat = 3.5 , costo,product, costF = 10.700;
        // Solicitud de ingreso de datos
        System.out.println("Ingrese la descripcion del producto");
        descrip = entrada.next() ;
        System.out.println("Ingrese la cantidad de unidades aquiridos");
        unit=entrada.nextDouble();
        // Calculos
        costo=unit*costmat ;
        product = costo + costF;
        System.out.println("El costo del: " +descrip+ " es de " +product );
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
