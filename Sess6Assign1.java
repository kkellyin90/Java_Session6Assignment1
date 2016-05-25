package session6Assignment1;

public class Sess6Assign1 {

	public static void main(String[] args) {
		SimpleInterface num1 = new PrintingNumber(18);
		num1.getNumber();								// prints the number
		
		SimpleInterface num2= new SquaringNum(18);
		num2.getNumber();								// prints the square of the number
		
	}

}
// defining the interface
interface SimpleInterface{
	void getNumber();
}
// defining the child class to print the number object
class PrintingNumber implements SimpleInterface{
	public int number;
	public PrintingNumber(int num) {
		this.number=num;
	}
	@Override
	public void getNumber() {
		System.out.println("The number is "+number);
		
	}
}
// defining the class to square the number implementing the SimpleInterface interface
class SquaringNum implements SimpleInterface{
	int number;
	public SquaringNum(int num) {
		this.number=num;
		
	}
	@Override
	public void getNumber() {
		number*=number;
		System.out.println("The square of the number is "+number);
		
	}
	
}