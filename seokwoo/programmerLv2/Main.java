package seokwoo.programmerLv2;
//fees:[180, 5000, 10, 600] �⺻�ð�(��), �⺻ ���, ���� �ð�(��), ���� ���
/* records: ["05:34 5961 IN", 
			 "06:00 0000 IN",
			 "06:34 0000 OUT", 
			 "07:59 5961 OUT", 
			 "07:59 0148 IN", 
			 "18:59 0000 IN", 
			 "19:09 0148 OUT", 
			 "22:59 5961 IN", 
			 "23:00 5961 OUT"]
*/
public class Main {
	public static void main(String[] args) {
		Kakao2 kakao2 = new Kakao2();
		int[]  fees = {180, 5000, 10, 600};
		 String[] records = {"05:34 5961 IN", 
					 "06:00 0000 IN",
					 "06:34 0000 OUT", 
					 "07:59 5961 OUT", 
					 "07:59 0148 IN", 
					 "18:59 0000 IN", 
					 "19:09 0148 OUT", 
					 "22:59 5961 IN", 
					 "23:00 5961 OUT"};
		
		kakao2.solution(fees, records);

	}

}