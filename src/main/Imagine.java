package main;

public class Imagine extends ElemPag {
	public String imagePath;
	
	public Imagine(){
		 this.imagePath = "none";
		}

	public String getImagePath() {
		return imagePath;
	}

	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}

		public Imagine(String img){
		this.imagePath = img;
		}

		public void print() {	
			System.out.println(imagePath);
		}

		public void accept(Visitor v) {
			v.visitImagine(this);
			
		}

	
}
