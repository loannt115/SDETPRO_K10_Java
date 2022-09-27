package lab06;

import java.util.Scanner;

public class StringHandling {
    public static void main(String[] args) {
        //LAB 6.1 Calculate how many minutes in total
        System.out.println("LAB 6.1 Calculate how many minutes in total");
        String myString = "2hrs and 5 minutes";
        String[] splitString = myString.split("and");
        String hourStr = splitString[0];
        String minuteStr = splitString[1];
        int hourNumber = Integer.parseInt(hourStr.replaceAll("[^0-9]", ""));
        int minuteNumber = Integer.parseInt(minuteStr.replaceAll("[^0-9]", ""));
        System.out.println(myString);
        System.out.println("= " + (hourNumber * 60 + minuteNumber) + " minutes");

        //LAB 6.2 Input password maximum 3 times
        System.out.println("==========\n" + "LAB 6.2 Input password maximum 3 times");
        String myPassword = "password123";
        int inputTimes = 0;
        while (inputTimes < 3){
            Scanner scanner = new Scanner(System.in);
            System.out.print("Input your password: ");
            String inputtedPassword = scanner.next();
            if (inputtedPassword.equals(myPassword)) {
                inputTimes = 3;
                System.out.println("Welcome to dashboard!");
            } else if (inputTimes == 2){
                System.out.println("Input wrong password 3 times. Try again after 30 minutes.");
                inputTimes++;
            } else {
                System.out.println("Wrong password. Try again.");
                inputTimes++;
            }
        }

        //LAB 6.3 NOT using REGEX, extract digit character from the String
        System.out.println("==========\n" + "LAB 6.3 NOT using REGEX, extract digit character from the String");
        String myStr = "100 minutes & 26 seconds 12345nabc678";
        String extractedDigitStr = "";
        for (int index = 0; index < myStr.length(); index++){
            if (myStr.charAt(index) >= '0' && myStr.charAt(index) <= '9') {
                extractedDigitStr = extractedDigitStr + myStr.charAt(index);
            }
        }
        System.out.println("==> Extract digit character: " + extractedDigitStr);

        //LAB 6.4 Check http OR https; domain name, .com OR .net
        System.out.println("==========\n" + "LAB 6.4 Check http OR https; domain name, .com OR .net");
        String url = "https://google.abc.com";
        System.out.println("URL is: " + url);
        System.out.println("Protocol: " + urlProtocol(url));
        System.out.println("Domain name: " + urlDomainName(url));
        System.out.println("Domain extension: " + urlDomainExtension(url));
    }

    private static String urlProtocol(String url) {
        return url.split("://")[0];
    }

    private static String urlDomainName(String url) {
        return url.split("://")[1];
    }

    private static String urlDomainExtension(String url) {
        String[] splitStr = url.split("[.]"); //split("\\.")
        return "." + splitStr[(splitStr.length-1)];
    }
}
