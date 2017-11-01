
public class Test {

	public static void main(String[] args) {

		Sectiune sec = new Sectiune("gjfd");
		Paragraf p1 = new Paragraf("jfdbdd", new CenterAlign());
		Paragraf p2 = new Paragraf("robert pute", new LeftAlign());
		Paragraf p3 = new Paragraf("robert pute", new RightAlign());
		
		
		p1.print();
		p2.print();
		p3.print();
		
		
		
	}

}
