package command;

import main.DocumentManager;
import main.Imagine;
import main.LeftAlign;
import main.Obiect3d;
import main.Paragraf;
import main.Sectiune;

public class CreateSampleCommand implements Command{
	
	private String title;
	public CreateSampleCommand(String title){
		this.title = title;
	}

	
	public void execute() {
		// TODO Auto-generated method stub
		if(DocumentManager.getInstance().getbook()!=null){
		//	Memento state = new Memento(DocumentManager.getInstance().getbook());
			//DocumentManager.getInstance().getStates().add(state);
	}
	Sectiune s = new Sectiune(this.title);
	Sectiune s1 = new Sectiune("sectiunea1");
	s1.addElement(new Imagine("abcd.url"));
	s1.addElement(new Paragraf("rabbit", new LeftAlign()));
	
}}
