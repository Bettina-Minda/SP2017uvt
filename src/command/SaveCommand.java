package command;

import main.DocumentManager;
import main.SavingVisitor;

public class SaveCommand implements Command {
	
	String filePath;
	
	public SaveCommand(String fp)
	{
		this.filePath = fp;
	}
	
	
	public void execute() {
		// TODO Auto-generated method stub
		
		SavingVisitor sv = new SavingVisitor(this.filePath);
		DocumentManager.getInstance().getbook().accept(sv);
		
		sv.save();
		
	}

}
