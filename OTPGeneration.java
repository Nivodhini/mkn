
public class OTPGeneration 
{
	public static String output1;
	public static void main( String [] args ) 
	{
	userMethod("GoodnamE", 61741978349L, "Current" ); //Test Cases
	System.out.println( output1 ); //Check the output value
	}
	public static void userMethod(String input1, long input2, String input3 ) 
	{
		String s=null,ss;
		char fifth=input1.charAt(0);
		int nn=input1.length();
		char sevth=input1.charAt(nn-1);
		int i=0,j,k=0;
	long  temp;
	int fourth=0,sixth=0;
		int acc[]= new int[11];
		int ac[]= new int[11];
		//First two characters
	if(input3=="Savings")
		ss="Sa";
	else if(input3=="Current")
		ss="Cu";
	else
		ss="Lo";
	s=ss;
	long third=input2/10000000000L;
	s=s+third;
	//long eigth=input2/10L;
	while(input2>0)
	{
		temp=input2%10;
		acc[i++]=(int)temp;
		input2=input2/10;
	}
	for(j=i-1;j>=0;j--)
		ac[k++]=acc[j];
	//for(j=0;j<k;j++)
	//	System.out.print(ac[j]);
	
	for(j=0;j<5;j++)
		fourth=fourth+ac[j];
	while(fourth>9)
	{
		int a=fourth%10;
		int b=fourth/10;
		fourth=a+b;
	}
	s=s+fourth+fifth;
	for(j=5;j<10;j++)
		sixth=sixth+ac[j];
	while(sixth>9)
	{
		int a=sixth%10;
		int b=sixth/10;
		sixth=a+b;
	}
	int eigth=ac[10];
	s=s+sixth+sevth+eigth;
	
	output1=s;
	
	}
}
