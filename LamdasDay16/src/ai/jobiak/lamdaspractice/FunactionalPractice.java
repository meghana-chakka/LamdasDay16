package ai.jobiak.lamdaspractice;

import java.util.function.Function;

public class FunactionalPractice {
	
		public static void main(String[] args) {
			//F<S,I>
			Function<String,Integer>lengthFunction=(String str)->{return str.length();};
	        int result=lengthFunction.apply("Preparation");
	        System.out.println("Length of String :"+result);
	   
	        Function<String, Integer> func = x -> x.length();
	        //F<I,I>
	        Function<Integer, Integer> func2 = x -> x * 2;
	        Integer result1= func.andThen(func2).apply("Program");   
	        System.out.println("Length of doubled String:"+result1);
	 
	}
}
