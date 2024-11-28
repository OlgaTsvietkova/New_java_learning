package New;
import java.util.Arrays;


public class Array_again {

    public static void main(String[] args){
        int[] lotteryNumbers = {4, 8, 15, 16, 23, 41};
        String betterPrintout = Arrays.toString(lotteryNumbers);
        System.out.println(betterPrintout);


        int [] numbers = new int[5];

        for (int i = 0; i<numbers.length; i++ ) {
            numbers[i] = i*10;
            System.out.println(numbers[i]);



    }}
}
