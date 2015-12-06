import java.util.*;

public class a{
	public static Set<Node> seen;
	public static void main(String[] args) {
		seen = new HashSet<Node>();
		Node left = new Node ( new ArrayList<Node>(), "L");
		List<Node> l = new ArrayList<Node>();
		l.add(left);
		Node root = new Node ( l, "Y");
		System.out.println(bfs(root));
	}

	static class Node {
		public String color;
		public List<Node> adjs;
		public Node(List<Node> a, String c1) {
			color = c1;
			adjs = a;
		}
	}

	public static boolean bfs(Node root) {
		Queue<Node> q = new ArrayDeque<Node>();
		Set<String> cs = new HashSet<String>();
		q.offer(root);
		cs.add(root.color);
		seen.add(root);
		while (q.peek() != null) {
			Node te = q.poll();
			for (Node n: te.adjs) {
				if (!seen.contains(n)) {
					seen.add(n);
					cs.add(n.color);
					if (te.color.equals(n.color)) return false;
					if (cs.size() >2) return false;
					q.offer(n);

				} else{
					if (te.color.equals(n.color)) return false;
				}
			}

			// check visited
			//check number of color
			// check different color
		}
		return true;
	}
}