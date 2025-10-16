public class App {
    public static void main(String[] args) {
        System.out.println("Evaluando becas....");

        boolean matriculaCompleta = true;
        int modulosSuspensos = 1;        
        int padres = 2;                   
        double rentaFamiliar = 18000;     
        double smi = 10000;              
        int familia = 4;                


        boolean derechoBeca =
        matriculaCompleta && 
        modulosSuspensos <= 1 &&
           
            (
                padres == 1 ||
                rentaFamiliar <= smi * 2 ||(rentaFamiliar > smi * 2 && rentaFamiliar <= smi * 3 && familia == 4)
            );


        System.out.println("Derecho a Beca");
    }
}
