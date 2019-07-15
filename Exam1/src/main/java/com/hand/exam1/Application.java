package com.hand.exam1;

import sun.security.pkcs11.wrapper.Functions;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * 〈功能简述〉
 * 〈〉
 *
 * @author 王灏
 * @Date 2019/7/15 13:46
 * @Version 1.0.0
 */
public class Application {
    public static void main(String[] args) {
        IntStream ints = new Random().ints(50, 1, 100);
        List<Integer> integers = ints.boxed().collect(Collectors.toList());


    }
}
