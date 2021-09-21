
package ClassMath;

public class ejercicio3 {

    
    public static void main(String[] args) {
       int Nota1 = (int) (Math.random()*10);
        System.out.println("Valor1 = "+Nota1);
       int Nota2 = (int) (Math.random()*10);
        System.out.println("Valor2 = "+Nota2);
       int Nota3 = (int) (Math.random()*10);
        System.out.println("Valor3 = "+Nota3);
       int Nota4 = (int) (Math.random()*10);
        System.out.println("Valor4 = "+Nota4);
       int Nota5 = (int) (Math.random()*10);
        System.out.println("Valor5 = "+Nota5);
       int suma = Nota1+Nota2+Nota3+Nota4+Nota5;
        System.out.println("La suma es: "+suma);
       double division = suma/5;
        System.out.println("El promedio es: "+division);
       
        
    }
    
}
