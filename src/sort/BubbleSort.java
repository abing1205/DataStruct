package sort;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class BubbleSort {


    public static void main(String[] args) {
        int[] arr= {9,3,7,5,5,7,9,4,5,8}; //3759  3579 3579
        Date date1 = new Date();
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(format.format(date1));
        int[] arrs = new int[80000];
        for(int i=0;i < 80000;i++){
            arrs[i] = (int)(Math.random() * 800000);
        }
        bubbleSort(arr);
        //bubbleSort(arrs);
        Date date2 = new Date();
        System.out.println(format.format(date2));
    }

    /**
     * 冒泡排序 时间复杂度  n * n
     * 一共循环 arr.length - 1次 外循环
     * 内循环每次循环 arr.length -i 次，每次将最大的
     * 数字放在最右边，依此类推
     * @param arr
     */
    public static void bubbleSort(int[] arr){
        for(int i=1;i<arr.length;i++){
            for(int j=0;j< arr.length - i;j++){
                int temp = 0;
                if(arr[j] > arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
                System.out.println(Arrays.toString(arr));
            }
        }
    }
}
