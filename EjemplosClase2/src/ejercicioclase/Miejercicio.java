
package ejercicioclase;
import java.util.Scanner;

public class Miejercicio {
    
    public static void main(String[] args) {
        
        
        String nombre;
        String apellido;
        int edad, nota1, nota2;
        float prom;
        String ciudad,pais;
        Scanner entrada = new Scanner(System.in);
        
        
        System.out.println("Por favor ingresar sus Nombres:");
        nombre = entrada.nextLine();
        
        
        System.out.println("Por favor ingresar su Apellidos:");
        apellido = entrada.nextLine();
        
        
        System.out.println("Por favor ingresar su Edad:");
        edad = entrada.nextInt();
        
        entrada.nextLine(); //limpieza del buffer de entrada de datos
        
        System.out.println("Por favor ingresar su Ciudad:");
        ciudad = entrada.nextLine();
        
        System.out.println("Por favor ingresar su Pais:");
        pais = entrada.nextLine();
       
       System.out.println("Por favor ingresar sus Notas:\nnota 1:");
        nota1 = entrada.nextInt();
        
        System.out.println("nota 2:");
        nota2 = entrada.nextInt();
        
        prom = (nota1+nota2)/2;
        
        System.out.printf("Sus nombres y apellidos: %s %s\nEdad: %s\n"
                + "Ciudad: %s\nPais: %s\nNotas: %s, %s\nPromedio: %s"
                ,nombre,apellido,edad,ciudad,pais,nota1,nota2,prom);
         }
    
}
