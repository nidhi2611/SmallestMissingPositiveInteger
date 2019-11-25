package mainClass;

import excecutionClass.ExcecutionClass;

import java.util.Scanner;

public class MainClass {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for (int i = 0; i <n ; i++) {
            arr[i] = sc.nextInt();
        }
            ExcecutionClass ec=new ExcecutionClass(arr);
            int value=ec.findSmallestMissingPositiveInteger(arr);
            if(value==0)
            System.out.print("No missing number found"+arr.length);
            else
                System.out.println("missing number found"+ec.findSmallestMissingPositiveInteger(arr));


    }
}
