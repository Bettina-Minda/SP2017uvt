
public class Test {

	public static void main(String[] args) {

		Capitol cap = new Capitol("Luceafarul");
		cap.addElement(new Capitol("Iarna pe ulita"));
		cap.addElement(new Imagine("balbla"));
		
		
		
		Sectiune sec = new Sectiune("gjfd");
		sec.addElement(new Paragraf("nbjnfnbjbchbjb"));
		
		cap.addElement(sec);
		cap.print();
	}

}
