package ejercicio5;

public class PoolConexiones {

	static  PoolConexiones instancia = null;
	
	private PoolConexiones(){
		
	}
	
	static public PoolConexiones getInstance(){
	    if (instancia == null) {       
	    	instancia = new PoolConexiones();
	    }
		return instancia;
	}
}
