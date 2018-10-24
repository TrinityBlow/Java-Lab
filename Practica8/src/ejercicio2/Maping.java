package ejercicio2;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.*;

public class Maping {

	// parametros genericos para poder acceder a cualquier clase
	public static void almacenar(Class<?> cl, Object objectInstance) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException, IOException {

		Object value;
        File file;
        String eol = System.lineSeparator(), contenido = "", nombreArchivo;       
        BufferedWriter out = null;
        FileWriter writer = null;

        Archivo archivo = cl.getAnnotation(Archivo.class);
        if(archivo != null && !archivo.nombre().equals("")){
        	nombreArchivo = archivo.nombre();
        } else{
        	nombreArchivo = cl.getSimpleName() + ".txt";
        }

    	contenido = "<nombreClase>" + cl.getSimpleName() + "</nombreClase>" + eol ;
		for (Field m : cl.getDeclaredFields() ) {
			
			AlmacenarAtributo uc = m.getAnnotation(AlmacenarAtributo.class) ;
			if (uc != null) {
				m.setAccessible(true);
				value = m.get(objectInstance);
				contenido = contenido +  "<nombreAtributo>" + m.getName() + "</nombreAtributo>" + eol;
				contenido = contenido + "<nombreValor>" + value.toString() + "</nombreValor>" + eol;
			}
		}

		
        try {
        	writer = new FileWriter(nombreArchivo, true);
            out = new BufferedWriter(writer);
            out.write(contenido);
        } catch (IOException e) {
            file = new File(nombreArchivo);
            writer = new FileWriter(file);
            writer.write(contenido);
        } finally {
            if(out != null) {
                out.close();
            }
            if(writer != null){
            	writer.close();
            }
        }
        
        
	}
	
	public static void main(String[] args) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException, IOException {	
		almacenar(ejercicio2.Mapeado.class, new Mapeado());
	}
	
	//Para hacerlo mas generico se tendria que recibir por parametro el nombre de la clase
	//Para imitar a la funcion main de arriba tendriamos que pasar como parametro ejercicio2.Mapeado   ||||  package.class
//	public static void main(String[] args) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException, ClassNotFoundException, InstantiationException {
//		Class<?> clase = Class.forName(args[0]);
//		
//		almacenar(clase, clase.newInstance());
//	}

}
