
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
	
}
