package ejercicio4;

public class Test extends Object {
	
	public Test sa(){
		return new Test(){
			public String toString(){
				return "funciona";
			}
		};
	}
}
