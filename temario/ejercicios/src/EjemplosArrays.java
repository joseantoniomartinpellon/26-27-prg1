public class EjemplosArrays {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int[][] notas = {
            array,
            array,
            array
        };
        array = new int [] {6, 7, 8};

        for (int i = 0; i < notas.length; i++) {
            for (int j = 0; j < notas[i].length; j++) {
                System.out.print(notas[i][j] + " ");
            }
            System.out.println();
        }
        notas[1][1] = 9;

        System.out.println("-------------------Cambio");
        
        for (int i = 0; i < notas.length; i++) {
            for (int j = 0; j < notas[i].length; j++) {
                System.out.print(notas[i][j] + " ");
            }
            System.out.println();
        }
        
    }
}