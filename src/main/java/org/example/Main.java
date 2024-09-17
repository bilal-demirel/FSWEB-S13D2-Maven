package org.example;

public class Main {
    public static boolean isPalindrome(int number){
        String strNumber = String.valueOf(Math.abs(number));

        for(int i=0; i<strNumber.length(); i++){
            if(strNumber.charAt(i) == strNumber.charAt(strNumber.length()-1-i)){
                continue;
            } else{
                return false;
            }
        }
        return true;
    }
    public  static  boolean isPerfectNumber(int number){
        if(number < 0){
            return false;
        } else{
            int sum = 0;
            for(int i=1; i<number; i++){
                if(number % i == 0){
                    sum += i;
                }
            }
            return sum == number;
        }
    }
    public static String numberToWords(int number){
        if(number < 0){
            return "Invalid Value";
        } else{
            String strNumber = String.valueOf(number);
            StringBuilder strReturn = new StringBuilder();
            for(int i=0; i<strNumber.length(); i++){
                switch (strNumber.charAt(i)){
                    case '0':
                        if(i != strNumber.length()-1) strReturn.append("Zero ");
                        else strReturn.append("Zero");
                        break;
                    case '1':
                        if(i != strNumber.length()-1) strReturn.append("One ");
                        else strReturn.append("One");
                        break;
                    case '2':
                        if(i != strNumber.length()-1) strReturn.append("Two ");
                        else strReturn.append("Two");
                        break;
                    case '3':
                        if(i != strNumber.length()-1) strReturn.append("Three ");
                        else strReturn.append("Three");
                        break;
                    case '4':
                        if(i != strNumber.length()-1) strReturn.append("Four ");
                        else strReturn.append("Four");
                        break;
                    case '5':
                        if(i != strNumber.length()-1) strReturn.append("Five ");
                        else strReturn.append("Five");
                        break;
                    case '6':
                        if(i != strNumber.length()-1) strReturn.append("Six ");
                        else strReturn.append("Six");
                        break;
                    case '7':
                        if(i != strNumber.length()-1) strReturn.append("Seven ");
                        else strReturn.append("Seven");
                        break;
                    case '8':
                        if(i != strNumber.length()-1) strReturn.append("Eight ");
                        else strReturn.append("Eight");
                        break;
                    case '9':
                        if(i != strNumber.length()-1) strReturn.append("Nine ");
                        else strReturn.append("Nine");
                        break;
                }
            }
            return strReturn.toString();
        }
    }
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}
