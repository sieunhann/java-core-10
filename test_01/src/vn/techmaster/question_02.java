package vn.techmaster;

public class question_02 {
    public static int countWords(String str){
        int count = 0;
        String[] arr = str.split(" ");
        for(String i : arr){
            count++;
        }
        return count;
    }

    public static void checkCharacter(String str){
        int count = 0;
        System.out.print("Index của kí tự o trong chuỗi là: ");
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == 'o'){
                count++;
                System.out.print(i + "\t");
            }
        }
        System.out.println("\nTổng số kí tự o trong chuỗi là: " + count);
    }
}
