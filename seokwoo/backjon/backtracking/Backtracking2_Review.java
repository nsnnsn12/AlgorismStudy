package seokwoo.backjon.backtracking;

import java.io.*;
import java.util.*;

public class Backtracking2_Review {
	private static boolean[] isVisit;
	private static int n;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] temp  = br.readLine().split(" ");
		
		n = Integer.parseInt(temp[0]);
		int m = Integer.parseInt(temp[1]);
		isVisit = new boolean[n+1];
		
		dfs(0,1,new int[m]);

	}
	
	private static void dfs(int depth, int start, int[] array) {
		if(depth == array.length) {
			for(int answer: array) {
				System.out.print(answer + " ");
			}
			System.out.println();
			return;
		}
		
		for(int i = start; i<=n; i++) {
			if(!isVisit[i]) {
				isVisit[i] = true;
				array[depth] = i;
				dfs(depth+1, i+1, array);
				isVisit[i] = false;
			}
		}
	}

}
