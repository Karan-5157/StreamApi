import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class BasicStream {

	public static void main(String[] args) {
		
		//stream can be created with static data
		Stream<String> stream1 = Stream.of("I","G","A","T","E","\n");
		//stream1.sorted().forEach((str)->System.out.println(str));
		
		//Not Possible stream is closed
		//stream1.forEach((str)->System.out.println(str));
		
		//Stream to array
		
		  Object[] arr=stream1.toArray();
		  for(Object o:arr)
		  {
			  System.out.println(o);
		  }
				  
		
		//stream can be acquired from array or collections
		
		String[] loc=new String[] {"Pune","Mumbai","Chennai","Banglore","Noida"};
		List<String> locations = Arrays.asList(loc);
		Stream<String> stream2 = locations.stream();
		stream2.forEach((str)->System.out.println());

	}

}
