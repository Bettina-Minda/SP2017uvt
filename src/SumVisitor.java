
public class SumVisitor implements Visitor {
	
	private int suma;
	
	

	public void visitImagineProxy(ImagineProxy imgp) {
		// TODO Auto-generated method stub
		suma+=1;
		
		
	}

	public void visitImagine(Imagine img) {
		// TODO Auto-generated method stub
		suma+=1;
	}

	public void visitParagraf(Paragraf para) {
		// TODO Auto-generated method stub
		suma+=10;
		
	}

	public void visitTabel(Tabel t) {
		// TODO Auto-generated method stub
		suma+=2;
		
	}

	public void visitSectiune(Sectiune s) {
		// TODO Auto-generated method stub
		suma+=2;
	}
	
	//obiect3d in care sa adaug elementele sectiunii 
	

}
