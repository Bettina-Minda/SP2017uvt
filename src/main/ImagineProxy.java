package main;

public class ImagineProxy extends ElemPag {
	private String fileName;
	private Imagine img = null;
	
	ImagineProxy(String fileName)
	{
		this.fileName = fileName;
	}
	
	public void print()
	{
		if(img == null)
		{
			this.img= new Imagine(this.fileName);
		}
		
		img.print();
	}

	public void accept(Visitor v) {
		v.visitImagineProxy(this);
		
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	
	
}
