package ejercicio3;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
public @interface Servidor {

	String direccion();
	String puerto();
	String archivo();
	
	
}
