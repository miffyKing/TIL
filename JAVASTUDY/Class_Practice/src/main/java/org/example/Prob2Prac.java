package org.example;

import java.util.Stack;

public class Prob2Prac {

  public static void main(String[] args) {
    String input = "browoanoommnaon";
    String answer = "answer";

    Stack<Character> stack = new Stack<>();
    for (int i = 0; i < input.length(); i++) {
      if (stack.empty() == true) {
        stack.push(input.charAt(i));
        continue;
      }
      if (stack.peek() == input.charAt(i)) {
        stack.pop();
      } else if (stack.peek() != input.charAt(i)) {
        stack.push(input.charAt(i));
      }
    }
    StringBuilder sb = new StringBuilder();
    int size = stack.size();
    for (int i = 0; i < size; i++) {
      char chunk = stack.pop();
      sb.append(chunk);
    }
    sb.reverse();
    answer = sb.toString();

    //System.out.println(answer);
  }
}
