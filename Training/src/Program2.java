# using constructor
class Add{
	int a, b;
	
	void  add() {
	}
	int Add(int x, int y) {
		a =x;
		b =y;
		return a+b;
	}
	
}

public class Program2 {
	public static void main(String[] args) {
		Add ad =new Add();
		int add = ad.Add(10, 20);
		System.out.println(add);
	}
}
