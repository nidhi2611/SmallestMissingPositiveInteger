package excecutionClass;

import java.util.Arrays;

public class ExcecutionClass {
    private int arr[];
    public ExcecutionClass(int a[]){
        arr=a;
    }

    public int[] getArr() {
        return arr;
    }

    public void setArr(int[] arr) {
        this.arr = arr;
    }
    public int findSmallestMissingPositiveInteger(int arr1[]){
        boolean k=isSorted(arr1);
        int found=0;
        if(k==true){
            for (int i = 0; i <arr1.length -1; i++) {
                if(arr1[i+1]-arr1[i]==2)
                {
                    found=arr1[i]+1;
                    break;

                }
            }
        }
        else if(k==false) {
            Arrays.sort(arr1);
            for (int i = 0; i < arr1.length; i++) {
                if (arr1[i + 1] - arr1[i] == 2) {
                    found = arr1[i]+1;
                    break;

                }
            }

        }
        return found;

    }
    public boolean isSorted(int array[]){
        int c=0;
        int b[]=new int[array.length];
        for (int i = 0; i < array.length; i++) {
            b[i]=array[i];
        }
        Arrays.sort(array);
        for (int i = 0; i < array.length; i++) {
            if(array[i]==b[i]){
                c++;
            }
        }
        if(c==array.length){
            return true;
        }
        else
            return false;
    }
}
