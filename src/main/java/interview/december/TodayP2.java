package interview.december;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 编写函数 intbits(int i)，返回 i的二进制位中有多少个1。比如： bits(0)：0·
 *（请勿使用用 Integer.toBinarystring等外部方
 * 法）。
 */
public class TodayP2 {

    public static int intbits(int i){
        StringBuffer biStr = new StringBuffer();
        List<Integer> oneList = new ArrayList();
        boolean flag = true;
        int temp = i;
        while (flag){
            if (i!=0){
                i =  i/2;
                int y = i%2;
                biStr.append(y);
                if (y==1){ oneList.add(y); }
            }else {
                System.out.println(i+"的二进制是:"+biStr);
                System.out.println(temp+"的二进制有:"+oneList.size()+"个1");
                flag = false;
            }
        }

        return oneList.size();
    }

    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.println("请输入数字:");
        TodayP2.intbits(input.nextInt());
    }
}
