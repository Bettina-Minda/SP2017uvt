
public class NewCommand implements Command {
	
	private String titlu;
	
	public NewCommand(String titlu){
		this.titlu = titlu;
	}
	
	public void execute() {
		// TODO Auto-generated method stub
		ElemPagina c = new Sectiune(this.titlu);
		DocumentManager.getInstance().setbook(c);
	}

}
