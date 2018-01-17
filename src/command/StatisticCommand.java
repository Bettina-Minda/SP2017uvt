package command;
import main.DocumentManager;
import main.DocumentStatisticVisitor;
import main.ElemPagina;

public class StatisticCommand implements Command {

	public void execute() {
		// TODO Auto-generated method stub
		ElemPagina book = DocumentManager.getInstance().getbook();
		
		DocumentStatisticVisitor visitor = new DocumentStatisticVisitor();
		book.accept(visitor);
		
		
		
		
	}

}
