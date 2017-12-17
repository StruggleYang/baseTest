package interview.december;

import java.util.Scanner;

/**
 * 判断某年年度 Y是否为闰年年的方法是
 * 如果 Y是4的倍数，且不不是100的倍数，则是闰年年。
 * 如果 Y是100的倍数，则只有当 Y是400的倍数时，才是闰年年
 * 其它条件下都是平年年。
 */
public class TodayP1 {


    public static boolean isLeapYear(int Y){

        if (Y%4 == 0 && Y%100 !=0 || Y%400 == 0){
            System.out.println(Y+"年:是闰年");
            return true;
        } else {
            System.out.println(Y+"年:是平年");
            return false;
        }
    }

    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.println("请输入年份:");
        TodayP1.isLeapYear(input.nextInt());
    }

}
