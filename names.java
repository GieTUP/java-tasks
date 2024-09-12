import java.util.Scanner;

public class names {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //variables
        int AG = 1;
        int SHEDRICK = 2;
        int ERNIE = 3;
        int KURT = 4;
        int MARIA = 5;
        int GRIFFIN = 6;
        int JAMES = 7;
        int FREON = 8;
        int KYLA = 9;
        int ANGELA = 10;
        int POPOL = 11;
        int RACHEL = 12;
        int MARK = 13;
        int NICO = 14;
        int LEON = 15;
        int IVY = 16;
        int MELODY = 17;
        int JOHN = 18;
        int DANIEL = 19;
        int ANNE = 20;
        int SANDRA = 21;
        int RICKY = 22;
        int HANNA = 23;
        int TONY = 24;
        int GRACE = 25;
        int DON = 26;
        int LUCY = 27;
        int STEVE = 28;
        int BOBBY = 29;
        int EVE = 30;
        int KATE = 31;
        int LEO = 32;

        int answer;
        int sum = 0;

        //output
        System.out.println(
                "Is your name here: AG, ERNIE, MARIA, JAMES, KYLA, POPOL, MARK, LEON, MELODY, DANIEL, SANDRA, HANNA, GRACE, LUCY, BOBBY, KATE <1 for yes and no for 0>");
        answer = input.nextInt();
        if (answer == 1) {
            sum += 1;
        }

        System.out.println(
                "Is your name here: SHEDRICK, ERNIE, GRIFFIN, JAMES, ANGELA, POPOL, NICO, LEON, JOHN, DANIEL, RICKY, HANNA, DON, LUCY, EVE, KATE <1 for yes and no for 0>");
        answer = input.nextInt();
        if (answer == 1) {
            sum += 2;
        }

        System.out.println(
                "Is your name here: KURT, MARIA, GRIFFIN, JAMES, RACHEL, MARK, NICO, LEON, ANNE, SANDRA, RICKY, HANNA, STEVE, BOBBY, EVE, KATE <1 for yes and no for 0>");
        answer = input.nextInt();
        if (answer == 1) {
            sum += 4;
        }

        System.out.println(
                "Is your name here: FREON, KYLA, ANGELA, POPOL, RACHEL, MARK, NICO, LEON, TONY, GRACE, DON, LUCY, STEVE, BOBBY, EVE, KATE <1 for yes and no for 0>");
        answer = input.nextInt();
        if (answer == 1) {
            sum += 8;
        }

        System.out.println(
                "Is your name here: FIVY, MELODY, JOHN, DANIEL, ANNE, SANDRA, RICKY, HANNA, TONY, GRACE, DON, LUCY, STEVE, BOBBY, EVE, KATE <1 for yes and no for 0>");
        answer = input.nextInt();
        if (answer == 1) {
            sum += 16;
        }
        input.close();

        switch (sum) {
            case 1:
                if (sum == 1) {
                    System.out.println("Your name is AG");
                }
                break;

            case 2:
                if (sum == 2) {
                    System.out.println("Your name is ERNIE");
                }
                break;
            case 3:
                if (sum == 3) {
                    System.out.println("Your name is MARIA");
                }
                break;
            case 4:
                if (sum == 4) {
                    System.out.println("Your name is JAMES");
                }
                break;

            case 5:
                if (sum == 5) {
                    System.out.println("Your name is KYLA");

                }
                break;

            case 6:
                if (sum == 5) {
                    System.out.println("Your name is POPOL");
                }
                break;

                case 7:
                if (sum == 7) {
                    System.out.println("Your name is MARK");
                }
                break;

                case 8:
                if (sum == 8) {
                    System.out.println("Your name is LEON");
                }
                break;

                case 9:
                if (sum == 9) {
                    System.out.println("Your name is MELODY");
                }
                break;

            case 10:
            if (sum == 10) {
                    System.out.println("Your name is DANIEL");
                }
                break;

            case 11:
                if (sum == 11) {
                    System.out.println("Your name is SANDRA");
                }
                break;

            case 12:
            if(sum == 12){
System.out.println("Your name is ");
            }
        }
    }
}