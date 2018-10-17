package ejercicio5;

public class Suma {
	
	public static void main(String[] args){
		int suma=0;
		int number = 0;
		for(int i=0;i<args.length;i++){
			try{
				number = Integer.parseInt(args[i]);
				suma+= number;
			}catch(NumberFormatException e){
				System.out.println(args[i]);
			}
		}
		System.out.print("La suma es:"+suma);
	}
}

// c) por que se ingresan todos numeros, por lo tanto no se genera ninguna excepcion