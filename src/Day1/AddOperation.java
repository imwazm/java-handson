package Day1;

import java.util.List;

public class AddOperation extends BaseOperation {

	@Override
	public int execute(List<Integer> nums) {
		validate(nums);
		int sum=0;
		for(int num:nums) {
			sum+=num;
		}
		return sum;
	}

}
