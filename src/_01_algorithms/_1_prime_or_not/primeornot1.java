package _01_algorithms._1_prime_or_not;

import javax.swing.JOptionPane;

public class primeornot1 {


public static void main(String[] args) {

	String prime=JOptionPane.showInputDialog("Choose a number.");
	int num=Integer.parseInt(prime);
	boolean isprime=true;
	for(int i=2; i<num;i++) {
		if (num%i==0) {
			isprime=false;
			break;
		}
		
	}
	if(isprime) {
	JOptionPane.showMessageDialog(null,"Your number is prime");
	}
	
	else {
		JOptionPane.showMessageDialog(null,"Your number is not prime");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}