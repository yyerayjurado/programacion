import java.util.Scanner;

public class App {
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el numero de dia:");
        int dia = sc.nextInt();
        
        System.out.println("Introduce el numero de mes:");
        int mes = sc.nextInt();

        System.out.println("Introduce el numero de año:");
        int año = sc.nextInt();

        int dia1 = +1;
        int dia2 = +1;
        int mes1 = +1;
        int mes2 = +1;
        int año1 = +1;

        if (dia > 31 || dia < 1 || mes > 12 || mes < 1 || año < 0  || ) {
            System.out.println("Fecha incorrecta");
        } else {
            System.out.println("Fecha correcta");
        }

        switch (mes) {
            case 1, 3, 5, 7, 8, 10, 12:
                if (mes == 2 && dia > 28) {
                    
                    System.out.println("Fecha sumado un dia " + dia);
                break;

        }


        dia1 = dia + 1;
        if (dia1 > 31) {
            dia2 = 1;
        }
        
        if (mes1 > 12) {
            mes2 = 1;
        }


        año1 = año +1;

        System.out.println("La nueva fecha es: " + dia2 + "/" + mes2 + "/" + año1 );
    }

    }




}
