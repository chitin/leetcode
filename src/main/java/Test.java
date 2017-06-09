import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by denglingang on 2017/5/11.
 */
public class Test {
    public static void main(String[] args) {
        System.out.println(Math.pow(0 ,2));

        String a = "lettt fsfsff dleelte";
        System.out.println(a.split("\\s+")[0].toCharArray());

        Map map = new HashMap<>();
        map.put("11", "aa");
        map.put("22", "bb");

        System.out.println(map.toString());

        String topics = "aaa,bbb";

        System.out.println(Arrays.asList(topics.split(",")));

    }
}
