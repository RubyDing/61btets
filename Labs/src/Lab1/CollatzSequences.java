package Lab1;

import java.util.Scanner;

/**
 * @author @ding
 * @since 2024-04-18 星期四 16:22:02
 * The Collatz sequence is defined as follows:
 *If n is even, the next number is n/2. If n is odd, the next number is 3n + 1. If n is 1, the sequence is over.
 */

public class CollatzSequences {
    /**
     * 判断传入参数 n 的奇偶性,奇数则返回 3n + 1 , 偶数 则返回  n/2
     * @param n
     * @return nextNumber
     */
    public static int nextNumber(int n){
        if(n%2 == 0)
            return n/2;
        else
            return 3*n+1;
    }
    public static void main(String[] args) {
        //用户输入一个整数
        Scanner sc = new Scanner(System.in);
        //提示输入整数
        System.out.println(" 请输入 一个整数 :  ");
        int input = sc.nextInt();
        //获取input下一个数字
        int nextNumber = nextNumber(input);
        System.out.print(input+"    ");
        //循环输出数字 ,  如果nextNumber等于 1 则停止循环
        int i = 0 ;
        while(nextNumber != 1){
            System.out.print(nextNumber + "    ");
            nextNumber = nextNumber(nextNumber);
            i++;
        }
        if(nextNumber == 1) System.out.print(nextNumber +"\r\n");
    }
}
