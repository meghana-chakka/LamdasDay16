package ai.jobiak.lamdaspractice;
import java.util.function.*;
public class TestFunctional {
	public static void main(String[] args) {

	    Predicate<Boolean>predicate=(Boolean)->{return 100< 45;};
	    System.out.println(predicate.test(true));
	    
	    Consumer<String> consumer=(String str)-> {System.out.println(str);};
	    consumer.accept("jobiak.ai");

	   Supplier<Double> supplier=()->Math.random();
	    System.out.println(supplier.get());
	    
	    Supplier<Integer> supplier2=()->2*2*2;
	    System.out.println(supplier2.get());
	

}
}
