import java.util.Scanner;

public class docso {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" enter your number : ");
        int number = scanner.nextInt();
        int tram = number / 100;
        int chuc = (number % 100) / 10;
        int donvi = (number % 100) % 10;
        String result = "";
        String result1 = "";
        String result2 = "";
        if (tram != 0) {
            switch (tram) {
                case 1:
                    result = "one ";
                    break;
                case 2:
                    result = " two ";
                    break;
                case 3:
                    result = "three ";
                    break;
                case 4:
                    result = " four ";
                    break;
                case 5:
                    result = "five ";
                    break;
                case 6:
                    result = " six ";
                    break;
                case 7:
                    result = "seven ";
                    break;
                case 8:
                    result = " eight ";
                    break;
                case 9:
                    result = "nine ";
                    break;
            }
        }
        if (chuc != 1 && chuc != 0) {
            switch (chuc) {
                case 2:
                    result1 = " twenty ";
                    break;
                case 3:
                    result1 = "thirty ";
                    break;
                case 4:
                    result1 = " forty ";
                    break;
                case 5:
                    result1 = "fifty ";
                    break;
                case 6:
                    result1 = " sixty ";
                    break;
                case 7:
                    result1 = "seventy ";
                    break;
                case 8:
                    result1 = " eighty ";
                    break;
                case 9:
                    result1 = "ninety ";
                    break;
            }
        } else if (chuc == 1) {
            switch (donvi) {
                case 0:
                    result1 = "ten";
                    break;
                case 1:
                    result1 = "eleven";
                    break;
                case 2:
                    result1 = "twelce";
                    break;
                case 3:
                    result1 = "thirteen";
                    break;
                case 4:
                    result1 = "fourteen";
                    break;
                case 5:
                    result1 = "fifteen";
                    break;
                case 6:
                    result1 = "sixteen";
                    break;
                case 7:
                    result1 = "seventeen";
                    break;
                case 8:
                    result1 = "eighteen";
                    break;
                case 9:
                    result1 = "nineteen";
                    break;
            }
        }
        if (donvi != 0) {
            switch (donvi) {
                case 1:
                    result2 = "one ";
                    break;
                case 2:
                    result2 = " two ";
                    break;
                case 3:
                    result2 = "three ";
                    break;
                case 4:
                    result2 = " four ";
                    break;
                case 5:
                    result2 = "five ";
                    break;
                case 6:
                    result2 = " six ";
                    break;
                case 7:
                    result2 = "seven ";
                    break;
                case 8:
                    result2 = " eight ";
                    break;
                case 9:
                    result2 = "nine ";
                    break;
            }
        }
        if (tram != 0) {
            System.out.println(result + " hundred" + " and " + result1 + " " + result2);
        } else if(tram ==0) {
            System.out.println(result1 + " " + result2);
        }
        if (number ==0) {
            System.out.println(" zero");
        }
    }
}

