package seokwoo.backjon2.dfs;

import java.io.*;

// https://www.acmicpc.net/problem/1987
// 알파벳

public class DFS03 {

	private static char[][] matrix;
	private static boolean[][] isVisit;
	private static int n;
	private static int m;
	private static int result;
	private static int[] dx = {1,-1,0,0};
	private static int[] dy = {0,0,1,-1};
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] temp = br.readLine().split(" ");
		
		n = Integer.parseInt(temp[0]);
		m = Integer.parseInt(temp[1]);

		matrix = new char[n][m];
		isVisit = new boolean[n][m];
		
		result = Integer.MIN_VALUE;
		
		for(int i = 0; i<n; i++) {
			matrix[i] = br.readLine().toCharArray();
		}
		
		boolean[] alph = new boolean[26];
		alph[matrix[0][0] - 65] = true;
		dfs(0,0,1,alph);
		
		System.out.println(result);
	}
	
	private static void dfs(int x, int y, int count, boolean[] alph) {
		result = Math.max(result,count);
		
		int nx = 0;
		int ny = 0;
		for(int i = 0; i<dx.length; i++) {
			nx = x + dx[i];
			ny = y + dy[i];
			
			if(isOut(nx, ny) || isVisit[nx][ny]) {
				continue;
			}
			
			if(!alph[matrix[nx][ny] - 65]) {
				isVisit[nx][ny] = true;
				alph[matrix[nx][ny] - 65] = true;
				dfs(nx, ny, count+1, alph);
				alph[matrix[nx][ny] - 65] = false;
				isVisit[nx][ny] = false;
			}
		}
	}
	
	private static boolean isOut(int x, int y) {
		if(0<=x && x<n & 0<=y && y <m) {
			return false;
		}
		return true;
	}

}
