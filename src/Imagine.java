
public class Imagine extends ElemPag {
	public String imagePath;
	
	public Imagine(){
		 this.imagePath = "none";
		}

		public Imagine(String img){
		this.imagePath = img;
		}

		public void print() {	
			System.out.println(imagePath);
		}

	
}
