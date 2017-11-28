package leetcode;

public class Hanming {
	public static void main(String[] args){		
		System.out.println(Hanming1(11,22));
		System.out.println(Hanming2(1,4));
	}
	//case 1
	public static int Hanming1(int x,int y){
		int vor = x^y, count = 0;
		for(int i=0; i<32;i++) count+=(vor>>i)&1;
		return count;
	}
	//case 2 
	// bitCount()
	//http://blog.csdn.net/qq_33516547/article/details/78156879
	public static int Hanming2(int x, int y){
		return Integer.bitCount(x^y);
	}
}


