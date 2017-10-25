
public class Paragraf extends ElemPag{
	public String text;
	public Paragraf(){
		 this.text = "none";
	}

	public Paragraf(String txt){
		this.text = txt;
	}


		public void print() {
			
			System.out.println(text);
		}

			
}
