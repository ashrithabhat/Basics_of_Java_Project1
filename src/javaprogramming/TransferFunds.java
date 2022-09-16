package javaprogramming;
class Login1
{
	void verifyLogin()
	{
		System.out.println("To verify login details");
	}
}
class AddBen1 extends Login1 
{
	void addBenificiary()
	{
		System.out.println("To add the benificiary");
	}
}
public class TransferFunds extends AddBen1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TransferFunds tf = new TransferFunds();
		tf.verifyLogin();
		tf.addBenificiary();
		tf.verifyTransferFunds();
		
	}
	void verifyTransferFunds()
	{
		System.out.println("Funds transferred");
	}
}
