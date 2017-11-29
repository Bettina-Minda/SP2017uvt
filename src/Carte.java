import java.util.ArrayList;

public class Carte {

	public String titlu;
	public ArrayList<Autor> autori;
	public ArrayList<ElemPagina> capitole;
	public Cuprins cuprins;
	
	
	public AlignStrategy leftAlign = new LeftAlign();
	public AlignStrategy centerAlign = new CenterAlign();
	public AlignStrategy rightAlign = new RightAlign();
	
	public Carte(){
		this.titlu = "";
		this.autori = new ArrayList<Autor>();
		this.capitole = new ArrayList<ElemPagina>();
	}
	
	public Carte(String titlu,Cuprins cuprins){
		this.titlu = titlu;
		this.autori = new ArrayList<Autor>();
		this.capitole = new ArrayList<ElemPagina>();
		this.cuprins = cuprins;
	}
	
	public void printBook(){
		for(ElemPagina e : this.capitole){
			e.print();
		}
	}
	
	public void accept(Visitor v){
		for(ElemPagina e : this.capitole){
			e.accept(v);
		}
	}

	public String getTitlu() {
		return titlu;
	}

	public void setTitlu(String titlu) {
		this.titlu = titlu;
	}

	public ArrayList<Autor> getAutori() {
		return autori;
	}

	public void setAutori(ArrayList<Autor> autori) {
		this.autori = autori;
	}

	public ArrayList<ElemPagina> getCapitole() {
		return capitole;
	}

	public void setCapitole(ArrayList<ElemPagina> capitole) {
		this.capitole = capitole;
	}

	public Cuprins getCuprins() {
		return cuprins;
	}

	public void setCuprins(Cuprins cuprins) {
		this.cuprins = cuprins;
	}
	
	
	

}
