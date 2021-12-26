package com.tian.control_system;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Package: com.tian.control_system
 * Description： TODO
 * Author: 智龙
 * Date: Created in 2021/10/13 8:36
 * Company: China
 * Copyright: Copyright (c) 2021
 * Modified By: SmartDragon
 */
public class Solve {
    public ListNode merge(ListNode list1,ListNode list2){
        if(list1 == null){
            return list2;
        }
        if(list2 == null){
            return list1;
        }
        if(list1.val < list2.val){
            list1.next = merge(list1.next,list2);
            return list1;
        }else{
            list2.next = merge(list2.next,list1);
            return list2;
        }
    }

    public ListNode merge1(ListNode list1,ListNode list2){
        ListNode head = new ListNode(0);
        ListNode cur = head;
        while (list1 != null && list2 != null){
            if(list1.val < list2.val){
                cur.next = list1;
                list1 = list1.next;
            }else {
                cur.next = list2;
                list2 = list2.next;
            }
            cur = cur.next;
        }
        cur.next = (list1 != null) ? list1 : list2;
        return head.next;
    }


    public static int controlWood(int[] nums, int k) {
        // 找到最大长度的木头
        int maxLength = 0;
        for (int i = 0; i < nums.length; i++) {
            maxLength = Math.max(maxLength, nums[i]);
        }
        int result = 0;
        int curLength = 1;
        while (curLength <= maxLength) {
            int cnt = 0;
            // 以 curLen 截取木头, 查找能截取的最多段
            for (int i = 0; i < nums.length; i++) {
                cnt += nums[i] / curLength;
            }
            // 如果能截出 k段以上, 则更新结果
            if (cnt >= k) {
                result = Math.max(result, curLength);
            }
            curLength++;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //String str = scanner.nextLine();
        String str = "dd2332/./.  ";
        char[] chars = str.toCharArray();
        int s = 0;//字母
        int num = 0;//数子
        int space = 0;//空格
        int other = 0;//其他
        for (int i = 0; i < chars.length; i++) {
            if((chars[i] >= 'A') && (chars[i]) <= 'Z'){
                s++;
            }else if((chars[i] >= 'a') && (chars[i]) <= 'z'){
                s++;
            }else if((chars[i] >= '0') && (chars[i]) <= '9'){
                num++;
            }else if(chars[i] == ' '){
                space++;
            }else {
                other++;
            }
        }
        System.out.println("字母为"+s+"个");
        System.out.println("数子为"+num+"个");
        System.out.println("空格为"+space+"个");
        System.out.println("其他为"+other+"个");


        int[] nums = {5,9,2};
        System.out.println(controlWood(nums, 4));
    }
}
class ListNode{
    int val;
    ListNode next;
    ListNode(int x){
        val = x;
    }
}

class Singleton{
    //单例模式，构造器私有
    private Singleton(){};
    private static Singleton instance = new Singleton();
    public static Singleton getInstance(){
        return instance;
    }
}



