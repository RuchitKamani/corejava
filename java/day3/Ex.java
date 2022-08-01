package android;

interface Print
{
	void print();
	
}
interface Show
{
	void show();
}

public class Ex implements Print,Show
{

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("showing");
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("printing");
	}
	public static void main(String[] args) {
		
		Ex e1 =new Ex();
		e1.print();
		e1.show();
		
	}

}
