import java.util.Scanner;

public class App {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el dia que naciste");
        double dia = sc.nextDouble();

        System.out.println("Introduce el mes que naciste");
        double mes = sc.nextDouble();

        System.out.println("Introduce el año que naciste");
        double año = sc.nextDouble();

        double diahoy = 7;
        double meshoy = 10;
        double añohoy = 2025;



        if (dia < 0 || mes < 0 || año < 0) {
            System.out.println("Los datos introducidos son incorrectos");
        } 
        
        else if (mes > 12) {
            System.out.println("Los datos introducidos son incorrectos");
        } 
        
        else if (mes == 2 && dia > 29) {
            System.out.println("Los datos introducidos son incorrectos");
        } 
        
        else if ((mes == 4 || mes == 6 || mes == 9 || mes == 11) && dia > 30) {
            System.out.println("Los datos introducidos son incorrectos");
        } 
        
        else if (dia > 31) {
            System.out.println("Los datos introducidos son incorrectos");
        } 
        
        else if (dia == diahoy && mes == meshoy) {
            System.out.println("Feliz cumpleaños! Tu edad es 0 años" );            
        }             
        
        else if (año > añohoy || (mes > meshoy && año == añohoy) || (mes == meshoy && dia > diahoy && año == añohoy)) {
            System.out.println("No has nacido todavia");
        } 
        
        else if (mes > meshoy) {
            double edad = añohoy - año - 1;

            System.out.println("Tu edad es: " + edad + " años" );            
        } 
    }
    

}
