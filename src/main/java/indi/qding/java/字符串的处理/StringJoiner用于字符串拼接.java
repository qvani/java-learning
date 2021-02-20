package indi.qding.java.字符串的处理;

import java.util.StringJoiner;

/**
 * @ClassName StringJoiner用于字符串拼接
 * @Description TODO
 * @Author Administrator
 * @Date 2021/2/15 14:32
 * @Version 1.0
 **/
public class StringJoiner用于字符串拼接 {
    public static void main(String[] args) {
        //用于sql拼接会非常的简单
        StringJoiner stringJoiner = new StringJoiner("','", "('", "')");
        stringJoiner.add("8615180450284");
        stringJoiner.add("8615180450284");
        stringJoiner.add("8615180450284");

        System.out.println(stringJoiner);
    }
}
