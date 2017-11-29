import java.util.ArrayList;

public class Obiect3d implements ElemPagina{
	
	
	public String numeObiect;
	
	ArrayList<ElemPagina> elem = new ArrayList<ElemPagina>();
	
	public Obiect3d(String numObj)
	{
		this.numeObiect = numObj;
		
	}

	public void addElement(ElemPagina e) {
		// TODO Auto-generated method stub
		elem.add(e);
		
	}

	public void removeElement(ElemPagina e) {
		// TODO Auto-generated method stub
		
	}

	public int getElemente() {
		// TODO Auto-generated method stub
		return 0;
	}

	public void print() {
		// TODO Auto-generated method stub
		System.out.println(this.numeObiect);
		for(ElemPagina e : elem)
		{
			e.print();
		}
	}

	public void accept(Visitor v) {
		// TODO Auto-generated method stub
		
	}

}
