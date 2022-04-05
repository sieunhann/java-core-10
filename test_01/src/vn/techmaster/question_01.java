package vn.techmaster;

public class question_01 {
    public static void square(){
        String[][] arrSquare = new String[4][4];
        for(int i = 0; i < 4; i++){
            for (int j = 0; j < 4; j++){
                arrSquare[i][j] = "*";
                System.out.print(arrSquare[i][j] + "\t");
            }
            System.out.println("\n");
        }
    }

    public static void triangle(){
        String[][] arrSquare = new String[4][4];
        for(int i = 0; i < 4; i++){
            for (int j = 0; j <= i; j++){
                arrSquare[i][j] = "*";
                System.out.print(arrSquare[i][j] + "\t");
            }
            System.out.println("\n");
        }
    }
}
