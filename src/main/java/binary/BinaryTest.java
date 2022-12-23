package binary;

/**
 * @author with struy.
 * Create by 2022/12/21 17:05
 * email :yq1724555319@gmail.com
 */

public class BinaryTest {

    /**
     * 使用除余法获得二进制字符串（仅演示，正整数，负数补码需要未处理）
     *
     * @param num
     * @return
     */
    static String numberToBinaryStr(int num) {
        StringBuilder sb = new StringBuilder();
        while (num != 0) {
            sb.append(Math.abs(num % 2));
            num = num / 2;
        }
        return sb.reverse().toString();
    }

    /**
     * 使用换基法获得二进制的十进制表示
     *
     * @param binaryStr
     * @return
     */
    static Integer binaryToNumber(String binaryStr) {
        int length = binaryStr.length();
        int i = 0;
        int res = 0;
        while (i < length) {
            int x = binaryStr.charAt(i) - '0';
            res += x * Math.pow(2, length - (i + 1));
            i++;
        }
        return res;
    }

    public static void main(String[] args) {
        String binaryStr = numberToBinaryStr(-19);
        System.out.printf("%s\n", binaryStr);
        System.out.printf("%s\n", binaryToNumber(binaryStr));
        System.out.printf("%s\n", Integer.toBinaryString(-19));
    }
}
