
public class Imagine implements ElemPagina {
	public String imagePath;
	
	public Imagine(){
		 this.imagePath = "none";
		}

		public Imagine(String img){
		this.imagePath = img;
		}
		
		public void addElement(ElemPagina e) {		
		}	
		public void removeElement(ElemPagina e) {
		}

		public int getElemente() {
		
			return 0;
		}

		public void print() {	
			System.out.println(imagePath);
		}

	
}
