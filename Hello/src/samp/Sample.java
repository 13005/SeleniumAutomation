package samp;

public class Sample {
	
	static void easy( int j){
		
		System.out.println(j);
	};
	public void sim(){
		System.out.println("Hello");
	};
	
	public Sample(int l){
		System.out.println(l);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("hi");
		easy(6);
		Sample myObj = new Sample(9);
		myObj.sim();
		

	}

}
