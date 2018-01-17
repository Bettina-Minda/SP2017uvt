package main;

public class Tabel extends ElemPag{
	public String numeTabel;
	
	public Tabel(){
		 this.numeTabel = "none";
		}

		public Tabel(String numT){
		this.numeTabel = numT;
		}
		
		public void print() {
			
			System.out.println(numeTabel);
		}

		public void accept(Visitor v) {
			v.visitTabel(this);
			
		}

		public String getNumeTabel() {
			return numeTabel;
		}

		public void setNumeTabel(String numeTabel) {
			this.numeTabel = numeTabel;
		}
		

		

}
