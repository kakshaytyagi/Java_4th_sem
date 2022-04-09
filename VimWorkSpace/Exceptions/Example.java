//User throw and default catch
//

class Example {
	public static void main(String args[]){
		int balance = 5000;
		int withdrawlAmount = 6000;

		if (balance < withdrawlAmount)
			throw new ArithmeticException("Insufficient balance");

		balance = balance - withdrawlAmount;

		System.out.println("TransactionSuccessfully completed");
		System.out.println("Program continuee......");
	}
}
				
