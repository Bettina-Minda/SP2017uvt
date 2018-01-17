package main;

public interface Visitor {
	public void visitImagineProxy(ImagineProxy imgp);
	public void visitImagine(Imagine img);
	public void visitParagraf(Paragraf para);
	public void visitTabel (Tabel t);
	public void visitSectiune (Sectiune s);
}
