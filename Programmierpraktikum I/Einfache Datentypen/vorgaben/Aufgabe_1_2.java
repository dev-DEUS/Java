
public class Aufgabe_1_2 {
    public static void main(String[] args){	
	int a = 1, b = 2, c = 3, d = 4;
	
	
	/*  Aufgabenteil (a) 
	    Ergebnistyp: int
		Ergebniswert 5

		1. b * c -> Ausdruckswert 2 * 3 = 6
		2. d / b -> Ausdruckswert 4 / 2 = 2
		3. 1 + 6 - 2 = 5
	 */

	int e = a + b * c - d / b;
	System.out.println(e); 

	a = 1; b = 2; c = 3; d = 4; // reinitialisieren


	/* Aufgabenteil (b) 
	    Ergebnistyp: int
		Ergebniswert: 8

		1. a = 1
		2. a++ -> Ausdruckswert 1, a = 2
		3. ++a -> Ausdruckswert 3, a = 3
		4. a = 3
		5. 1 + 1 + 3 + 3 = 8
	 */ 
	int f = a + a++ + ++a + a;
	System.out.println(f); 

	a = 1; b = 2; c = 3; d = 4; // reinitialisieren


	/* Aufgabenteil (c) 
		Ergebnistyp: int
		Ergebniswert: -5

		1. ++c -> Ausdruckswert 3, c = 4
		2. b += ++c -> 4 + 2 = 6
		3. a -= b += ++c -> 1 - 6 = -5

	 */ 

	int g = a -= b += ++c;
	System.out.println(g); 

	a = 1; b = 2; c = 3; d = 4;  // reinitialisieren

	/*  Aufgabenteil (d) 
		Ergebnistyp: boolean
		Ergebnistyp: true

		1. a * d -> 1 * 4 = 4
		2. b * c -> 2 * 3 = 6
		3. 4 < 6 = true -> hört hier auf, weil true.
		4. || -> Ausdruck "oder"
		5. a + d -> 1 + 4 = 5
		6. b + c -> 2 + 3 = 5
		7. 5 != 5 = false
		8. true || false = true
	 */ 

	boolean h = a * d < b * c || a + d != b + c;
	System.out.println(h); 

	a = 1; b = 2; c = 3; d = 4;      //  reinitialisieren

	/* Aufgabenteil (e) 
	  Ergebnistyp: int
	  Ergebniswert: 6

	  1. -1 * a -> -1 * 1 = -1
	  2. -1 + b -> -1 + 2 = 1
	  3. d - c -> 4 - 3 = 1
	  4. 1 < 1 = false
	  5. !false = true
	  6. ++a -> a = 2
	  7. ++a -> a = 3
	  8. ++a * ++a -> 2 * 3 = 6
	 */
	int i = !(-1 * a + b < d - c) ? ++a * ++a : c++ + ++c;
	System.out.println(i); 

	a = 1; b = 2; c = 3; d = 4;   //  reinitialisieren

 	/* Aufgabenteil (f) 
		Ergebnistyp: int
		Ergebniswert: 1

		1. a > b -> 1 > 2 = false
		2. h1 = a = 1
		3. c > d -> 3 > 4 = false
		4. h2 = c = 3
		5. h1 > h2 -> 1 > 3 = false
		6. j = false -> h1 -> 1
	 */
	int h1, h2;
	int j = (h1 = ((a > b) ? b : a)) > (h2 = ((c > d) ? d : c)) ? h2 : h1;
	System.out.println(j); 
   }
}

