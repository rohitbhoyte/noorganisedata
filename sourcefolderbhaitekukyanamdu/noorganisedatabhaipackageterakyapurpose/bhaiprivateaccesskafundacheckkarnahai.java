package noorganisedatabhaipackageterakyapurpose;

public class bhaiprivateaccesskafundacheckkarnahai 
{
	private  void p0()
	{
		System.out.println("private tu to subclass me nahi jata hai,dusre package aur project me jane ka to sawalich nahi hai");
		System.out.println("conclusion:same class ke alawa priavate bhai kidharich access nahi hota.");
	}
	protected void p1()
	{
		System.out.println("subclass me protected method aata hai ki nahi dekhte hai");
		System.out.println("dusre package me protected method aata hai ki nahi dekhte hai");
		System.out.println("dusre project me protected method aata hai ki nahi dekhte hai");
		System.out.println("conclusion:protectedbhai ki method , dusre subclass,package me method calling hota hai easily,sirf dusre project me lene ke liye ek fix project setup ka issue fix karna padta hai.");


	}
	
	void p2()
	{
		System.out.println("tu default hai subclass me aa jata hai checke karenge private ke sath me");
		System.out.println("conlusion:defultbhai sirf extend hua dusre class me,uske bad nahi dusre package me aaya na hi dusre project me aaya");
	}
	public void p3()
	{
		System.out.println("bhai me public dusre package me jane ke liya tayar");
		System.out.println("conclusion:ye publicbhai subclass,dusre package easily jata hai aur sirf dusre project me jane ke liye ek project setup issue fix karna padta hai jo hame suugeestion dta hai eclipse");
	}
	public static void main(String[] args) 
	{
		bhaiprivateaccesskafundacheckkarnahai dard=new bhaiprivateaccesskafundacheckkarnahai();
		dard.p1();
		dard.p2();
		
	}

}
