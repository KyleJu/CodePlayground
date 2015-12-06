public class g {

	public static List<Integer>[] adjs;
	public static boolean[] seen;
	public static int[] depth;
	public static trees;
 	public static void main(String[] args){
			Scanner scan = new Scanner(System.in);
			int test = scan.nextInt();
			while(test-->0) {
				int v = scan.nextInt();
				int e = scan.nextInt();
				list = new ArrayList[v+1];
				seen = new int[v +1];
				depth = new int[v+1];
				trees = 1;
				for (int i = 0; i <e; i ++) {
					Arrays.fill(adjs[i], new ArrayList<Integer>());
				}

				for (int i =0; i <e; i++) {
					int l = scan.nextInt();
					int r = scan.nextInt();
					adjs[l].add(r);
					adjs[r].add(l);
				}
				dfs(1);
				System.out.println(trees);
			}
	}

	public static dfs(int n) {
		seen[n] = true;
		for (int i: adjs[n]) {
			if (depth[n] - depth[i] <=1 && seen[i]) continue;
			if (seen[i]){
				trees *= depth[n] - depth[i] + 1;
				trees %= 1007;
			} else {
				depth[i] = depth[n] +1;
				dfs(i);
			}
		}
	}
}