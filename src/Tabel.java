
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

		

}
