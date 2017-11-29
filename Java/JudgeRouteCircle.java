package leetcode;

public class JudgeRouteCircle {
	public static void main(String[] args) {
		boolean end = judgeCircle("UDDL");
		boolean end2 = judgeCircle2("UDDU");
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
	private static boolean judgeCircle2(String moves) {
		// ������д��
		int ud = 0, rl = 0;
		for(char ch : moves.toCharArray()){//��ǿforѭ�����÷���toCharArray()����
			switch(ch){
			case 'U':
                ud++;
                break;
            case 'D':
                ud--;
                break;
            case 'L':
                rl++;
                break;
            case 'R':
            	rl--;
                break;
            default:
                System.out.println("�������");
			}
		}
		return ud==0&&rl==0;//������returnд��
	}
	
}
