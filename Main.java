import java.util.Locale;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//
//        //1. Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of
//        //two numbers , takes two numbers as input
//
//        System.out.println(" This is a program for performing mathematical operations");
//        System.out.println(" Enter two numbers and then choose one of the mathematical operations");
//        System.out.println("--------------------------------");
//        System.out.println();
//
//
//        int total = 0;
//        boolean choise = true;
//
//        while (choise == true) {
//
//            System.out.println("Choose one of the mathematical operations: ");
//            System.out.println("press + to add the numbers");
//            System.out.println("press x to multiply the numbers");
//            System.out.println("press / to divide the numbers");
//            System.out.println("Enter mode to remainder the numbers");
//            String ch = input.nextLine();
//            String chh = ch.toLowerCase();
//
//            switch (chh) {
//                case "+": {
//                    System.out.println("Enter number 1: ");
//                    int num1 = input.nextInt();
//                    System.out.println("Enter number 2: ");
//                    int num2 = input.nextInt();
//                    total = num1 + num2;
//                    System.out.println(num1 + " + " + num2 + " = " + total);
//
//
//                    break;
//                }
//                case "x": {
//                    System.out.println("Enter number 1: ");
//                    int num1 = input.nextInt();
//                    System.out.println("Enter number 2: ");
//                    int num2 = input.nextInt();
//                    total = num1 * num2;
//                    System.out.println(num1 + " x " + num2 + " = " + total);
//
//                    break;
//
//                }
//                case "/": {
//                    System.out.println("Enter number 1: ");
//                    int num1 = input.nextInt();
//                    System.out.println("Enter number 2: ");
//                    int num2 = input.nextInt();
//                    total = num1 / num2;
//                    System.out.println(num1 + " / " + num2 + " = " + total);
//
//                    break;
//                }
//                case "mode": {
//                    System.out.println("Enter number 1: ");
//                    int num1 = input.nextInt();
//                    System.out.println("Enter number 2: ");
//                    int num2 = input.nextInt();
//                    total = (num1) % (num2);
//                    System.out.println(num1 + " mode " + num2 + " = " + total);
//
//                }
//
//            }
//            System.out.println("Do you want another calculation? Enter 0 to [exit] or -1 to Complete");
//            int ch2 = input.nextInt();
//            if (ch2 == 0) {
//                choise = false;
//            }
//
//        }
//
//
//        //2. Write a Java program that takes a number as input and prints its multiplication table up to
//        //10.
//
//        System.out.println("enter number ro see mailplxation table : ");
//        int num= input.nextInt();
//
//
//        for(int i=1; i<=10;i++)
//        {
//            System.out.println(num+" x "+ i+" = " +num*i);
//
//        }
//
//
//        //3. Write a Java program to print the area and perimeter of a circle.
//
//
//        System.out.println("enter radis  to calculate : ");
//        double r = input.nextDouble();
//        double total1 = r * 3.14 * 2;
//        double total2 = Math.pow(r , 2) * 3.14 ;
//
//
//        System.out.println(total1 + " "+ total2);
//        System.out.println(" "+ total2);
//
//
//        //4. Java program to find out the average of a set of integers
//
//
//        System.out.println("Enter the count of numbers:  ");
//        int count = input.nextInt();
//        double total=0;
//
//        for(int i =1;i<=count;i++)
//        {
//            System.out.println("Enter an integer: ");
//            double numbers = input.nextDouble();
//            total+=numbers;
//
//        }
//        total=total/count;
//
//        System.out.println("the avg is :");
//        System.out.println(total);
//
//
//
//        //5. Write a Java program that accepts three integers as input, adds the first two integers
//        //together, and then determines whether the sum is equal to the third integer.
//
//
//        System.out.println("enter 1");
//        double num1 = input.nextDouble();
//        System.out.println("enter 2");
//        double num2 = input.nextDouble();
//        System.out.println("enter 3");
//        double num3 = input.nextDouble();
//        double total = num1+num2;
//        if(total==num3)
//        {
//            System.out.println("The result is: true");
//        }
//        else System.out.println("The result is: false");

////6. Write a Java program to reverse a word.
//        System.out.println(" enter the word to revest");
//        String w = input.nextLine();
//        StringBuilder sb = new StringBuilder(w);
//        System.out.println("Reverse word: "+ sb.reverse());
//

        //7 -  Java program to check whether the given number is even or odd

//        System.out.println("enter number ");
//        double num = input.nextDouble();
//        if(num%2==0)
//        {
//            System.out.println("is even number ");
//        }
//        else System.out.println("is odd number");

//
//        //8 - Java program to convert the temperature in Centigrade to Fahrenheit
//
//        System.out.println("Enter temperature in Centigrade: ");
//        double num = input.nextDouble();
//        double confert =((num *9/5)+32) ;
//        System.out.println(confert);
//
//        //9.Write a Java program that takes a string and a number from the user,then prints the
//        //character in the given index.
//
//        System.out.println("Input a string: ");
//        String a = input.nextLine();
//        System.out.println("enter a number ");
//        int num = input.nextInt();
//        System.out.println(a.charAt(num));

