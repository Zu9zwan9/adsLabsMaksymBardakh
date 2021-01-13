package com.company;

public class Main {

    public static void main(String[] args) throws Exception {
        int n = 2;
        int m = 3;
       System.out.println(A(m,n));
    }
    public static  int A(int m, int n) throws Exception
    {
        if (m==0){
                return n+1;
        } else if (m>0 && n==0) {
            return A(m-1,1);

        } else  if(m>0 &&n>0) {
            return  A(m-1, A(m,n-1));
        } else {
            throw new Exception("illegal argument");
        }
    }
}
