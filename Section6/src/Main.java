import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Traditional Switch Challenge!
        char charValue = 'X';
        switch (charValue) {
            case 'A':
                System.out.println("A is able");
                break;
            case 'B':
                System.out.println("B is baker");
                break;
            case 'C':
                System.out.println("C is charlie");
                break;
            case 'D':
                System.out.println("D is dog");
                break;
            case 'E':
                System.out.println("E is easy");
                break;
            default:
                System.out.println("Letter " + charValue + " was not found in the switch");
                break;
        }

        //Switch Expression Challenge!
        printWeekDay(0);
        printWeekDay(1);
        printWeekDay(2);
        printWeekDay(3);
        printWeekDay(4);
        printWeekDay(5);
        printWeekDay(6);
        printWeekDay(7);


        //For Statement Challenge!
        int count = 0;

        for (int i = 10; count < 3 && i <= 50; i++) {
            if (isPrime(i)) {
                System.out.println("number " + i + " is a prime number");
                count++;
            }
        }


         // While Loop Challenge!
         int number = 4;
         int finishNumber = 20;
         int evenCount = 0;
         int oddCount = 0;
 
         while (number <= finishNumber) {
             number++;
             if (!isEvenNumber(number)) {
                 oddCount++;
                 continue;
             }
             System.out.println("Even number " + number);
             evenCount++;
             if (evenCount >= 5) {
                 break;
             }
         }
 
         System.out.println("Total odd numbers found = " + oddCount);
         System.out.println("Total even numbers found = " + evenCount);


         //Digit Sum Challenge
         System.out.println("The sum of the digits in number 1234 is " + sumDigits(1234));
         System.out.println("The sum of the digits in number 1234 is " + sumDigits(-125));
         System.out.println("The sum of the digits in number 1234 is " + sumDigits(4));
         System.out.println("The sum of the digits in number 1234 is " + sumDigits(32123));


         //Reading Input Challenge!
         Scanner scanner = new Scanner(System.in);

         int counter = 1;
         double sum = 0;
 
         do {
             System.out.println("Enter number #" + counter + ":");
             String nextNumber = scanner.nextLine();
             try {
 //                int number = Integer.parseInt(nextNumber);
                 double number1 = Double.parseDouble(nextNumber);
                 counter++;
                 sum += number1;
             } catch (NumberFormatException nfe) {
                 System.out.println("Invalid number");
             }
         } while (counter <= 5);
 
         System.out.println("The sum of the 5 numbers = " + sum);
         scanner.close();

         //Min And Max Challenge!
        double max = 0;
        double min = 0;
        int loopCount = 0;

        while (true) {
            System.out.println("Enter a number, or any character to exit:");
            String nextEntry = scanner.nextLine();
            try {
                double validNum = Double.parseDouble(nextEntry);
                if (loopCount == 0 || validNum < min) {
                    min = validNum;
                }
                if (loopCount == 0 || validNum > max) {
                    max = validNum;
                }
                loopCount++;
            } catch (NumberFormatException nfe) {
                break;
            }
        }

        if (loopCount > 0) {
            System.out.println("min = " + min + ", max = " + max);
        } else {
            System.out.println("No valid data entered");
        }
        scanner.close();

        


    }

     

    
/* 
    public static void printDayOfWeek(int day) {

        String dayOfWeek = switch (day) {
            case 0 -> {"Sunday"; }
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            default -> "Invalid Day";
        };

        System.out.println(day + " stands for " + dayOfWeek);
    }
    */

    public static void printWeekDay(int day) {

        String dayOfWeek = "Invalid Day";
        if (day == 0) {
            dayOfWeek = "Sunday";
        } else if (day == 1) {
            dayOfWeek = "Monday";
        } else if (day == 2) {
            dayOfWeek = "Tuesday";
        } else if (day == 3) {
            dayOfWeek = "Wednesday";
        } else if (day == 4) {
            dayOfWeek = "Thursday";
        } else if (day == 5) {
            dayOfWeek = "Friday";
        } else if (day == 6) {
            dayOfWeek = "Saturday";
        }

        System.out.println(day + " stands for " + dayOfWeek);
    }

    public static boolean isPrime(int wholeNumber) {

        if (wholeNumber <= 2) {
            return (wholeNumber == 2);
        }

        for (int divisor = 2; divisor <= wholeNumber / 2; divisor++) {
            if (wholeNumber % divisor == 0) {
                return false;
            }
        }

        return true;
    }

    public static boolean isEvenNumber(int number) {

        if ((number % 2) == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static int sumDigits(int number) {

        if (number < 0) {
            return -1;
        }

        int sum = 0;

        while (number > 9) {
            sum += (number % 10);
            number = number / 10;
        }

        sum += number;

        return sum;
    }
}
