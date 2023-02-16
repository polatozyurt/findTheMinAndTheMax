import java.util.Scanner;
public class findMaxAndMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		System.out.print("Enter the number of integers you will enter: ");
		int numberOfItems =input.nextInt();
		int max= 0 ;
		int min = 0 ;
		int value ;
		for(int i = 0; i<numberOfItems ;i++) {
			value = input.nextInt();
			if(value>=max) {
				max= value ;
			}
			if(value <=min) {
				min = value ;
			}
		}
		System.out.println("Maximum value you have entered is "+max);
		System.out.print("Minimum value you have entered is "+min);

		
	
	}

}
