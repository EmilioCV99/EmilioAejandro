package Iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class EjemploIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String>listaMarcaCoches = new ArrayList<String>();
		
		listaMarcaCoches.add("Audi");
		listaMarcaCoches.add("Porsche");
		listaMarcaCoches.add("Aston Martin");
		listaMarcaCoches.add("Ferrari");
		listaMarcaCoches.add("Mercedes");
		listaMarcaCoches.add("Seat");
		
		System.out.println("Numero de elementos antes de elimnar"+listaMarcaCoches.size());
		System.out.println(listaMarcaCoches.toString());
		listaMarcaCoches.remove("Seat");
		listaMarcaCoches.remove("Mercedes");
		System.out.println("Numero de elementos despues de elimnar"+listaMarcaCoches.size());
		
		for(String string : listaMarcaCoches) {
			System.out.println("Contenido :"+string);
		}
		
		for(int i=0;i<listaMarcaCoches.size();i++) {
			System.out.println("Contenido :"+listaMarcaCoches.get(i));
		}
		
		Iterator<String> miIterador = listaMarcaCoches.iterator();
		String s;
		do {
			s=miIterador.next();
			System.out.println(s);
		}while(miIterador.hasNext());
		
		for (Iterator iterator = listaMarcaCoches.iterator(); iterator.hasNext();) {
			String string = (String) iterator.next();
			System.out.println(string);
		}
	}

}
