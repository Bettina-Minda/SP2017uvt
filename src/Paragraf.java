
public class Paragraf implements ElemPagina{
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

		public void addElement(ElemPagina e) {
			// TODO Auto-generated method stub
			
		}

		public void removeElement(ElemPagina e) {
			// TODO Auto-generated method stub
			
		}

		public int getElemente() {
			// TODO Auto-generated method stub
			return 0;
		}

		
}
