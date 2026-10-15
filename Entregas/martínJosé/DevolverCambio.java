import java.util.Scanner;
class DevolverCambio{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce la cantidad a pagar: ");

        int cantidad =scanner.nextInt();
        
        int billetesde100 =cantidad /100;
        cantidad = cantidad % 100;
        
        int billetesde50 = cantidad / 50;
        cantidad = cantidad % 50;
        
        int billetesde20 = cantidad / 20;
        cantidad = cantidad % 20;
        
        int billetesde10 = cantidad / 10;
        cantidad = cantidad % 10;
        
        int billetesde5 = cantidad / 5;
        cantidad = cantidad % 5;
        
        int monedasde2 = cantidad / 2;
        cantidad = cantidad % 2;
        
        int monedasde1 = cantidad;

        String mensaje = " billetes/monedas de";
        
        System.out.println(billetesde100 + mensaje + " 100");
        System.out.println(billetesde50 + mensaje + " 50");
        System.out.println(billetesde20 + mensaje + " 20");
        System.out.println(billetesde10 + mensaje + " 10");
        System.out.println(billetesde5 + mensaje + " 5");
        System.out.println(monedasde2 + mensaje + " 2");
        System.out.println(monedasde1 + mensaje +" 1");
    }
}