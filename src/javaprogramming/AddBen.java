package javaprogramming;
class Login
{
	void verifyLogin()
	{
		System.out.println("To verify login details");
	}
}

public class AddBen extends Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AddBen ad = new AddBen();
		ad.verifyLogin();
		ad.addBenificiary();
	}
	void addBenificiary()
	{
		System.out.println("To add the benificiary");
	}
}
