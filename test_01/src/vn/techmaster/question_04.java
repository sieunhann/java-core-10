package vn.techmaster;

public class question_04 {
    public static void showPrimeNumbers() {
        int count = 0;

        for (int n = 2; 1 < n; n++) {
            boolean flag = true;
            int squareRoot = (int) Math.sqrt(n);
            for (int i = 2; i <= squareRoot; i++) {
                if (n % i == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag == true) {
                count++;
                System.out.print(n + "\t");
            }
            if (count == 10) {
                break;
            }
        }
    }

        public static void showPrimeNumber(){

            for(int n = 2; 1 < n; n++){
                boolean flag = true;
                int squareRoot = (int) Math.sqrt(n);
                for (int i = 2; i <= squareRoot; i++){
                    if (n % i == 0){
                        flag = false;
                        break;
                    }
                }
                if(flag == true){
                    System.out.print(n + "\t");
                }
                if(n >= 10){
                    break;
                }
            }
    }
}
