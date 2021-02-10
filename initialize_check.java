import java.io.*;
public class initialize_check
{
        public static void main(String[] args) {
           int[] x = {3,8,12,8,21,89,19,4};         
           int largest=0;
           int temp = 0;
           for (int i=0, j=x.length; i<x.length-1; i+=2, j-=2){
                if (x[i]>x[j]){
                    temp = x[i];
                }
                else {
                    temp = x[j];
                }
                if (temp>largest){
                    largest = temp;
                }
           }
           System.out.print("\nThis is the largest # is the array: "+largest);
        }
}
