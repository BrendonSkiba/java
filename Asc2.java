// save as Asc.java
// javac Asc.java
// java Asc



class Asc2 {

	public static void main (String args[]){
	  int n;
	  char c;
	  String hex;
	  String bin;
      n = 32;
	  while (n < 25){
	    c = (char)n;
	     System.out.print("\t");
	     System.out.print(n);
	     System.out.print("\t");
	     System.out.print(c);
	     hex = Integer.toHexString(c);
	     bin = Integer.toBinaryString(c);
	     System.out.print("\t");
	     System.out.print(hex);
	     System.out.print("\t");
	     System.out.print(bin);
	     System.out.print("\t");
	     System.out.println();
	     n = n + 1;
		}

   }

}
