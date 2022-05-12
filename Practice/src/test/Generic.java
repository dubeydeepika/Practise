package test;

public class Generic <G,T>{
	G a;
	T b;
	
	T alpha() {
		System.out.println(a);
		return b;
	}
	public static void main(String[] args) {
		Generic<String,Integer> gen= new Generic<String,Integer>();
		gen.a="Test";
		gen.b=21;
		 int i= gen.alpha();
		 
		 System.out.println(i);
	}

}
