package Day1;

import java.util.List;

public class DivOperation extends BaseOperation{

	@Override
	public int execute(List<Integer> nums) {
		validate(nums);
		int result=nums.get(0);
		for(int i=1;i<nums.size();i++) {
			if(nums.get(i)==0) {
				throw new ArithmeticException("Division by zero error!");
			}
			result/=nums.get(i);
		}
		return result;
	}
	

}
