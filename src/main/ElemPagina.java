package main;
public interface ElemPagina {
	
	public void addElement(ElemPagina e);
	public void removeElement(ElemPagina e);
	public int getElemente();
	public void print();
	
	public void accept(Visitor v);
}
