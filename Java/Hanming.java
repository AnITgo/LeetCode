package leetcode;

public class Hanming {
	public static void main(String[] args){		
		System.out.println(Hanming1(11,22));
		System.out.println(Hanming2(1,4));
	}
	//解法1
	public static int Hanming1(int x,int y){
		int vor = x^y, count = 0;
		for(int i=0; i<32;i++) count+=(vor>>i)&1;
		return count;
	}
	//解法2 
	//Integer.bitCount()函数的源代码很有意思，下面是函数的详解
	//http://blog.csdn.net/cor_twi/article/details/53720640 
	public static int Hanming2(int x, int y){
		return Integer.bitCount(x^y);
	}
}


