package interview.december;

import java.util.Scanner;

/**
 * 编写函数 int string21nteger(String str)，完成将字符串串转换为整数的操作。例
 * 例如：string21nteger("123")：：123，string21nteger("-35")：35．
 * 注：请自己实现这个转换算法，而不不要尝试调用 Integer.parselnt(str)或者
 * Integer.valueOf(str)等函数调用，这不不是本试题的目的
 */
public class TodayP3 {

    private static int string2Integer(String s){
        int res = 0;
        char [] sArr = s.toCharArray(); // 转换为char数组
        int len = sArr.length;
        for (int i = 0; i < len ; i++) {
            // 将数组中的每个字符转换为int，再通过字符角标乘以位数相加
            res+=(((int)sArr[i]-'0')*Math.pow(10, len-1-i));
        }
        return res;
    }

    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.println("输入要转换的数字，结果会默认加1");
        int res = TodayP3.string2Integer(input.next());
        System.out.println(res+1);
    }
}
