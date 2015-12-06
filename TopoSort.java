import java.util.*;

public class a{
 
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		final int[] inFlow = new int[n+1];
		List<Integer>[] adjs = new ArrayList[n+1]; // check if node starting from 0 or 1
		inFlow[0] = Integer.MAX_VALUE;
		Arrays.fill(adjs, new ArrayList<Integer>());
		int edge = scan.nextInt();

		for (int i =0; i < edge; i ++) {
			int left = scan.nextInt();
			int r = scan.nextInt();
			adjs[left].add(r);
			inFlow[r]++;
		}


		PriorityQueue<Integer> que = new PriorityQueue<Integer>((n+1),new Comparator<Integer>(){
			@Override
			public int compare(Integer o1, Integer o2) {
				return inFlow[o1] - inFlow[o2];
			}
		});

		for (int i = 1; i <= n; i++) {
			que.offer(i);
		}
		List<Integer> res = new ArrayList<Integer>();
		while(que.peek() !=null) {
			int k = que.peek();
			res.add(k);
			for (int ad : adjs[k]) {
				inFlow[ad]--;
			}
			que.poll();
		}

		System.out.println(res);
	}
}