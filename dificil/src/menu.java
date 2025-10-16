import java.util.Scanner;

public class menu {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        //declarar variables
        int num1;
        int num2;
        int num3;
        int menu;
        int mayor;
        int menor;
        int suma;
        float div;


        //pedir datos por teclado
        System.out.println("introduzca el primer numero: ");
        num1=leer.nextInt();
        System.out.println("introduzca el segundo numero: ");
        num2=leer.nextInt();
        System.out.println("introduzca el tercer numero: ");
        num3=leer.nextInt();

        //inicalizacion variabels
        mayor= num1;
        menor= num1;

        //opciones menu
        System.out.println("1.cual es mayor");
        System.out.println("2.cual es menor");
        System.out.println("3.cual es la media");
        System.out.println("4.sacar los pares");
        System.out.println("5.sacar los impares");
        System.out.println("6.ordenar de mayor a menor");
        System.out.println("7.ordenar de menor a mayor");
        menu=leer.nextInt();

        //validar menu
        if (menu<1 || menu>7){
            System.out.println("error el numero introducido no se encuentra entre las opciones");
        }

        //menu
        switch (menu) {
            case 1:
                if(num2 > mayor){
                    mayor = num2;
                }
                if(num3 > mayor){
                    mayor = num3;
                }
                System.out.println("El numero mayor es: "+mayor);
                break;
            case 2:
                if(num2 < menor){
                    menor = num2;
                }
                if(num3 < menor){
                    menor = num3;
                }
                System.out.println("El numero menor es: "+menor);
                break;
            case 3:
                suma = num1+num2+num3;
                div = suma/ 3.0F;
                System.out.println("La media es: "+div);
                break;
            case 4:
                boolean hayPares;
                hayPares=false;
                if(num1 %2 == 0) {
                    hayPares=true;
                    System.out.println(num1 + " es par");
                }
                if(num2 %2 == 0){
                    hayPares=true;
                    System.out.println(num2 + " es par");
                }
                if(num3 %2 == 0){
                    hayPares=true;
                    System.out.println(num3 + " es par");
                }
                if (hayPares == false){
                    System.out.println(num1 + " no hay pares");
                }
                break;
            case 5:
                int contador=0;
                
                if(num1 %2 != 0) {
                    System.out.println(num1 + " es impar");
                    contador++;
                }if(num2 %2 != 0){
                    System.out.println(num2 + " es impar");
                    contador++;
                }
                if(num3 %2 != 0){
                    System.out.println(num3 + " es impar");
                    contador++;
                }
                if(contador==0){
                    System.out.println(" no hay impares");
                }else{
                    System.out.println("hay " + contador + " impares");
                }
                break;
            case 6:
                if (num1>num2 && num1>num3)  {
                    mayor = num1;
                    if (num2 > num3) {
                        System.out.println("el orden de mayor a menor es: " + mayor + " , " + num2 + " , " + num3);
                    } else {
                        System.out.println("el orden de mayor a menor es: " + mayor + " , " + num3 + " , " + num2);
                    }
                }else{
                    if (num2>num1 && num2>num3){
                        mayor = num2;
                        if (num1 > num3) {
                            System.out.println("el orden de mayor a menor es: " + mayor + " , " + num1 + " , " + num3);
                        } else {
                            System.out.println("el orden de mayor a menor es: " + mayor + " , " + num3 + " , " + num1);
                        }
                    }else {
                        if (num3>num1 && num3>num2){
                            mayor = num3;
                            if (num1 > num2) {
                                System.out.println("el orden de mayor a menor es: " + mayor + " , " + num1 + " , " + num2);
                            } else {
                                System.out.println("el orden de mayor a menor es: " + mayor + " , " + num2 + " , " + num1);
                            }
                        }
                    }
                }

                break;
            case 7:
                if (num1<num2 && num1<num3)  {
                    menor = num1;
                    if (num2 < num3) {
                        System.out.println("el orden de menor a mayor es: " + menor + " , " + num2 + " , " + num3);
                    } else {
                        System.out.println("el orden de menor a mayor es: " + menor+ " , " + num3 + " , " + num2);
                    }
                }else{
                    if (num2<num1 && num2<num3){
                        menor = num2;
                        if (num1 < num3) {
                            System.out.println("el orden de menor a mayor es: " + menor + " , " + num1 + " , " + num3);
                        } else {
                            System.out.println("el orden de menor a mayor es: " + menor + " , " + num3 + " , " + num1);
                        }
                    }else {
                        if (num3<num1 && num3<num2){
                            menor = num3;
                            if (num1 < num2) {
                                System.out.println("el orden de menor a mayor es: " + menor + " , " + num1 + " , " + num2);
                            } else {
                                System.out.println("el orden de menor a mayor es: " + menor + " , " + num2 + " , " + num1);
                            }
                        }
                    }
                }
                break;

        }
        leer.close();
    }
}