import java.util.Scanner;

//sort!!
public class play {
    public static int[] backArray;
    public static int[] deno;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int c = scan.nextInt();
        deno = new int[] {1,2,3,10};
        backArray = new int[c + 1];
        for (int i =0; i < backArray.length; i++) {
            backArray[i] = -1;
        }
        System.out.println(findMIn(c));

    }

    public static int findMIn(int change) {
        if (backArray[change] != -1) {
            return backArray[change];
        }
        if (change == 0) return 0;
        int v = Integer.MAX_VALUE;
        for (int i : deno) {
            if(change >= i) {
                v = Math.min(1 + findMIn(change - i),v);
            }
        }
        backArray[change] = v;
        return v;
    }

}
