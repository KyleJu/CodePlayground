import java.awt.*;
import java.util.*;

/**
 * Created by kyleju on 15-09-13.
 */
public class play {
    public static void main(String[] args) {
        String s = "....398rhoiushf*.....23hdfa.....";
        char [] arrry = s.toCharArray();
        int firstLetter = s.length();
        int lastLetter = -1;
        boolean isPreviousDot = false;
        String result = "";

        for (int i = 0; i < arrry.length; i ++) {
            if (arrry[i] != '.') {
                firstLetter = (i<firstLetter)? i:firstLetter;
                lastLetter = i;
                isPreviousDot = false;
                if (arrry[i] == '*') {
                    arrry[i] = ' ';
                }

            } else {
                if (firstLetter != s.length() && lastLetter !=-1) {
                    //somewhere in bewteen
                    if(!isPreviousDot) {
                        isPreviousDot = true;
                    } else {
                        arrry[i] = ' ';
                    }
                }
            }
        }
        for (int i  = firstLetter; i <= lastLetter; i++) {
            if (arrry[i] != ' ') {
                result = result + arrry[i];
            }
        }
        System.out.println(result);
    }
}

