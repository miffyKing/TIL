//package org.example;
//
//public class Prob4Prac {
//
//  public static void main(String[] args) {
//    String word = "I Love yoU";
//    StringBuilder sb = new StringBuilder();
//    char chunk;
//    for (int i = 0; i < word.length(); i++) {
//      if (word.charAt(i) >= 'a' && word.charAt(i) <= 'z') {
//        chunk = lowercaseChange(word.charAt(i));
//        sb.append(chunk);
//        continue;
//      } else if (word.charAt(i) >= 'A' && word.charAt(i) <= 'Z') {
//        chunk = uppercaseChange(word.charAt(i));
//        sb.append(chunk);
//        continue;
//      }
//      sb.append(word.charAt(i));
//    }
//    System.out.println(sb.toString());
//  }
//
//  public static char lowercaseChange(char chunk) {
//    int lowerSum = 'a' + 'z';
//    return (char) (lowerSum - chunk);
//  }
//
//  public static char uppercaseChange(char chunk) {
//    int upperSum = 'A' + 'Z';
//    return (char) (upperSum - chunk);
//  }
//}