//
//        //10. Write a Java program to print the area and perimeter of a rectangle.
//
//
//        System.out.println("what is with? ");
//        double w= input.nextDouble();
//        System.out.println("what is hheit? ");
//        double h= input.nextDouble();
//        double area = (w)*(h);
//        double Perimeter = 2 * (w+h);
//
//        System.out.println("area: "+ area);
//        System.out.println("Perimeter ="+ Perimeter);
//
//        //11. Write a Java program to compare two numbers.
//
//        System.out.println("input firest number :");
//        int num1 = input.nextInt();
//        System.out.println("input second number :");
//        double num2 = input.nextDouble();
//
//
//
//
//
//
//
//         if(num1>num2 && num1>=num2)
//        {
//            System.out.println(num1+" > "+num2);
//            System.out.println(num1+" >= "+num2);
//        }
//        else if(num1<num2 && num1<=num2 ) {
//             System.out.println(num1 + " < " + num2);
//             System.out.println(num1 + " <= " + num2);
//         }
//
//
//        if(num1==num2 )
//        {
//            System.out.println(num1+" = "+num2);
//        }
//        else  if(num1!=num2)
//        {
//            System.out.println(num1+" != "+num2);
//
//        }
//
//        //12. Write a Java program to convert seconds to hours, minutes and seconds.
//
//        System.out.println("enter number in second: ");
//        int num = input.nextInt();
//
//        int hor =num/ 3600 ;
//        int mint = (num % 3600) / 60;
//        int sec = num % 60 ;
//
//
//        System.out.println();
//        System.out.println(hor+":"+mint+":"+sec);
//
//// 13. Write a Java program that accepts four integers from the user and prints equal if all
////four are equal, and not equal otherwise.
//
//        System.out.println("enter number 1");
//        int num1 = input.nextInt();
//        System.out.println("enter number 2");
//        int num2 = input.nextInt();
//        System.out.println("enter number 3");
//        int num3 = input.nextInt();
//        System.out.println("enter number 4");
//        int num4 = input.nextInt();
//
//        if(num1==num2 && num3==num4 && num2==num3 && num4==num1 && num3==num1 && num2==num4)
//        {
//            System.out.println("Numbers are equal! ");
//        }
//        else System.out.println("number is not equal");
//

//
//
//        //14. Write a Java program that reads an integer and check whether it is negative, zero, or
//        //positive.
//
//        System.out.println("enter number to check: ");
//        int num  = input.nextInt();
//        if(num>0)
//        {
//            System.out.println("is psitver number: ");
//        }
//        else if(num<0)
//        {
//            System.out.println("is negetve number ");
//        }
//        else if(num==0)
//        {
//            System.out.println("is 0 number ");
//        }

//
////15.Write a program to enter the numbers till the user wants and at the end it
////should display the count of positive, negative and zeros entered  (End loop use -1 ,
////Don’t count -1).
//        int num =0;
//        int numN = 0;
//        int numP = 0;
//        int zero = 0;
//        System.out.println("this program to add negetive to gathe and psitev togther and zero togtehr :");
//
//
//        while (num!=-1) {
//            System.out.println("enter the numbers : if you want to exit press -1 , Don’t count -1 :");
//            num = input.nextInt();
//
//
//            if (num > 0) {
//                numP++;
//            } else if (num < 0) {
//                if (num!=-1) {
//                    numN++;
//                     }
//                else break;
//
//            } else if (num == 0) {
//                zero++;
//
//            }
//        }
//        System.out.println(numP+" positives ");
//        System.out.println(zero+" zero ");
//        System.out.println(numN+" negatives ");
//


//
//        //16 - Write a program that prompts the user to input an integer and then outputs the
//        //number with the digits reversed.
//
//        System.out.println("enter the number ");
//        String  num = input.nextLine();
//
//
//
//
//            StringBuilder re = new StringBuilder(num);
//
//            System.out.println(re.reverse());
        

//        //17 - Write a program to enter the numbers till the user wants and at the end the
//        //program should display the largest and smallest numbers entered.
//
//
//        int ch = 1;
//        int min=0;
//        int max=0;
//
//        while (ch!=0)
//        {
//            System.out.println("enter number");
//            int num = input.nextInt();
//
//
//            if(num==0)
//        {
//
//            break;
//        }
//            else if (num<=min)
//            {
//                min=num;
//            }
//            else if(num>=max && max<=min)
//            {
//                max=num;
//                min=num;
//            }
//
//
//
//
//
//
//
//
//        }
//        System.out.println("the large number : "+max);
//        System.out.println("the small number :"+min);


//
//        //18 - Determine and print the number of times the character ‘a’ appears in the input
//        //entered by the user.
//
//
//        System.out.println("Enter String:  ");
//        String a = input.nextLine();
//
//        int numberOf = 0;
//
//        for(int i=1;i<=a.length() -1;i++)
//        {
//            if(a.charAt(i) =='a')
//            {
//             numberOf++;
//            }
//
//        }
//        System.out.println(numberOf);
//    }
//    }
//}







