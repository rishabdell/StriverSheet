package l3_Exception_Handling;

public class Project {
	private int num;
	private int id;
	
	public int calculate() {
		
		num =0;
		try {
			System.out.println("Before / by 0");
			num=id/0;
			System.out.println("After / by 0");
		}
		catch(ArithmeticException e) {
			e.printStackTrace();
			System.out.println("In catch");
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
		return num;
	}

}
