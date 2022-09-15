package sort;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class SelectSort {
    public static void main(String[] args) {
        int[] hh = {3,4,5,2};
        selectSortByOne(hh);

        Date date1 = new Date();
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(format.format(date1));
        int[] arrs = new int[80000];
        for(int i=0;i < 80000;i++){
            arrs[i] = (int)(Math.random() * 800000);
        }
        selectSort(arrs);
        Date date2 = new Date();
        System.out.println(format.format(date2));
    }

    /**
     * 选择排序
     * 以数组为例，以首次为例将索引为0的数字假定为最小值，跟后面的数字以此进行比较
     * 将最小的数字与当前位置的数字进行交换，以此类推
     * @param arr 需要排序的数组
     */
    public static void selectSort(int[] arr){
        for(int i=0;i<arr.length;i++){
            int min = arr[i];
            int minIndex = i;
            for(int j=i+1;j<arr.length;j++){
                if (min > arr[j]) {
                    min = arr[j];
                    minIndex = j;
                }
            }
            arr[minIndex] = arr[i];
            arr[i] = min;
        }

    }


    public static void selectSortByOne(int[] arr){
        //
        for(int i=0;i<arr.length;i++){
            int min = arr[i];
            int minIndex = i;
            for(int j=i+1;j<arr.length;j++){
                if (min > arr[j]) {
                    min = arr[j];
                    minIndex = j;
                }
            }
            arr[minIndex] = arr[i];
            arr[i] = min;
            System.out.println(Arrays.toString(arr));
        }
    }
}
