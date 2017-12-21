import java.util.LinkedList;

public class Baseball_Game {
	public static void main(String[] args) {
		String[] ops = {"5","-2","4","C","D","9","+","+"};
		
		System.out.println(calPoints(ops));
	}
	public static int calPoints(String[] ops){
		//使用链表的数据结构，链表中为每次的得分情况
		LinkedList<Integer> ll = new LinkedList<>();
		//第一个元素必须为数字，若不为数字则抛出异常
		try {
			Integer.parseInt(ops[0]);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("第一次输入错误");
		}
		
		for(String s : ops){
			switch(s){
				case "D" :
					ll.add(ll.getLast()*2); //getLast()取表尾     getFirst()取表头       add()方法加在表尾
					break;
				case "C" :
					ll.removeLast(); // removeLast() removeFirst()
					break;
				case "+":
					/*int a = ll.getLast();
					ll.removeLast();
					int b = ll.getLast();
					ll.addLast(a);
					int c = a+b;
					ll.add(c);*/
					
					ll.add(ll.getLast()+ll.get(ll.size()-2)); //.get(index)方法，索引从0开始，故-2
					break;
				default:
						ll.add(Integer.parseInt(s));
			}
			System.out.println(ll);
		}
		System.out.println(ll);
		int res = 0;
		for (int i = 0; i < ll.size() ; i++) {		
			res += ll.get(i);
		}
		return res;
	}
}
