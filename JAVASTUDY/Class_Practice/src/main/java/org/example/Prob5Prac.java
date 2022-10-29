//package org.example;
//
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.List;
//
//public class Prob5Prac {
//
//  public static void main(String[] args) {
//    int money = 50237;
//    List<Integer> answer = new ArrayList<Integer>();
//    int[] moneyList = {50000, 10000, 5000, 1000, 500, 100, 50, 10, 1};
//    int index = 0;
//    while (money > 0 && index < 9) {
//
//      int money_cnt = 0;
//      while ((money_cnt + 1) * moneyList[index] <= money) {
//        money_cnt++;
//      }
//      money -= (money_cnt) * moneyList[index];
//      answer.add(money_cnt);
//      index++;
//      System.out.println("!!!!");
//    }
//    while (answer.size() < 9) {
//      answer.add(0);
//    }
//  }
//}
