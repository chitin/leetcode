package leetcode535;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * Created by denglingang on 2017/5/11.
 */
public class Codec {

    private Map<String, String> shortToLong = new HashMap<String, String>();
    private Map<String, String> longToShort = new HashMap<String, String>();

    private String charactors = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";

    Random random = new Random();
    private String baseURL = "http://tinyurl.com/";

    public String encode(String longUrl) {
        if(longToShort.containsKey(longUrl)) {
            return baseURL + longToShort.get(longUrl);
        }
        StringBuffer hash = new StringBuffer();
        do {
            for(int i=0; i < 6; i++) {
                hash.append(charactors.charAt(random.nextInt(charactors.length())));
            }

        } while(shortToLong.containsKey(hash.toString()));

        shortToLong.put(hash.toString(), longUrl);
        longToShort.put(longUrl, hash.toString());


        return baseURL + hash.toString();
    }
    public String decode(String shortUrl) {
        String hash = shortUrl.substring(baseURL.length());
        return shortToLong.get(hash);
    }

    public static void main(String[] args) {
        Codec codec = new Codec();
        String longUrl = "https://leetcode.com/problems/design-tinyurl";
        String tinyUrl = codec.encode(longUrl);
        System.out.println("tiny url: " + tinyUrl);
        String originUrl = codec.decode(tinyUrl);
        System.out.println("origin url: " + originUrl);
    }
}