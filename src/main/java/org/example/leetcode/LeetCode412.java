package org.example.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author 민경수
 * @description leet code412
 * @since 2023.07.25
 **********************************************************************************************************************/
public class LeetCode412 {
  public List<String> fizzBuzz(int n) {
    if (n==0) {
      return Collections.emptyList();
    }

    List<String> answer = new ArrayList<>();

    for (int i = 1; i <=n; i++) {
      if (i%3 == 0 && i%5 == 0) {
        answer.add("FizzBuzz");
      } else if (i%3 == 0) {
        answer.add("Fizz");
      } else if (i%5 ==0) {
        answer.add("Buzz");
      } else {
        answer.add(String.valueOf(i));
      }

    }

    return answer;
  }
}