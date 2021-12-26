package com.tian.springboot_mysely.common;

import net.sf.jsqlparser.expression.StringValue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

/**
 * Package: com.tian.springboot_mysely.common
 * Description： TODO
 * Author: 智龙
 * Date: Created in 2021/9/14 12:22
 * Company: China
 * Copyright: Copyright (c) 2021
 * Modified By: SmartDragon
 */
public class Solve {
    public static void main(String[] args) {
          int arr[] = {5,7,6,2,5};
        System.out.println(solution(arr));
    }
    //一个正整数的数组 arr，数组满足0 <= arr[i] <= 9，
    // 挑出任意个数组成一个最大的数，并且能被3整除，并以字符串形式返回。
    //不存在时请输出空字符串。
    public static String solution(int[] d) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < d.length; i++) {
            //int s = d[i] + d[i+1];
            if(d[i] % 3 == 0){
                list.add(d[i]);
            }
        }
        if(list.size() >= 2){
            Arrays.sort(list.toArray());
            int str[] = new int[10];
            str[0] =  list.get(0);
            str[1] =  list.get(1);
            String res = String.valueOf(str[0]) + String.valueOf(str[1]);
            return res;
        }
        if(list.size() == 1){
            String s = String.valueOf(list.get(0));
            return s;
        }
        String s = "";
        return s;
    }


    public int solution1(int[] arr) {
         if(arr == null || arr.length == 0){
             return 0;
         }
         int max = arr[0];
         int min = arr[0];
         int endmax = arr[0];
         int endmin = arr[0];
         int res = arr[0];
        for (int i = 1; i < arr.length; i++) {
            endmax = max * arr[i];
            endmin = min * arr[i];
            max = Math.max(Math.max(endmax,endmin),arr[i]);
            min = Math.min(Math.min(endmax,endmin),arr[i]);
            res = Math.max(res,max);
        }
        return max;
    }

    public int solution2(int[] arr){
        int min = arr[0];
        int max = arr[0];
        int res = arr[0];
        for (int i = 1; i < arr.length; i++) {
            int t = Math.max(arr[i],Math.max(max*arr[i],max*arr[i]));
            min = Math.min(arr[i],Math.min(max*arr[i],min*arr[i]));
            max = t;
            res = Math.max(res,max);
        }
        return res;
    }

    public int solution3(int[] arr){
        int min = arr[0];
        int max = arr[0];
        int res = arr[0];
        for (int i = 1; i < arr.length; i++) {
            int mintemp = Math.min(max * arr[i],Math.min(min*arr[i],arr[i]));
            int maxtemp = Math.max(max * arr[i],Math.max(min*arr[i],arr[i]));
            min = mintemp;
            max = maxtemp;
            res = Math.max(res,max);
        }
        return res;
    }

    //统计回文字串的数目
    public int solution(String str) {
        if(str == null || str.length() ==0){
            return 0;
        }
        char[] s = str.toCharArray();
        int [][]arr = new int[s.length][s.length];
        int count = 0;
        for (int i = 0; i < s.length; i++) {
            arr[i][i] = 1;
            count = count + 1;
        }
        for (int i = 2; i <= s.length; i++) {
            int j = 0;
            int k = j + i - 1;
            while (k < s.length){
                if(s[j] == s[k]){
                    if(j+1 <= k-1){
                        arr[j][k] = arr[j+1][k-1];
                        count = count + arr[j+1][k-1];
                    }else {
                        arr[j][k] = 1;
                        count = count + 1;
                    }
                }
                i++;k++;
            }
        }
        return count;

    }



    public static int solution4(int arr[]){
        int flag = 1;
        double sum = 0;
        for (int i = 1; i < arr.length; i++) {
            sum = sum + 1.0 / i * flag;
            flag = -flag;
        }
        return (int)sum;
    }
}
