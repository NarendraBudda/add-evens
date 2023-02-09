package com.jap.addevens;

public class AddEven
{

    public long addEvens(int n)    {
        if(n==0||n<0){
            return 0;
        }

        if (n%2==0){
            return  n+addEvens(n-1);

        }
        return  addEvens(n-1);
    }
        public static void main(String[] args) {
            AddEven addEven = new AddEven();
            long add=addEven.addEvens(4);
           System.out.println(add);
        }


}
