import java.util.Scanner;
    class IntentoMundo {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int[][] mundo = {
                    {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                    {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                    {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                    {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                    {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                    {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
                    {0,0,0,0,0,0,0,0,0,0,0,2,0,0,0,0,0},
                    {0,0,0,0,0,0,0,0,0,0,0,2,0,0,0,0,0},
                    {0,0,0,0,0,0,0,0,0,0,0,2,0,0,0,0,0},
                    {0,0,0,0,0,0,0,0,0,0,0,2,0,0,0,0,0},
                    {0,0,0,0,0,0,0,0,0,0,0,2,0,0,0,0,0},
                    {0,0,0,0,0,0,0,0,0,0,0,2,0,0,0,0,0},
            };
            int[] posicion = {5, 0};
            final String PERSONAJE = " :) ";
            final String CAMPO = " 0 ";
            final String PILAR = " | ";
            final String SUELO = " - ";
            boolean EstaJugando = true;
            do{
                for (int fila = 0; fila < mundo.length; fila++){
                    for (int columna = 0; columna < mundo[fila].length; columna++ ){
                        if (posicion[0] == fila && posicion[1] == columna){
                            System.out.print(PERSONAJE);
                        }else if (mundo[fila][columna] == 0){
                            System.out.print(CAMPO);
                        }else if (mundo[fila][columna] == 1){
                            System.out.print(SUELO);
                        }else if (mundo[fila][columna] == 2){
                            System.out.print(PILAR);
                        }
                    }
                    System.out.println();
                }

                System.out.println("Donde quieres moverte: wasd (para salir: q)");
                String opcion = scanner.nextLine();
                if (opcion.equalsIgnoreCase("w") && posicion[0] > 0){
                    posicion[0]--;
                }else if (opcion.equalsIgnoreCase("a") && posicion[1] > 0) {
                    posicion[1]--;
                }else if (opcion.equalsIgnoreCase("s") && posicion[0] < mundo.length - 1) {
                    posicion[0]++;
                }else if (opcion.equalsIgnoreCase("d") && posicion[1] < mundo[posicion[0]].length - 1) {
                    posicion[1]++;
                }else if (opcion.equalsIgnoreCase("q")) {
                    EstaJugando = false;
                }
            }while (EstaJugando);
        }
    }