package solveexceptions;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main obj = new Main();
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt(),b=sc.nextInt();
        try {
            obj.check(a, b);
        }catch(Exception e) {
            System.out.println(e.getMessage());
        }finally {
            System.out.println("Default block");
        }
        System.out.println("End of program");
    }
    void check(int a,int b) throws Exception {
        if (b==0)
            throw new Exception("Divide by zero error");
        else
            System.out.println(a/b);
    }
}
