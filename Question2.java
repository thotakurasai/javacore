import java.util.Scanner;

public class Question2
{
	String name; long ph;
	String lol="";
	static int sum=0;
	String Products;
	Scanner ss=new Scanner(System.in);
	void Customer()
	{
		System.out.println("Enter Your Name,phno in order\n");
		name=ss.next();
		ph=ss.nextLong();
		System.out.println("Enter the products you are interested in\n");
		System.out.println("Deodarants,Vegetables,Groceries,Alcohol");
		Products =ss.next();
	}
	void Display()
	{
		System.out.println("Name : \t "+name+"\nPhone Number:\t"+ph+"Products : \t "+Products);
	}
	public static void main(String args[])
	{
		Availability a= new Availability();
		a.Customer();
		a.Display();
		a.Products();
		
		
	}
}
class Availability extends Question2
{
	int no;
	
	void Products()
	{
		while(true) {if(Products!="Deodarants")
		{
			System.out.println(" Available are\n");
			System.out.println("1.Axe\n2.Nivea\n3.Shots\n4.Wildstone\n5.Ks\n6.exit\\n");
			System.out.println("Enter Your Choice");
			no=ss.nextInt();
			switch(no)
			{
			case 1:
				System.out.println("Your Deo is:Axe ");
				int Axe=100;
				sum=sum+Axe;
				System.out.println("COOL sum is:"+sum );
				lol=lol+"Axe\n";
				System.out.println("Bought : \t "+lol);
				break;
			case 2:
				System.out.println("Your Deo is:Nivea");
				int Nivea=100;
				sum=sum+Nivea;
				System.out.println("COOL sum is:"+sum );
				lol=lol+" Nivea\n";
				System.out.println("Bought : \t "+lol);
				break;
			case 3:
				System.out.println("Your Deo is:Shots");
				int Shots=100;
				sum=sum+Shots;
				System.out.println("COOL sum is:"+sum );
				lol=lol+" Shots\n";
				System.out.println("Bought : \t "+lol);
				break;
			case 4:
				System.out.println("Your Deo is:Wildstone");
				int Wildstone=100;
				sum=sum+Wildstone;
				System.out.println("COOL sum is:"+sum );
				lol=lol+" Wildstone\n";
				System.out.println("Bought : \t "+lol);
				break;
			case 5:
				System.out.println("Your Deo is:KS");
				int ks=100;
				sum=sum+ks;
				System.out.println("COOL sum is:"+sum );
				lol=lol+" ks\n";
				System.out.println("Bought : \t "+lol);
				break;
			case 6:
				System.exit(0);
			default:
				System.out.println("No such choice is available");
				break;
			}
			System.out.println(sum);
		}
		
		else if(Products=="Vegetables")
		{
			System.out.println(" Available are\n");
			System.out.println("1.Brinjal\n2.Tomato\n3.Potato\n4.exit");
			System.out.println("Enter Your Choice");
			no=ss.nextInt();
			switch(no)
			{
			case 1:
				System.out.println("Your Selection: Brinjal");
				break;
			case 2:
				System.out.println("Your Selection: tomato");
				break;
			case 3:
				System.out.println("Your Selection: Potato");
				break;
			case 4:
				System.exit(0);
			default:
				System.out.println("No such choice is available");
				break;
			}
		}
		else if(Products=="Groceries")
		{
			System.out.println(" Available are\n");
			System.out.println("1.Powder\n2.Oil\n3.Cashew\n4.exit");
			System.out.println("Enter Your Choice");
			no=ss.nextInt();
			switch(no)
			{
			case 1:
				System.out.println("Your Selection: Brinjal");
				break;
			case 2:
				System.out.println("Your Selection: tomato");
				break;
			case 3:
				System.out.println("Your Selection: Potato");
				break;
			case 4:
				System.exit(0);
			default:
				System.out.println("No such choice is available");
				break;
			}
		}else if(Products=="Alcohol")
		{
			System.out.println(" Available are\n");
			System.out.println("1.Beer\n2.Exit");
			System.out.println("Enter Your Choice");
			no=ss.nextInt();
			switch(no)
			{
			case 1:
				System.out.println("Your Selection: Beer");
				break;
			case 2:
				System.exit(0);
			default:
				System.out.println("No such choice is available");
				break;
			}
		}
		else
			System.out.println("Sorry");
		}
		
		
	}
	
	
}
