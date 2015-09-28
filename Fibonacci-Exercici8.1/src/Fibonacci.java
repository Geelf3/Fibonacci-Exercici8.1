import java.util.ArrayList;
import java.util.Iterator;

public class Fibonacci {

	public static void main(String[] args) {
		// 1: Create an ArrayList with 25 slots.
		ArrayList<Integer> fibonacci = new ArrayList<Integer>(25);
		
		// 2: Load it with fibonacci's numbers.
		System.out.println("La posició 0 equival a: 0");
		fibonacci.add(0);
		System.out.println("La posició 1 equival a: 1");
		fibonacci.add(1);
		
		// 3: do a standard loop
		System.out.println("\nAmb un bucle normal:\n ");
		for (int i = 2; i < 25; i++) {
			fibonacci.add(fibonacci.get(i-1) + fibonacci.get(i-2));
			System.out.println("La posicio "+ i + " equival a: " + fibonacci.get(i) );
		}
		
		// Do it using for each
		System.out.println("\nAmb el for each:\n ");
		for (Integer resultat : fibonacci) {
			System.out.println("En la posició " + fibonacci.indexOf(resultat) + " hi ha " + resultat);
		}
        
        // Do it using iterator
		System.out.println("\nAmb l'Iterator:\n ");
        Iterator<Integer> sequencia = fibonacci.iterator();
        while (sequencia.hasNext()) {
        	System.out.println(sequencia.next());
        }
		
		// 4: Determinate the position of "2584" number.
		System.out.println("\nEl número 2584 es troba a la posició " + fibonacci.indexOf(2584));
		
		// 5: the 4311 value exists in this arrayList?
		if (fibonacci.indexOf(4311) != -1) {
			System.out.println("\nEl valor 4311 es troba a la posicio: " + fibonacci.indexOf(4311));
		} else {
			System.out.println("\nEl valor 4311 no es troba a l'array.");
		}
	}

}
