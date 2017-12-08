
public class FindComplement {
	public static void main(String[] args) {
		System.out.println(findComplement(5));
	}
	public static int findComplement(int num) {
		int mask = num;
		mask |= mask >> 1;	//令mask前两位为1   1XXXXX|01XXXX = 11XXXX
		mask |= mask >> 2;	//令maskǰ前四位为1	  11XXXX|0011XX = 1111XX
		mask |= mask >> 4;	//令mask前八位为1   1111XX|000011 = 111111  以此类推
		mask |= mask >> 8;
		mask |= mask >> 16;
		return num ^ mask;
	}
}
