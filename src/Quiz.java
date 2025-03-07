import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa un número para generar un triangulo");
        System.out.println("El número ingresado sera el valor maximo del triangulo");
        int numUno = scanner.nextInt();
        System.out.println("-----------------------------");
        if (numUno>1 & numUno<7) {
            if (numUno<=2 & numUno>=2) {
                System.out.println("  2");
                System.out.println("1 2");
            }
            if (numUno<=3 & numUno>=3) {
                System.out.println("     3");
                System.out.println("   2 3");
                System.out.println(" 1 2 3");
                
            }
            if (numUno<=4 & numUno>=4) {
                System.out.println("       4");
                System.out.println("     3 4");
                System.out.println("   2 3 4");
                System.out.println(" 1 2 3 4");
            }
            if (numUno<=5 & numUno>=5) {
                System.out.println("         5");
                System.out.println("       4 5");
                System.out.println("     3 4 5");
                System.out.println("   2 3 4 5");
                System.out.println(" 1 2 3 4 5");
            }
            if (numUno<=6 & numUno>=6) {
                System.out.println("           6");
                System.out.println("         5 6");
                System.out.println("       4 5 6");
                System.out.println("     3 4 5 6");
                System.out.println("   2 3 4 5 6");
                System.out.println(" 1 2 3 4 5 6");
    
                
            }
            
        }
       
       
    }
}
