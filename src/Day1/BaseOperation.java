package Day1;

import java.util.List;

public abstract class BaseOperation implements Operation {
	protected void validate(List<Integer> nums) {
		if(nums == null || nums.isEmpty() ) {
			throw new IllegalArgumentException("Invalid Input!");
		}
	}

}
