
public class Test {

	public static void main(String[] args) {
		
		Carte c = new Carte("cartea mea", new Cuprins());
		Sectiune s1 = new Sectiune("sectiunea1");
		s1.addElement(new Imagine("abcd.url"));
		s1.addElement(new Paragraf("rabbit", new LeftAlign()));
		s1.addElement(new Obiect3d("obiectul asta"));
		
		SumVisitor s = new SumVisitor();
		
		
		Sectiune s2 = new Sectiune("sectiunea2");
		s2.addElement(new Paragraf("cat", new LeftAlign()));
		s2.addElement(new Paragraf("dog", new LeftAlign()));
		
		c.capitole.add(s1);
		c.capitole.add(s2);

		c.printBook();
		
		/*Paragraf p1 = new Paragraf("jfdbdd", new CenterAlign());
		Paragraf p2 = new Paragraf("gubgsu", new LeftAlign());
		Paragraf p3 = new Paragraf("robert ", new RightAlign());
		p1.print();
		p2.print();
		p3.print();*/
		
		
		
	}

}
