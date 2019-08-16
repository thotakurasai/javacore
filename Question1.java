import java.util.Arrays;
import java.util.Scanner;

public class Question1 {
	
	//static int i=0;
		public static void primes(int a, int prime[]) 
		{ 
			prime[0]=prime[1]=1; 
			for (int i=2;i*i<=a;i++) 
			{ 
				if (prime[i]==0) 
				{ 
					for (int j=2*i; j<=a; j+=i) 
						prime[j]=1; 
				} 
			} 
		}
		public static int sum(int b) 
		{ 
			int su=0; 
			while(b>0) 
			{ 
				su=su+b%10; 
				b=b/10; 
			} 
			return su; 
		}
		static void lol(int arr[],int n) 
		{
			int d = Arrays.stream(arr).max().getAsInt(); 
			int prime[]=new int[d+1];
			primes(d, prime); 
			for (int i=0; i<n;i++) 
			{
				if (prime[arr[i]]==0) 
				{ 
					int sum=sum(arr[i]); 
					if (prime[sum]==0) 
						System.out.print(arr[i]+" "); 
				}
			} 
		}
		public static void main(String[] args) 
		{ 

			 Scanner s = new Scanner(System.in);
		      System.out.println("Enter the length of the array:");
		      int length = s.nextInt();
		      int [] myArray = new int[length];
		      System.out.println("Enter the elements of the array:");

		      for(int i=0; i<length; i++ ) {
		         myArray[i] = s.nextInt();
		      }
			int n =myArray.length; 
			lol(myArray, n); 
		} 
		} 

