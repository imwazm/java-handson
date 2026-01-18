package Day1;

import java.util.ArrayList;
import java.util.Scanner;

public class Calculator {
		
	public ArrayList<Integer> input(Scanner scanner) {
		ArrayList<Integer> arr= new ArrayList<Integer>();
		System.out.print("Enter multiple numbers as desired: (type X when you "
				+ "finish the input to proceed calculations) \n");
		String ch=new String();
		while(true) {
			ch=scanner.next();
			if(ch.equalsIgnoreCase("X")) {
				break;
			}else {
				int nums=Integer.parseInt(ch);
				arr.add(nums);
			}
		}
		return arr;
	}
		

	public int add(ArrayList<Integer> nums) {
		if (nums.isEmpty()) {
		    System.out.println("No numbers entered!");
		    return 0;
		}
		int sum=0;
		for (int num: nums) {
			sum+=num;
		}
		return sum;
	}
	public int sub(ArrayList<Integer> nums) {
		if (nums.isEmpty()) {
		    System.out.println("No numbers entered!");
		    return 0;
		}
		int result=nums.get(0);
		for(int i=1;i<nums.size();i++) {
			result-=nums.get(i);
			
		}
		return result;
	}
	public int mul(ArrayList<Integer> nums) {
		if (nums.isEmpty()) {
		    System.out.println("No numbers entered!");
		    return 0;
		}
		int result=1;
		for(int num:nums) {
			result*=num;
		}
		return result;
	}
	public int div(ArrayList<Integer> nums) {
		if (nums.isEmpty()) {
		    System.out.println("No numbers entered!");
		    return 0;
		}
		int result=nums.get(0);
		try {
			for(int i=1;i<nums.size();i++) {
				if(nums.get(i)==0) {
					System.out.println("Error: Division by zero!");
					return 0;
				}
				result/=nums.get(i);
			}
			
		}catch (ArithmeticException e){
			System.out.println("Error: Division by zero!");
			return 0;
		}return result;
	}
	public int mod(ArrayList<Integer> nums) {
		if (nums.isEmpty()) {
		    System.out.println("No numbers entered!");
		    return 0;
		}
		int result=nums.get(0);
		try {
			for(int i=1;i<nums.size();i++) {
				if(nums.get(i)==0) {
					System.out.println("Error: Division by zero!");
					return 0;
				}

				result%=nums.get(i);
			}
		}catch (ArithmeticException e){
			System.out.println("Error: Division by zero!");
			return 0;
		}return result;
	}
	
	
	public static void main(String[] args) {
		    Scanner scanner=new Scanner(System.in);
		    Calculator calc=new Calculator();
		    
		    int opt=0;
			while(opt!=6) {
			    System.out.println("\nchoose: \n1)Add \n"
			    		+ "2)Subtract\n"
			    		+ "3)Multiply\n"
			    		+ "4)Divide\n"
			    		+ "5)Modulo\n"
			    		+ "6)Exit");
			    opt=scanner.nextInt();
			    if (opt==6) break;
			    if (opt < 1 || opt > 5) { 
			    	System.out.println("Invalid choice! Please select 1–6.");
			    	continue;
			    }
			    ArrayList<Integer> nums= calc.input(scanner);
			    
			    
			    switch (opt) {
			    case 1:
			    	System.out.print("\nAnswer: "+calc.add(nums));
			    	break;
			    case 2:
			    	System.out.print("\nAnswer: "+calc.sub(nums));
			    	break;
			    case 3:
			    	System.out.print("\nAnswer: "+calc.mul(nums));
			    	break;
			    case 4:
			    	System.out.print("\nAnswer: "+calc.div(nums));
			    	break;
			    case 5:
			    	System.out.print("\nAnswer: "+calc.mod(nums));
			    	break;
			    default: System.out.println("Invalid choice! Please select 1–6.");
			    }
		}
		    
			scanner.close();

		    }
	
		    
		    
	}

