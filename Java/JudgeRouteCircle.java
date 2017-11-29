package leetcode;

public class JudgeRouteCircle {
	public static void main(String[] args) {
		boolean end = judgeCircle("UDDL");
		System.out.println(end);
	}

	private static boolean judgeCircle(String moves) {
		int ud = 0, lr = 0;
		for (int i = 0; i <= moves.length() - 1; i++) {
			//switch(moves.charAt(i)){  ����ᱨ�޷���char����ת��ΪString���͵Ĵ���,ԭ����˫����"U"Ϊ�ַ�����������'U'Ϊ�ַ�
			switch(Character.toString(moves.charAt(i))){//��ϰһ���ַ�ת��Ϊ�ַ����ķ���
			case "U":
				ud++;
				break;
			case "D":
				ud--;
				break;
			case "L":
				lr++;
				break;
			case "R":
				lr--;
			default:
				System.out.println("�������");
			}
		}
		if(ud==0&&lr==0){
			return true;
		}else{
			return false;
		}
	}
}
