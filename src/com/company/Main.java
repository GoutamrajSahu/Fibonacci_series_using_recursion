package com.company;
import java.util.*;

class Main {

    static int fibonacci(int num){
        if(num <= 1){
            return num;
        }
        return (fibonacci(num-1) + fibonacci(num-2));
    }
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = Sc.nextInt();
        System.out.println(fibonacci(num-1));
    }
}


//class Main {
//
//    static void fab(int num, int num1, int num2){
//        if(num == 0){
//            System.out.println("fibonacci: "+ num2);
//            return ;
//        }
//        int res = num1 + num2;
//        num1 = num2;
//        num2 = res;
//        fab(num-1, num1, num2);
//    }
//    public static void main(String[] args) {
//        Scanner Sc = new Scanner(System.in);
//        System.out.println("Enter the number:");
//        int num = Sc.nextInt();
//        int num1 = 0;
//        int num2 = 1;
//        if(num == 1){
//            System.out.println("fibonacci: "+ num1);
//        }else{
//            fab(num-2,num1,num2);
//        }
//    }
//}