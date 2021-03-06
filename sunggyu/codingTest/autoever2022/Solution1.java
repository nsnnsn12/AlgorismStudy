package sunggyu.codingTest.autoever2022;
import java.io.*;
import java.util.*;
//공정한 팀 분배하기
/*
    공정한 팀 분배하기
    제한시간 : 2초 | 메모리 제한 : 1024MB

    현대자동차 그룹에 N명의 신입 사원이 들어왔다. 
    인사팀에서는 이 신입들의 회사 적응을 돕기 위해 간단한 프로젝트를 맡기려고 하는데, 신입사원들을 팀 단위로 나눠 진행하려고 한다. 
    이에 앞서 각 신입 사원의 업무 능력, 협동 능력을 측정했고, 
    각 신입 사원에게 1에서 N사이의 번호를 붙이면 i번 사원의 업무 능력은 pi, 
    i번 사원과 j번 사원이 한 팀에 있어서 생기는 협동 능력은 ci, j 이다.

    각 팀의 능력은 팀에 속한 사원의 업무 능력과 팀에 속한 모든 두 사원에 대한 협동 능력의 총합이다. 
    예를 들어, 1, 3, 6번 사원이 한 팀이 되었다면, 이 팀의 능력은 p1 + p3 + p6 + c1, 3 + c1, 6 + c3, 6 이다.

    인사팀에서는 정확히 3개의 팀을 만들 것인데, 형평성을 위해 가장 능력이 낮은 팀의 능력이 최대한 높아지도록 팀을 나누려고 한다.

    입력형식
    첫 번째 줄에 신입 사원의 수를 나타내는 자연수 N이 주어진다.
    두 번째 줄에 각 신입 사원의 업무 능력을 나타내는 N개의 정수 p1, p2, ... , pN 이 주어진다.
    다음 N-1개의 줄의 i번째 줄에는 신입 사원 간의 협동 등력을 나타내는 N-i개의 정수 ci, i+1, ci, i+2, ... , ci, N 이 주어진다.

    입력은 다음 조건을 만족한다.
    3 ≤ N ≤ 12
    1 ≤ pi ≤ 10
    -106 ≤ ci, j ≤ 106
    
    출력형식
    가장 능력이 낮은 팀의 능력이 최대한 높아지도록 3개의 팀으로 분배하는 경우를 찾아, 가장 능력이 낮은 팀의 능력치 합을 출력한다.

    입력예제1
    5
    53275
    0000
    000
    00
    0


    출력예제1
    7


    예제1 부연설명
    1번 사원(능력치 5)과 2번 사원(능력치 3)이 A팀이 되고, 
    3번 사원(능력치 2)과 5번 사원(능력치 5)이 B팀이 되고, 
    마지막 4번 사원(능력치 7)이 혼자 팀이 된다. 
    그러면 각 팀의 능력치는 8, 7, 7이 되고, 가장 능력이 낮은 팀의 능력치 합은 7이 된다.

    입력예제2복사하기
    4
    5499
    -10000
    00
    0


    출력예제2
    5


    예제2 부연설명
    1번 사원(능력치 5)과 2번 사원(능력치 4)가 한팀을 이루고, 
    3번 사원과 4번 사원이 각각 팀을 이루면 각 팀의 능력치가 9가 되어 가장 이상적인 팀배분이 될 수 있다. 
    그러나 1번 사원과 2번 사원의 협동 능력이 '-100'이기 때문에 1번 사원과 2번 사원을 분리시켜야 한다. 
    1번 사원이 A팀이 되고, 2번 사원과 3번 사원이 B팀, 4번 사원이 C 팀이 되면 각 팀의 능력치는 5, 13, 9가 된다. 
    따라서 가장 능력이 낮은 팀의 능력치 합은 5가 된다.
*/
/*
    신입사원의 최대 인원은 12
    팀을 3개를 만드는 모든 경우의 수를 구한다.
        n의 대한 3개로 자연수 분할 후 집합 분할
    각 팀의 value를 구한다.
    팀의 value 평균치가 가장 높은 팀을 구한다.
    
    n은 3이상 주어진다.
    한팀의 최대 크기는 n-2이다.
*/
public class Solution1{
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(bf.readLine()) + 1;
        

        bw.flush();
        bw.close();
    }
}
