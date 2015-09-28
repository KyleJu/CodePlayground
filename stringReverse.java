import java.awt.*;
import java.util.*;

/**
 * Created by kyleju on 15-09-13.
 */
public class play {
    public static void main(String[] args) {
        String s=  "abcdef";
        char[] arrayu = s.toCharArray();
        String re ="";
        // i-- and i>=0!!!!!
        for (int i = arrayu.length -1; i >=0; i--) {
            re = re + arrayu[i];
        }
        System.out.println(re);
    }
}

