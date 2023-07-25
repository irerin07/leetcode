package org.example.leetcode;

import java.util.Arrays;

/**
 * @author
 * @description leet code1672
 * @since 2023.07.25
 **********************************************************************************************************************/
public class LeetCode1672 {
  public int maximumWealth(int[][] accounts) {
//    int answer = 0;
//    int temp = 0;
//
//    accounts= new int[][] {{2,8,7}, {7,1,3},{1,9,5}};
//
//    for (int[] account : accounts) {
//      for (int i : account) {
//        temp += i;
//      }
//      if (temp > answer) {
//        answer = temp;
//      }
//      temp = 0;
//    }

//    int answer = 0;
//    for(int i =0;i<accounts.length;i++){
//      int temp = 0;
//      for(int j = 0;j<accounts[i].length;j++){
//        temp+=accounts[i][j];
//      }
//      res = Math.max(res,temp);
//    }
//    return res;
//
//    int ans =0;
//    int maxsize = 0;

//    for(int i=0; i<accounts.length; i++){
//      int sum =0;
//      for(int j=0; j<accounts[i].length; j++)
//        sum += accounts[i][j];
//
//      if(ans < sum)
//        ans = sum;
//    }
//    return ans;
//
    return Arrays.stream(accounts)
      .mapToInt(customer -> Arrays.stream(customer).sum())
      .max()
      .getAsInt();
  }

}