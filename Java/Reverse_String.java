// hello --> olleh
public class Reverse_String {
	public static void main(String[] args) {
		String s = "hello";
		System.out.println(reverseString(s));
	}
	public static String reverseString(String s){
		char[] temp = s.toCharArray();//字符串转字符数组toCharArray()
		int n = temp.length; //数组中length是属性，字符串中length()方法查看个数
		char[] res = new char[n]; // 固定数组个数的声明方法要记得 new char[n]
		for(int i = 0;i<n;i++){
			res[n-i-1] = temp[i]; //res[n-i-1]注意数组下标越界的问题
		}
		
		return new String(res);//字符数组转字符串 new String(字符数组)
		
	}
}
