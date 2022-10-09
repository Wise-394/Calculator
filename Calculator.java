package worldpackage;


import java.util.Scanner;

public class Calculator {
    public static void main(String[] args)
    {
    int op,num1,num2,done=0;
    float ans;
        Scanner kb = new Scanner(System.in);

        System.out.println("CALCULATOR");
    do {


        System.out.println("1.Addition \n2.Subtraction \n3.Multiplication \n4.Division");
        System.out.println("Enter the corresponding number of operation to perform: ");
        op = kb.nextInt();

        switch (op) {
            case 1:
                System.out.println("enter first number: ");
                num1 = kb.nextInt();
                System.out.println("enter second number: ");
                num2 = kb.nextInt();
                ans = num1 + num2;
                System.out.println(+num1 + " + " + num2 + " = " + ans);
                break;
            case 2:
                System.out.println("enter first number: ");
                num1 = kb.nextInt();
                System.out.println("enter second number: ");
                num2 = kb.nextInt();
                ans = num1 - num2;
                System.out.println(+num1 + " - " + num2 + " = " + ans);
                break;
            case 3:
                System.out.println("enter first number: ");
                num1 = kb.nextInt();
                System.out.println("enter second number: ");
                num2 = kb.nextInt();
                ans = num1 * num2;
                System.out.println(+num1 + " * " + num2 + " = " + ans);
                break;
            case 4:
                System.out.println("enter first number: ");
                num1 = kb.nextInt();
                System.out.println("enter second number: ");
                num2 = kb.nextInt();
                ans = num1 / num2;
                System.out.println(+num1 + " / " + num2 + " = " + ans);
                break;
            default:
                System.out.println("Invalid Input");
        }
        System.out.println("===============");
        System.out.println("Are you done?");
        System.out.println("1.YES 2.NO");
        System.out.println("Enter the corresponding number:");
        done =kb.nextInt();
    } while (done != 1);
        System.out.println("===============");
        System.exit(0);
    }
}
