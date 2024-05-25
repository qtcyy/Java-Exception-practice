package exceptions;

import java.util.*;

public class Main1 {
    public static void main(String[] args){
        Main1 m=new Main1();
        Scanner read=new Scanner(System.in);
        try {
            int a=read.nextInt(),b=read.nextInt();
            m.check(a, b);
        }catch (Myexception e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("程序结束");
        }
    }

    void check(int a,int b) throws Myexception{
        if (b==0)
            throw new Myexception("分母为0");
        System.out.println(a/b);
    }
}
