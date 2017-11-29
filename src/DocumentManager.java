
public class DocumentManager {
	private static DocumentManager instance;
	private ElemPagina book;
	private DocumentManager (){}
	
	public static DocumentManager getInstance(){
		if(instance == null){
			instance = new DocumentManager();
		}
		return instance;
	}
	
	public ElemPagina getbook()
	{
		return book;
	}
	
	public void setbook(ElemPagina book)
	{
		this.book = book;
	}
}
