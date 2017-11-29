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
			//switch(moves.charAt(i)){  这里会报无法把char类型转换为String类型的错误,原因是双引号"U"为字符串，单引号'U'为字符
			switch(Character.toString(moves.charAt(i))){//复习一下字符转换为字符串的方法
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
				System.out.println("输入错误");
			}
		}
		if(ud==0&&lr==0){
			return true;
		}else{
			return false;
		}
	}
	private static boolean judgeCircle2(String moves) {
		// 更简洁的写法
		int ud = 0, rl = 0;
		for(char ch : moves.toCharArray()){//增强for循环的用法，toCharArray()方法
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
                System.out.println("输入错误");
			}
		}
		return ud==0&&rl==0;//更简洁的return写法
	}
	
}
