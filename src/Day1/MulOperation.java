package Day1;

import java.util.List;

public class MulOperation extends BaseOperation{

	@Override
	public int execute(List<Integer> nums) {
		validate(nums);
		int result=1;
		for(int num:nums) {
			result*=num;
		}
		return result;
	}

}
