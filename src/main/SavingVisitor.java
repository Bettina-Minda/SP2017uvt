package main;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class SavingVisitor implements Visitor{
	
	StringBuilder sc;
	String fileNume;
	
	public SavingVisitor(String fn){
		sc = new StringBuilder();
		this.fileNume = fn;

	}

	public void visitImagineProxy(ImagineProxy imgp) {
		// TODO Auto-generated method stub
		sc.append(imgp.getFileName()+ "\n");
		
	}

	public void visitImagine(Imagine img) {
		// TODO Auto-generated method stub
		sc.append(img.getImagePath()+ "\n");
		
	}

	public void visitParagraf(Paragraf para) {
		// TODO Auto-generated method stub
		sc.append(para.getText()+ "\n");
		
	}

	public void visitTabel(Tabel t) {
		// TODO Auto-generated method stub
		sc.append(t.getNumeTabel()+"\n");
	}

	public void visitSectiune(Sectiune s) {
		for(ElemPagina e: s.elem)
		{
			e.accept(this);
		}
		sc.append(s.titlu+"\n");
		System.out.println("fdsfkjsdfhskdjfhsd" + sc.toString());
	}
	
	public void save()
	{
	
		try {
			PrintWriter out = new PrintWriter(fileNume);
			out.println("ceva ce nu merge");
			out.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}
