package Day1;

import java.util.List;

public class SubOperation extends BaseOperation {

	@Override
	public int execute(List<Integer> nums) {
		validate(nums);
		
		int result=nums.get(0);
		for(int i=1;i<nums.size();i++) {
			result-=nums.get(i);
		}
		return result;
	}



}
