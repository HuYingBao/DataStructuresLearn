package com.huyingbao.myapplication.Chapter1;

/**
 * 递归简论
 * Created by liujunfeng on 2018/10/15.
 */
public class Recursive {
    public static void main(String[] args) {
//        System.out.println(f(10));
//        System.out.println(bad(10));
        printOut(131234);
    }

    /**
     * 递归基本法则1:基准情形(base case)
     * 必须总有没写基准的情形,它们不用递归就能求解.
     *
     * @param x 递归方法
     */
    public static int f(int x) {
        if (x == 0)
            return 0;
        else
            return 2 * f(x - 1) + x * x;
    }

    /**
     * 递归基本法则2:不断推进(making progress)
     * 对于某些要递归求解的情形,递归调用必须总能够朝着一个基准情形推进.
     *
     * @param n 无终止递归方法
     */
    public static int bad(int n) {
        if (n == 0)
            return 0;
        else
            return bad(n / 3 + 1) + n - 1;
    }

    /**
     * 递归基本法则3:设计法则(design rule)
     * 假设所有的递归调用都能运行.
     *
     * @param n 打印非负数
     */
    public static void printOut(int n) {
        if (n >= 10)
            printOut(n / 10);
        System.out.println(n % 10);
    }
}
