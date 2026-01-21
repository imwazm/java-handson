package Day1;

import java.util.List;
import java.util.Map;

public class CalculatorService {
		private final Map<Integer, Operation> operations;
		public CalculatorService(Map<Integer, Operation> operations) {
			this.operations=operations;
		}
		public int calculate(List<Integer> nums,int opt) {

		    Operation operation=operations.get(opt);
		    
		    if(operation == null) {
		    	throw new IllegalArgumentException("Invalid input!");
		    }
		    
		    	
		    
		    return operation.execute(nums);
		}}

