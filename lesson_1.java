import java.util.Scanner;
public class lesson_1 {
    public static void main(String[] args) {    //main
//        int vek = 0;
//        double PI = 3.14159d;
//        boolean isTrue = true;
//        char bigA = 'A';
//        String name = "Jmeno";

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Napiš slovo Karel");
//        String userInout = sc.next();

//        Cv. 1

//        int a = 5;
//        int b = 10;
//        int temp = 0;
//        temp = a;
//        a = b;
//        b = temp;
//        System.out.println(a);
//        System.out.println(b);

//        cv 2

/*
       Scanner sc = new Scanner(System.in);


        System.out.println("Zapiš první číslo");
        int firstNumber = sc.nextInt();
        System.out.println("Zapiš druhé číslo");
        int secondNumber = sc.nextInt();

        int plusResult = firstNumber + secondNumber;
        int minusResult = firstNumber - secondNumber;
        int timesResult = firstNumber * secondNumber;
        int devideResult = firstNumber / secondNumber;
        System.out.println("Výsledky");
        System.out.println(plusResult);
        System.out.println(minusResult);
        System.out.println(timesResult);
        System.out.println(devideResult);


     boolean result = 'b' + 'a' + 'c' > 300;
     System.out.println("soucet tri pismen je vetsi nez " + result);


     cv.4

     Scanner sc = new Scanner(System.in);


     System.out.println("Napište své jméno");
     String name = sc.next();
     System.out.println("Napište své příjmení");
     String surname = sc.next();
     System.out.println("Napište své PSČ");
     String psc = sc.next();
     System.out.println("Napište své rodné číslo");
     String rc = sc.next();
     System.out.println(name + surname + psc + rc);

     Scanner sc = new Scanner(System.in);
     System.out.println("Zadej stranu 1");
     int pageOne = sc.nextInt();
     System.out.println("Zadej stranu 2");
     int pageTwo = sc.nextInt();
     int result = 2 * (pageOne + pageTwo);
     System.out.println("Obvod je:");
     System.out.println(result);
*/

     Scanner sc = new Scanner(System.in);
     int celsius = sc.nextInt();
     int Fahrenheit = 9/5 * (celsius + 32);
     System.out.println("Vysledek: " + Fahrenheit);

    }
}
