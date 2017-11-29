 import java.util.ArrayList;

public class Sectiune implements ElemPagina {
	
	
	public String titlu;	
	ArrayList<ElemPagina> elem = new ArrayList<ElemPagina>();
	
	public Sectiune(String t)
	{
		this.titlu = t;
	}

	public void addElement(ElemPagina e){
		elem.add(e);	
		
	}
	public void removeElement(ElemPagina e) {		
		elem.remove(e);
	}
	public int getElemente() {
		return elem.size();
	}

	public void print() {
		System.out.println(this.titlu);
		for(ElemPagina e : elem)
		{
			e.print();
		}
	

	
	}

	public void accept(Visitor v) {
		// TODO Auto-generated method stub
		
	}
}
