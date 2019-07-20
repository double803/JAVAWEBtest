package com.test.recursion;

/**
 * @author 宁超
 * @date 2019/5/6 - 21:59
 */
public class Recursion {
    public static void main(String[] args) {
        System.out.println(getNumber(50));
        System.out.println(triangle(50));
    }

    public static void test()
    {
        System.out.println("Hello,worle!");
    }

    public static void test2(int num)
    {
        System.out.println(num);
        if (num == 0)
        {
            return;
        }
        test2(num -1 );
    }

    public static int getNumber(int n)
    {
        int total = 0;
        while (n > 0)
        {
            total = total + n;
            n--;
        }
        return total;
    }

    //二、三角数字：该数列中的第n向是由第n-1项加n得到的
    public static int triangle(int n)
    {
        if (n == 1)
        {
            return 1;
        }else {
            return n + triangle(n- 1);
        }
    }

    //三、Fibonacci数列：该数列的第1项为0，第二项为1，第n项为第n-1项加上n-2项得到
    public static int getNumberFibonacci(int n)
    {
        if(n == 1)
        {
            return 0;
        }else if(n == 2)
        {
            return 1;
        }else{
            return getNumberFibonacci(n - 1) + getNumberFibonacci(n -2);
        }
    }
}
