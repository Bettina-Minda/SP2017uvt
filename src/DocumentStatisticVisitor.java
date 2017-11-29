
public class DocumentStatisticVisitor implements Visitor{
	public int paragrafStatistic;
	public int imagineStatistic;
	public int tabeleStatistic;
	public int sectiuneStatistic;
	
	
	public DocumentStatisticVisitor()
	{
		this.imagineStatistic =0;
		this.paragrafStatistic =0;
		this.sectiuneStatistic =0;
		this.tabeleStatistic =0;
	}
	

	public void visitImagineProxy(ImagineProxy imgp) {
		this.imagineStatistic++;
		
	}

	public void visitImagine(Imagine img) {
		this.paragrafStatistic++;
	}

	public void visitParagraf(Paragraf para) {
		this.paragrafStatistic++;
		
	}

	public void visitTabel(Tabel t) {
		this.tabeleStatistic++;
		
	}

	public void visitSectiune(Sectiune s) {
		for(ElemPagina e: s.elem)
		{
			e.accept(this);
		}
		
		this.sectiuneStatistic++;
		
	}
	
}
