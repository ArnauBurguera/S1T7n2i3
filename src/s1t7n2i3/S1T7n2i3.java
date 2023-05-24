package s1t7n2i3;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class S1T7n2i3 {

	public static void main(String[] args) {
		
		Object obj1 = new Object();
		Serialitzar serialitzar1 = new Serialitzar(obj1);
		
		//Exercici 3 JavaReflection
		for(Method metode : serialitzar1.getClass().getDeclaredMethods()) {
			
			if(metode.isAnnotationPresent(SerializeOnFile.class)) {
				try {
					metode.invoke(serialitzar1);
					System.out.println("Queda demostrat que s'executa la lectura de la annotació");
				} catch (IllegalAccessException e) {
					e.printStackTrace();
				} catch (InvocationTargetException e) {
					e.printStackTrace();
				}
			}
		}

	}
	

}
