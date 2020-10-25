import java.util.Scanner;
import java.util.concurrent.LinkedTransferQueue;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Scratch {

    public static void main(String[] args) {
        int Day1;
        System.out.print("Enter Your Num");
        Scanner num = new Scanner(System.in);
        Day1 = num.nextInt();
        if (Day1 == 1) //true
            System.out.print("Mondey");
        {if  (Day1 == 8) // true
            System.out.print("Mondey");}
        {if (Day1==15) // true
            System.out.print("Mondey");}
        { if (Day1==22) // true
            System.out.print("Mondey");}
        {if (Day1==29) // true
            System.out.print("Mondey");}
        { if (Day1 ==2) // true
            System.out.print("Tuesday");}
        {if (Day1 == 9) // true
            System.out.print("Tuesday");}
        { if (Day1 ==16) // true
            System.out.print("Tuesday");}
        {if (Day1 == 23) // true
            System.out.print("Tuesday");}
        { if (Day1 ==30) // true
            System.out.print("Tuesday");}
        { if (Day1 ==3) // true
            System.out.print("Wednesday");}
        { if (Day1 ==10) // true
            System.out.print("Wednesday");}
        { if (Day1 ==17) // true
            System.out.print("Wednesday");}
        { if (Day1 == 24) // true
            System.out.print("Wednesday");}
        { if (Day1 ==31) //true
            System.out.print("Wednesday");}
        {if (Day1 ==4) // true
            System.out.print("Thursday");}
        {if (Day1 ==11) // true
            System.out.print("Thursday");}
        {if (Day1 ==18) // true
            System.out.print("Thursday");}
        {if (Day1 ==25) // true
            System.out.print("Thursday");}
        {if (Day1 ==5) // true
            System.out.print("Friday");}
        {if (Day1 ==12) // true
            System.out.print("Friday");}
        {if (Day1 ==19) // true
            System.out.print("Friday");}
        {if (Day1 ==26) // true
            System.out.print("Friday");}
        {if (Day1 ==6) // true
            System.out.print("Saturday");}
        {if (Day1 ==13) // true
            System.out.print("Saturday");}
        {if (Day1 ==20) // true
            System.out.print("Saturday");}
        {if (Day1 ==27) // true
            System.out.print("Saturday");}
        {if (Day1 ==7) // true
            System.out.print("Sunday");}
        {if (Day1 ==14) // true
            System.out.print("Sunday");}
        {if (Day1 ==21) // true
            System.out.print("Sunday");}
        {if (Day1 ==28) // true
            System.out.print("Sunday");}
        {if (Day1 ==32) // true
            System.out.print("Julia it was not correct day try again");}
        {if (Day1 ==33) // true
            System.out.print("Julia it was not correct day try again");}
        {if (Day1 ==34) // true
            System.out.print("Julia it was not correct day try again");}
        {if (Day1 ==35) // true
            System.out.print("Julia it was not correct day try again");}
        {if (Day1 ==36) // true
            System.out.print("Julia it was not correct day try again");}
        {if (Day1 ==37) // true
            System.out.print("Julia it was not correct day try again");}
        {if (Day1 ==38) // true
            System.out.print("Julia it was not correct day try again");}
        {if (Day1 ==39) // true
            System.out.print("Julia it was not correct day try again");}
        {if (Day1 ==40) // true
            System.out.print("Julia it was not correct day try again");}
    }
}

    public static void main (String[] args) {   int number;
        System.out.print("Введите число");
        Scanner num = new Scanner(System.in);
        number = num.nextInt();
        if (number<0)
            System.out.print("Diapason from minus infinity to 0");
        {if (number ==0)
            System.out.print("Yor number equivalent to 0");
        }
        {if (number >0)
            System.out.print("Diapason from 0 to plus infinity");
        }
}
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);
        final String in = sc.nextLine();
        final Pattern pattern = Pattern.compile("-?\\d+");
        final Matcher matcher = pattern.matcher(in);

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        while (matcher.find()) {
            int nextNumber = Integer.valueOf(matcher.group());
            if (nextNumber > max) {
                max = nextNumber;
            }
            if (nextNumber < min) {
                min = nextNumber;
            }

        }
        System.out.printf("max=%d\nmin=%d%n", max, min);

    }
}
public static void main(String[] args) {
        int X;
        System.out.print("Enter Your Num");
        Scanner num = new Scanner(System.in);
        X = num.nextInt();
        if (X == 90) //true
        System.out.print("Range minus 10%");
        {if  (X == 110) // true
        System.out.print("Range plus 10%");}
        {if (X<90) // true
        System.out.print("Range more than 10%");}
        { if (X>110) // true
        System.out.print("Range more than 10%");}
        { if (X==100) // true
        System.out.print("You likke");}
        }


