//package org.example;
//
//public class Prob3Prac {
//
//  public static void main(String[] args) {
//    int num = 33;
//    int ansCnt = 0;
//    //예외처리 할 것?
//    //1. 숫자가 1~10000인가?
//    if (exceptionCheck(num) == -1) {
//      System.out.println("Input is not valid");
//    }
//    for (int i = 1; i <= num; i++) {
//      String curNum = String.valueOf(i);
//
//      if (curNum.contains("3") || curNum.contains("6") || curNum.contains("9")) {
//        for (int j = 0; j < curNum.length(); j++) {
//          if (curNum.charAt(j) == '3' || curNum.charAt(j) == '6' || .charAt(j) == '9'){
//            ansCnt++;
//          }
//        }
//      }
//    }
//    System.out.printf("answer is %d\n", ansCnt);
//  }
//
//  public static int exceptionCheck(int n) {
//    if (n <= 0 || n > 10000) {
//      return -1;
//    }
//    return 1;
//  }
//
//}
