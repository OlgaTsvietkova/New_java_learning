package New;

import java.util.Scanner;

public class Scan {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter first number: ");
            int num1 = scanner.nextInt();

            System.out.print("Enter second number: ");
            int num2 = scanner.nextInt();
            int res;
            System.out.print("Action: ");
            String action = scanner.nextLine();
            action = scanner.nextLine();

            switch (action){
                case "+":
                    res = num1+num2;
                    System.out.print("Result: "+ res);
                    break;
                case "-":
                    res = num1-num2;
                    System.out.print("Result: "+ res);
                    break;
                case "*":
                    res = num1*num2;
                    System.out.print("Result: "+ res);
                    break;
                case "/":
                    if(num2==0)
                        System.out.println("You can't divide by zero!");
                    else {
                        res = num1/num2;
                        System.out.print("Result: "+ res);
                    }
                    break;
                default:
                    System.out.println("Smth wrong");


            }

}}
