package org.example;

import org.apache.commons.lang.StringUtils;

import java.util.Scanner;

public class Main {
    private final Scanner scan = new Scanner(System.in);

    public Main(){
        System.out.println("Enter something");
        String input = scan.next();
        System.out.printf("\"%s\" contains integer = %b \n",input, StringUtils.isNumeric(input));
        System.out.printf("\"%s\" inverted case = %s \n",input, StringUtils.swapCase(input));
        System.out.printf("\"%s\" reversed = %s \n",input, StringUtils.reverse(input));
        input = StringUtils.reverse(input);
        System.out.printf("\"%s\" inverted reversed case = %s \n",input, StringUtils.swapCase(input));
    }

    public static void main(String[] args) {
        new Main();
    }
}