package com.company;

public class Main {

    static int binaryGap(int num){

        int zeroes = 0;
        //turn int into string
        String binaryString = Integer.toBinaryString(num);
        //then turn the string to an array of characters
        char[] numChar = binaryString.toCharArray();

        for (char c: numChar) {
            if(c == '1'){
                zeroes++;
            }
        }
        return zeroes;
    }

//    TESTS
    public static void main(String[] args) {
	int num = 10;

    System.out.println(binaryGap(num));
    }
}
