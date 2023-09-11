package Lambda;
interface Interf{
	public abstract void add(int a, int b);
}

public class lambdadDemo {
	public static void main(String[] args) {
		Interf i = (a,b)-> System.out.println(a+b);
		i.add(2, 3);
		i.add(3,50);
		
		
	}
	

}
