package Day1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;





public class Calculator{
	
//	private void validate(List<Integer> nums) {
//		if (nums.isEmpty()) {
//		    throw new IllegalArgumentException("Empty input!");
//		}
//	}
	
		
	public List<Integer> input(Scanner scanner) {
		List<Integer> arr= new ArrayList<Integer>();
		System.out.print("Enter multiple numbers as desired: (type X when you "
				+ "finish the input to proceed calculations) \n");
		String ch=new String();
		while(true) {
			ch=scanner.next();
			if(ch.equalsIgnoreCase("X")) {
				break;
			}else {
				try {
				int nums=Integer.parseInt(ch);
				arr.add(nums);
				}
				catch(NumberFormatException e) {
					System.out.println("Invalid Input! Enter only numbers. Type X to finish!");
				}
			}
		}
		return arr;
	}
		

//	public int add(List<Integer> nums) {
//		validate(nums);
//		int sum=0;
//		for (int num: nums) {
//			sum+=num;
//		}
//		return sum;
//	}
//	public int sub(List<Integer> nums) {
//		validate(nums);
//		int result=nums.get(0);
//		for(int i=1;i<nums.size();i++) {
//			result-=nums.get(i);
//			
//		}
//		return result;
//	}
//	public int mul(List<Integer> nums) {
//		validate(nums);
//		int result=1;
//		for(int num:nums) {
//			result*=num;
//		}
//		return result;
//	}
//	public int div(List<Integer> nums) {
//		validate(nums);
//		int result=nums.get(0);
//		
//			for(int i=1;i<nums.size();i++) {
//				if(nums.get(i)==0) {
//					throw new ArithmeticException("Division by zero error!");
//				}
//				result/=nums.get(i);
//		}return result;
//	}
//	public int mod(List<Integer> nums) {
//		validate(nums);
//		int result=nums.get(0);
//			for(int i=1;i<nums.size();i++) {
//				if(nums.get(i)==0) {
//					throw new ArithmeticException("Division by zero error!");
//				}
//				result%=nums.get(i);
//			}
//		return result;
//	}
	
	
	public static void main(String[] args) {
		    Scanner scanner=new Scanner(System.in);
		    Calculator calc=new Calculator();
		    
		    int opt=0;
		    Map<Integer, Operation> operations=new HashMap<>();
		    CalculatorService service=new CalculatorService(operations);

		    operations.put(1, new AddOperation());
		    operations.put(2, new SubOperation());
		    operations.put(3, new MulOperation());
		    operations.put(4, new DivOperation());
		    operations.put(5, new ModOperation());
		    operations.put(6, new PowOperation());
			while(opt!=7) {
			    System.out.println("\nChoose: \n1)Add \n"
			    		+ "2)Subtract\n"
			    		+ "3)Multiply\n"
			    		+ "4)Divide\n"
			    		+ "5)Modulo\n"
			    		+ "6)Power\n"
			    		+ "7)Exit");
			    String choice=scanner.next();
			    try{
			    	opt=Integer.parseInt(choice);
			    }catch(NumberFormatException e) {
			    	System.out.println("Invalid Input!");
			    	continue;
			    }
			    if (opt==7) break;
			    if (opt < 1 || opt > 6) { 
			    	System.out.println("Invalid choice! Please select 1–7.");
			    	continue;
			    }
			    List<Integer> nums= calc.input(scanner);
			    
			    
			    try {
				    
				    System.out.println("Answer: "+service.calculate(nums, opt));
			    }catch(IllegalArgumentException e) {
			    	System.out.println(e.getMessage());
			    }
			   
			    
			    
			    
//			    switch (opt) {
//			    case 1:
//			    	try {
//			    		System.out.print("\nAnswer: "+calc.add(nums));
//			    		break;
//			    	}catch(IllegalArgumentException e){
//			    		System.out.print(e.getMessage());
//			    	}
//			    	
//			    case 2:
//			    	try {
//				    	System.out.print("\nAnswer: "+calc.sub(nums));
//				    	break;
//				    	}catch(IllegalArgumentException e){
//				    		System.out.print(e.getMessage());
//				    	}
//			    case 3:
//			    	try {
//				    	System.out.print("\nAnswer: "+calc.mul(nums));
//				    	break;
//				    	}catch(IllegalArgumentException e){
//				    		System.out.print(e.getMessage());
//				    	}
//			    case 4:
//			    	try {
//				    	System.out.print("\nAnswer: "+calc.div(nums));
//				    	break;
//				    	}catch(IllegalArgumentException e){
//				    		System.out.print(e.getMessage());
//				    	}
//			    case 5:
//			    	try {
//				    	System.out.print("\nAnswer: "+calc.mod(nums));
//				    	break;
//				    	}catch(IllegalArgumentException e){
//				    		System.out.print(e.getMessage());
//				    	}
//			    	
//			    }
			    
//			    try {
//			    	switch(opt) {
//			    	case 1 -> System.out.print("\nAnswer: "+calc.add(nums));
//			    	case 2 -> System.out.print("\nAnswer: "+calc.sub(nums));
//			    	case 3 -> System.out.print("\nAnswer: "+calc.mul(nums));
//			    	case 4 -> System.out.print("\nAnswer: "+calc.div(nums));
//			    	case 5 -> System.out.print("\nAnswer: "+calc.mod(nums));
//			    	}
//			    }catch(IllegalArgumentException | ArithmeticException e){
//			    	System.out.println(e.getMessage());
//			    	
//			    }
		
		    
		

		    


}
			scanner.close();
			
	}}
	
	
		    
		    
	

