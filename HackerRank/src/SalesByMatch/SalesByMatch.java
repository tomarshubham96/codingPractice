package SalesByMatch;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class SalesByMatch {


    static int sockMerchant(int n, int[] ar) {
        int pair=0;
        int totalpair=0;
        for(int i=0; i<n;i++){
            int count=1;
            if(ar[i]!=0){
                for(int j=i+1;j<n;j++){
                    if(ar[i]==ar[j]){
                        count=count+1;
                        ar[j]=0;
                    }
                }
                if(count%2==0){
                    pair=count/2;
                }
                else{
                    pair=(count-1)/2;
                }
                totalpair=totalpair+pair;
            }
        }
        return totalpair;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int n = scanner.nextInt();

        int[] ar = new int[n];

        for (int i = 0; i < n; i++){
             ar[i] = scanner.nextInt();
        }

        int result = sockMerchant(n, ar);

        System.out.println(String.valueOf(result));
        scanner.close();
    }
}
