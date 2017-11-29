package leetcode;

public class JudgeRouteCircle {
	public static void main(String[] args) {
		boolean end = judgeCircle("UDDL");
		boolean end2 = judgeCircle2("UDDU");
		boolean end3 = judgeCircle3("UDLRRLDLLUL");//��Ҫѧϰ���㷨������
		//System.out.println(end);
		//System.out.println(end2);
		System.out.println(end3);
		// UDDLUDDL
	}

	private static boolean judgeCircle3(String moves) {
		moves=" " + moves + " ";  //���ǵ��߽��������"L"Ϊ������L���ַ����׶˻�β�ˣ����޷���ȷ�ó�L�ĸ���
		System.out.println(moves.split("L").length); //split("L").length ���ص��Ƿָ���ַ����ĸ�������ǰ��ӿ��ַ��󣬵��ڷָ����ĸ���+1
        return moves.split("L").length==moves.split("R").length && moves.split("U").length == moves.split("D").length;
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
