/*557. Reverse Words in a String III
Given a string, you need to reverse the order of characters in each word within a sentence 
while still preserving whitespace and initial word order
Example 1:
	Input: "Let's take LeetCode contest"
	Output: "s'teL ekat edoCteeL tsetnoc"
Note: In the string, each word is separated by single space and there will not be any extra space in the string.*/

public class Reverse_Words_in_a_String_III {
	public static void main(String[] args) {
		String input = "Let's take LeetCode contest";
		String[] x = input.split(" ");
		String sentence = "";
		for (int i = 0; i < x.length; i++) {
			sentence = sentence + reverseWord(x[i]) + " ";
		}
		System.out.println(sentence.length());
		sentence = sentence + "      ";
		//System.out.println(sentence.substring(0, sentence.length() - 1)); 
		System.out.println(sentence.trim());
		System.out.println(sentence.trim().length());
		//字符串的长度为 .length()【为一个方法】 而数组的长度为 .length 没有括号【是一个属性】
	}
	public static String reverseWord(String s) {
		char[] x = s.toCharArray();
		char[] y = new char[x.length];
		for (int i = 0; i < x.length; i++) {
			y[x.length - i -1] = x[i];
		}
		return String.valueOf(y);
	}
//需要学习的方法1
    public String reverseWords1(String s) {
    	String[] str = s.split(" ");
    	for (int i = 0; i < str.length; i++) {
			str[i] = new StringBuilder(str[i]).reverse().toString();
			//StringBuilder的用法：http://blog.csdn.net/zi_jun/article/details/7624999
		}
    	StringBuilder result = new StringBuilder();
    	for(String st:str){
    		result.append(st + " ");
    	}
    	return result.toString().trim();//.trim 源码中 空格的ASCII码值为32，小于所以可显示字符
    	// Java String.trim()方法返回去掉字符串首尾多余（首尾若不止一个空格，也都会去掉，知道没有空格）空格和制表符的字符串
    	// " ddd dd d " ---> "ddd dd d"
    } 
//需要学习的方法2
	public String reverseWords2(String s){
		char[] s1 = s.toCharArray();
		int i = 0;
		for (int j = 0; j < s1.length; j++) {
			if(s1[j] == ' '){
				reverse(s1, i, j-1);
				i = j + 1;
			}
		}
		reverse(s1, i, s1.length - 1);
		return new String(s1);
	}
	private void reverse(char[] s, int l, int r) {
		while(l < r){
			char temp = s[l];
			s[l] = s[r];
			s[r] = temp;
			l++;
			r--;
		}
		
	}
}
	

