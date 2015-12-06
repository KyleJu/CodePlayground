

public static int[] memo = new memo[n + 1];
public static Map<TreeNode, Integer> map;
public static int counter = -1;

public static boolean isBalanced(TreeNode root) {
	if (root == null) return true;
	Arrays.fill(memo, -1);
	map = new HashMap<TreeNode, Integer>();
	getHeight(root);
	return checkB(root);
}

public static boolean checkB(TreeNode root) {
		if (root == null) return true;
		if (Math.abs(memo[map.get(root.left)] - memo[map.get(root.right)])) >1) return false;
		return checkB(root.left) && checkB(root.right);
}

public static int getHeight(root) {
	if (root == null) return 0;
	if (memo[map.get(root)] != -1) return memo[map.get(root)];
	counter++;
	map.put(root,counter);
	memo[counter] = 1+Math.max(getHeight(root.left), getHeight(root.right));
	return memo[counter];
}