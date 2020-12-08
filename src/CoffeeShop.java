import java.text.DecimalFormat;
import java.util.Scanner;

public class CoffeeShop {

	public static int small,medium,large,chocolate,asperso,macchiato;
	
    public static void SellCoffee() {
    	
        Scanner input = new Scanner (System.in);
		
		System.out.println("Select the flavor : ");
		System.out.println("1. Chocolate");
		System.out.println("2. Asperse");
		System.out.println("3. Macchiato");
		int flavor = input.nextInt();
		System.out.println("Select the Size of cup : ");
		System.out.println("1. Small");
		System.out.println("2. Medium");
		System.out.println("3. Large");
		int size = input.nextInt();
    	
		NumberOfCupSize(size);
		System.out.println();
		TotalNumberOfCoffee(flavor);
		System.out.println();
		TotalMoney();
		System.out.println();
		
    } 
	
    public static void NumberOfCupSize(int size) {
    	
    	if (size==1) {
    		
    		small++;
    	}
        if (size==2) {
    		
        	medium++;
    	}
        if (size==3) {
	
        	large++;
        }
        System.out.println("Small coffee sold : "+small);
		System.out.println("Medium coffee sold : "+medium);
		System.out.println("Large coffee sold : "+large);
    	
    }
    
    public static void TotalNumberOfCoffee(int flavor) {
    	
        if (flavor==1) {
    		
        	chocolate++;
    	}
        if (flavor==2) {
    		
        	asperso++;
    	}
        if (flavor==3) {
	
        	macchiato++;
        }
        System.out.println("Chocolate coffee sold : "+chocolate);
		System.out.println("Asperso coffee sold : "+asperso);
		System.out.println("Macchiato coffee sold : "+macchiato);
    	
    	
    }
	
    public static void TotalMoney() {
    	DecimalFormat df = new DecimalFormat(".00");
    	System.out.println("Total money for small coffee : "+df.format(small*2.25));
		System.out.println("Total money for medium coffee : "+df.format(medium*3.25));
		System.out.println("Total money for large coffee : "+df.format(large*4.15));
		System.out.println("Total money  : "+df.format((small*2.25)+(medium*3.25)+(large*4.15)));
    	
    }
    
	public static void main(String[] args) {
		while(true) {
		SellCoffee();
		}
	}

}
