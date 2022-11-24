package org.apache.commons.math3.primes;

import java.util.Scanner;

public class jsdhg {
    public static int main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入数据个数:");
        int n = sc.nextInt();
        int i;

        int[] arr = new int[n];
        System.out.println("输入数据:");
        for( i=0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }
        if (n<=0)
        {
            System.out.println("数据个数应该大于0:");
            return 0;
        }
        int[] arrs = MaoPao(arr);
        int  j=arrs.length;

        System.out.println("排列之后:");
        for(i = 0; i < j; ++i)
        {
            System.out.print(arrs[i]+" ");
        }

        return 0;
    }

    public static int[] MaoPao(int[] arr) {
        //外层循环
        for (int i = 0; i < arr.length - 1; i++) {
            //内层循环
            for (int j = 0; j < arr.length - 1 - i; j++) {
                //两两比较
                if (arr[j] > arr[j + 1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }

}
