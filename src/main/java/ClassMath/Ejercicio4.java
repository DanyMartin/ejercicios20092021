
package ClassMath;


public class Ejercicio4 {

   
    public static void main(String[] args) {
        double decimal1 = Math.random()*50;
        System.out.println("Valor1 = "+decimal1);
        double decimal2 = Math.random()*50;
        System.out.println("Valor2 = "+decimal2);
        System.out.println("Numero redondeado del valor 1 es: ="+(Math.round(decimal1)));
        System.out.println("Numero redondeado del valor 2 es: "+(Math.round(decimal2)));
        
        System.out.println("numero mayor es: "+Math.max(decimal1, decimal2));
    }
    
}
