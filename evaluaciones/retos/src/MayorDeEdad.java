import java.util.Scanner;

class Edad {
    public static void main(String[] args) {

        Scanner scanner =new Scanner(System.in);

        System.out.println("Introduce tu edad");
        int años = scanner.nextInt();

        String mensaje = ("Eres " +(años>18? "mayor": "menor") +" de edad");

        System.out.println(mensaje);
    }
}