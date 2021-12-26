/**
 * Author :tianhongyu
 * Date : 2018/4/29 19:40
 */
package com.tian.control_system.pojo.vo;


import com.tian.control_system.pojo.Department;

import java.util.HashSet;
import java.util.Set;

public class DepartmentVo extends Department {

    //状态名
    private String statusName;

    public String getStatusName() {
        return statusName;
    }

    public void setStatusName(String statusName) {
        this.statusName = statusName;
    }

    public static int minAreas(int arr[][]){
        Set<Integer> pointSet = new HashSet();
        for(int []point : arr){
            pointSet.add(4001 * point[0] + point[1]);
        }
        int res = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(arr[i][0] != arr[j][0] && arr[i][1] != arr[j][1]){
                    if((pointSet.contains(40001*arr[i][0] + arr[j][1]) && pointSet.contains(40001*arr[j][0] + arr[i][1]))){
                        res = Math.min(res,Math.abs(arr[j][0]-arr[i][0])*Math.abs(arr[j][1]-arr[i][1]));
                    }
                }
            }
        }
        return res<Integer.MIN_VALUE ? res : 0;
    }


    public static int minArea(int[][] arr) {
        // 知道矩形对角线，就可以看另外两个点是否存在
        Set<Integer> pointSet = new HashSet();
        for(int[] arrs:arr){
            pointSet.add(40001*arrs[0]+arrs[1]);
        }
        int ans = Integer.MAX_VALUE;
        for(int i = 0; i< arr.length;i++){
            for(int j = 0;j< arr.length;j++){
                // 寻找可能的对角线上的点
                if(arr[i][0]!=arr[j][0] && arr[i][1]!=arr[j][1]){
                    // 判断是否包含满足条件的另外两个坐标点
                    if(pointSet.contains(40001*arr[i][0]+arr[j][1]) && pointSet.contains(40001*arr[j][0]+arr[i][1])){
                        ans = Math.min(ans,Math.abs(arr[j][0]-arr[i][0])*Math.abs(arr[j][1]-arr[i][1]));
                    }
                }
            }
        }
        return ans<Integer.MAX_VALUE?ans:0;
    }

    public static void main(String[] args) {
        int arr[][] = {{56,63},{55,58},{56,58},{55,63}};
        int res = minArea(arr);
        System.out.println(res);

    }
}
