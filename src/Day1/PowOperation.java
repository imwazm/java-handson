package Day1;

import java.util.List;

public class PowOperation extends BaseOperation {

	@Override
	public int execute(List<Integer> nums) {
		validate(nums);
		if (nums.size()<2) {
			throw new IllegalArgumentException("Power requires atleast 2 numbers.");
		}
		
		double base=nums.get(0);
		for(int i=1;i<nums.size();i++) {
			
			if (nums.get(i)<0) {
				throw new IllegalArgumentException("Negatives not supported!");
			}
			double exponent=nums.get(i);
			double result=Math.pow(base, exponent);
			base=result;
			
		}
		int result =(int)base;
		return result;
	}

}
