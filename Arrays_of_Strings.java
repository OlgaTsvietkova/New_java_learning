package New;

public class Arrays_of_Strings {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        numbers[0] = 10;

        // Масив даних - Стрінг
        String[] strings = new String[3];
        strings[0]= "Hello!";
        strings[1] ="Bye";
        strings[2] = "Java";

        // Цикл for
        for(int i = 0; i<strings.length; i++){
            System.out.println(strings[i]);
        }
        System.out.println();

        // Цикл for each
        for(String string:strings){
            System.out.println(string);
        }
        System.out.println();

        // Цикл for each - вивести суму цифр масива
        int[] numbers1 = {1,2,3};
        int sum = 0;
        for (int x:numbers1){
            sum = sum +x;}
        System.out.println(sum);
        }


    }

