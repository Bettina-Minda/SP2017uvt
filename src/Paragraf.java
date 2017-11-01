
public class Paragraf extends ElemPag{
	public String text;
	public AlignStrategy align;
	
	public Paragraf(){
		 this.text = "none";
	}

	public Paragraf(String txt,AlignStrategy alg){
		this.text = txt;
		this.align = alg;
		
	}


		public void print() {
			
			align.aligntext(this.text);
		}

			
}
