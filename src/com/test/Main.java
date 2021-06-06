package src.com.test ;

import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;
        System.out.println("Hello World") ;
        Byte age = 18 ;
        System.out.println(age) ;
        Date now = new Date() ;
        System.out.println(now) ;
        String message = "Hello!" ;
        // (is same as:) String message = new String( original="Hello!" ) ;
        System.out.println(message.length()) ;
        System.out.println(message.indexOf("ll")) ;
        System.out.println(message.replace("!", "???" )) ;
        System.out.println(message) ;
        message = message.replace("!", "@@@@" ) ;
        System.out.println(message) ;
        int[][] numbers = new int[10][15] ;
        int[] nums = {6,4,9,4,5,8} ;
        System.out.println(Arrays.deepToString(numbers)) ;
        System.out.println(Arrays.toString(nums)) ;
        Arrays.sort(nums) ;
        System.out.println(Arrays.toString(nums)) ;
        final float PI = 3.14f ;
        System.out.println(PI) ;
        System.out.println((int)Math.round(PI)) ;
        System.out.println(Math.PI) ;
        System.out.println((int)(Math.random()*100)) ;
        NumberFormat currency = NumberFormat.getCurrencyInstance() ;
        String currency_string = currency.format(12345.1234) ;
        System.out.println(currency_string) ;
        System.out.println("type a number : ") ;
        int number = scanner.nextInt() ;
        scanner.nextLine() ;
        System.out.println("type a string : ") ;
        String inputStr = scanner.nextLine() ;
    }
}
