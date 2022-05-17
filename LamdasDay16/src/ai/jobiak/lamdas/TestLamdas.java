package ai.jobiak.lamdas;

     //Scala-very powerful programming language
	//Java vs interfaces -functional interfaces
	@FunctionalInterface
	interface Test{ //user defined interface
		public default void paint() {
			System.out.println("from default method");
			}
		public static void method() {
			System.out.println("from static method");
			}
		public void print();
	//not allowed only one abstract method per FunctionalInterface public abstact void print();
	}
	class TestImpl implements Test{
		@Override
			public void print() {
				// TODO Auto-generated method stub
				
			}
	}
	interface Test2{
		public void add(int a,int b);
	}
	interface Test3{
		public int factorial(int n);
	}

	interface Test4{
		public String getString();
	}
	public class TestLamdas {

		public static void main(String[] args) {
			Test test=() ->{ System.out.println("from print...printing");};
			test.print();
	        Test2 test2=(int a,int b)->{
	        	int c=a+b;
	        	System.out.println(c);
	        };
	        test2.add(10,80);
	        
	        Test3 test3=(int n)->{
	        	int fact =1;
	        	int i=1;
	        	while (i<=n) {
	        		fact*=i;
	        		i++;
	        	}
	        	return fact;
	        };
		int factorialResult =test3.factorial(7);
		System.out.println(factorialResult);
		
		Test4 test4=()->"Anil Trainer";
		System.out.println(test4.getString());
		
		//interfaces anonymous classes
		Runnable r= new Runnable() {
			public void run() {
				System.out.println("from run method....");
				
			}
		};
		Thread thread = new Thread(r);
		thread.start();
		
	    Runnable r1=()->{System.out.println("from run method..."); };
	    thread = new Thread(r1);
	    thread.start();
		}

	}


