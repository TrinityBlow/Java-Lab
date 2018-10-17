package ejercicio2;
import java.lang.reflect.*;

public class Maping {

	public static void almacenar(Class<?> cl) {

//		for (Field m : cl.getDeclaredFields() ) {
//			
//			AlmacenarAtributo uc = m.getAnnotation(AlmacenarAtributo.class) ;
//			if (uc != null) {
//				m.setAccessible(true);
//				System.out.println("<nombreAtributo>" + m.getName() + "</nombreAtributo>");
//				System.out.println("<nombreAtributo>" + "s" + "</nombreAtributo>");
//			}
//		}
		
		for (Method method : cl.getMethods())
	    {
	        if ((method.getName().startsWith("get")) && (method.getName().length() == ("Valor".length() + 3)))
	        {
	            if (method.getName().toLowerCase().endsWith("Valor".toLowerCase()))
	            {
	                // MZ: Method found, run it
	                try
	                {
	                	Object ob = method.invoke(null);
	                	System.out.println(ob);
	                }
	                catch (IllegalAccessException e)
	                {
	                	System.out.println("Could not determine method: " + method.getName());
	                }
	                catch (InvocationTargetException e)
	                {
	                    System.out.println("Could not determine method: " + method.getName());
	                }

	            }
	        }
	    }
	}
	
	public static void main(String[] args) {
		almacenar(ejercicio2.Mapeado.class);
	}

}
