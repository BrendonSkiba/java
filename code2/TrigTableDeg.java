class TrigTableDeg {
	public static void main (String args[]){
	double c,s,t;
	int d = 0;
	double r = 0, rround = 0;
	double pi = 3.14159265358979323846243383279502884197169399375105820974;
	int i = 15; //increment r 15 degrees equals pi radians
	String un = "Error";
	System.out.println("degree measurement is represented as deg");
	System.out.println("\trad \t|\tcos\t|\tsin\t|\ttan");
	System.out.println("-------------------------------------------------------------------------------");
	while (d <= 360 ){
		r = d * (pi/180.0);
		c = Math.cos(r);
		c = (Math.round(c *1000.0))/1000.0;
		s = Math.sin(r);
		s = (Math.round(s *1000.0))/1000.0;
		t = Math.tan(r);
		t = (Math.round(t *1000.0))/1000.0;
		rround = (Math.round(r*1000))/1000.0;
		if (c == 0.0)
		{ System.out.println("\t"+d+ "\t|\t"+ c +"\t|\t"+ s + "\t|\t Error");
		}else{
			System.out.println("\t"+d+ "\t|\t"+ c +"\t|\t"+ s + "\t|\t" + t);
		}
		d = d + i;
		}
	}
}
