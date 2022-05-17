package ai.jobiak.lamdaspractice;

import java.util.Arrays;
import java.util.List;

//1.reverse of a number
interface Reverse {
	public int reverse(int n);
}
//2.Checking number is Armstrong or not
interface Armstrong {
	public int armstrong(int n);
}

//3.sum of natural numbers
interface NaturalSum {
	public void sum(int n, int s);
}

//4.Fibnacci Series
interface Fibnacci {
	public void fib(int fn, int sn, int limit);
}

//5.Perfect or not
interface Prefect {
	public void perfect(int n, int s);
}

//6.Functinal Interfaces implementation
@FunctionalInterface
interface Bank {
	public default void timimgs() {
		System.out.println("Opens @ 10 am & closes @ 4pm");
	}
	public static void holiday() {
		System.out.println("Closed on Sundays");
	}

	public abstract void roi();// rate of interest
}

class Sbi implements Bank {
	@Override
	public void roi() {
		System.out.println("Sbi decided roi is:12%");
	}
}

//7.Prime or not
interface Prime {
	public void checkPrime(int n);
}

//8.Check even or odd
interface Check{
	public void check(int n);
}
//9.Interface Anonymous Class 
//10.NumberIntoDigits
interface NumberIntoDigits
{
	public void show(int n);
}

public class PracticeLamdas {
	public static void main(String[] args) {

		// 1.Implementation
		Reverse r = (int n) -> {
			int rem, rev = 0;
			while (n > 0) {
				rem = n % 10;
				rev = rev * 10 + rem;
				n = n / 10;
			}
			return rev;
		};
		int reverseTest = r.reverse(789);
		System.out.println("1.Reverse of 789 number :" + reverseTest);
		// 2.Implementation
		Armstrong a = (int n) -> {
			int rem, arm = 0, temp;
			temp = n;
			while (n > 0) {
				rem = n % 10;
				arm = arm + (rem * rem * rem);
				n = n / 10;
			}
			if (temp == arm)
				System.out.print("2.It is a Armstrong number :");
			else
				System.out.print("2.It is not a Armstrong number :");
			return arm;
		};
		int armstrongTest = a.armstrong(370);
		System.out.println(armstrongTest);

		// 3.Implementation
		NaturalSum ns = (int n, int s) -> {
			for (int i = 1; i <= n; i++) {
				s = s + i;
			}
			System.out.println("3.Sum of first 5 natural numbers:" + s);

		};
		ns.sum(5, 0);

		// 4.Implementation
		Fibnacci f = (int fn, int sn, int limit) -> {
			int next;
			System.out.println("4.Fibnacci series of first 10 numbers:");
			for (int i = 3; i <= limit; i++) {
				next = fn + sn;// fn=0, sn=1
				System.out.print("  " + next);
				fn = sn;
				sn = next;
			}
		};
		f.fib(0, 1, 10);
		System.out.println();

//5.Implementation
		Prefect p = (int n, int s) -> {
			for (int i = 1; i <= n / 2; i++) {
				if (n % i == 0)
					s = s + i;
			}
			if (s == n)
				System.out.println("5." + n + " is a Perfect number");
			else
				System.out.println("5." + n + " not a Perfect number");
		};
		p.perfect(27, 0);
//6.Functional Interface implementation
		System.out.println("6.Functional Interface implementation");
		Bank b1 = new Sbi();
		b1.roi();
		b1.timimgs();
		Bank.holiday(); // accessing static method

//7.Implementation
	Prime p1=(int n)->{
					boolean flag=true;
					for(int i=2;i<=n/2;i++)
					{
						if(n%i==0)
							flag=false;
						break;
					}
					if(flag==true)
						System.out.println("7." + n + " is a Prime number");
					else
						System.out.println("7" + n + " is not a Prime number");
								};
p1.checkPrime(11);

//8.Implementation
Check c=(int n)->{
	System.out.print("8.");
	System.out.println(n%2==0? n + " is a Even number":n + " is a Odd number");
	};
c.check(99);
//9.Implementation
  System.out.println("9.Interfaces anonymous classes------");
	Runnable r1=new Runnable()
	{
		public void run()
			{
			for(int i=1;i<5;i++)
			{
					System.out.println(" enetered run="+i);
			}
			}
	};
	Thread thread =new Thread(r1);
	thread.start();
//10.Implementation
	NumberIntoDigits ob = (int n) -> {
		System.out.print("10.Converted number 3567  into Digits:");
		while (n > 0) {
			int rem;
			rem = n % 10;
			System.out.print(rem+",");
			n = n / 10;
		}

	};
   ob.show(3567);
   List <Integer> list=Arrays.asList(75,37,72,877,13,63,32);
   for(int i=0;i<list.size();i++) {
	   System.out.println(list.get(i));
   }
   
	}
}


