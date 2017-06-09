package dynamicprogram;

import java.util.HashMap;

/**
 * Created by denglingang on 2017/6/8.
 */
public class StepsProblem {
    public static void main(String[] args) {
        System.out.println(method1(10));
        System.out.println(method2(10, new HashMap<>()));
        System.out.println(method3(10));
    }

    public static int method1(int n) {
        if(n < 0) {
            return 0;
        }
        if(n == 1) {
            return 1;
        }
        if(n == 2) {
            return 2;
        }
        return method1(n-1) + method1(n-2);
    }

    public static int method2(int n, HashMap<Integer, Integer> map) {
        if(n < 0) {
            return 0;
        }
        if(n == 1) {
            return 1;
        }
        if(n == 2) {
            return 2;
        }
        if(map.containsKey(n)) {
            return map.get(n);
        } else {
            int result = method2(n-1, map) + method2(n-2, map);
            map.put(n, result);
            return result;
        }
    }

    public static int method3(int n) {
        int a = 1;
        int b = 2;
        int temp = 0;
        for(int i=3; i <= n; i++) {
            temp = a + b;
            a = b;
            b = temp;
        }
        return temp;
    }
}
