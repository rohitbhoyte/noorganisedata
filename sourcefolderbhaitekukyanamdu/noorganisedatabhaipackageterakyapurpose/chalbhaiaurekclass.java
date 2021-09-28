package noorganisedatabhaipackageterakyapurpose;

public class chalbhaiaurekclass extends bhaiclasstuzmemekyakaru 
 {  
	public void methodbhaituzmekyakaru()
	{
		System.out.println();
	}
	int m6(int y)
	{
	 System.out.println("Bhai me overloading me same method ka jugad karta hu sirf parameter ki help leni padti hai muzko");
	  System.out.println(y);
		return y;
	 
	}
	int m61()
	{
		System.out.println("i will run vith same method name with int.but not worked changed method name fromm6 to m61");
		return 0;
		
	}
	void m6()
	{
	 System.out.println("i am only void");
	}
	public void m5()
	{
		System.out.println("i am public void");
	}
	public chalbhaiaurekclass()
	{
		System.out.println("hey dude i am special my name is same as class");
	}
	int m4()
	{
		System.out.println("without void and static");
		return 0;
	}
	static int m1()
	{
		System.out.println("static int ka calling sikhna padega");
		return 0;
	}
	public static void m2()
	{
		System.out.println("ye void ka funda hai bhai");
	}
	public void m3()
	{
		System.out.println("without staticvala void");
	}
	
	public static void main(String[] args) {
		chalbhaiaurekclass chalbhaiaurekclass = new chalbhaiaurekclass();
		bhaiclasstuzmemekyakaru extendedbanda = new chalbhaiaurekclass();
		extendedbanda.methodbhaituzmekyakaru();
		chalbhaiaurekclass.methodbhaituzmekyakaru();

		chalbhaiaurekclass.m3();
		chalbhaiaurekclass.m4();
		chalbhaiaurekclass.m5();
		chalbhaiaurekclass.m61();
		chalbhaiaurekclass.m6(3000);
		m2();
		m1();
		int i=0;
		while(i<=10)
		{  			System.out.println("Start the while loop");

			System.out.println(i);
			System.out.println("Execute in between for loop");
			for(int j=5;j<=15;j++)
			{
				System.out.println(i+j);
			}
			System.out.println("get out of for loop");

			i++;
		}
				System.out.println("exit while loop");

		
	}
	}
