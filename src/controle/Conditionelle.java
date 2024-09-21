package controle;

public class Conditionelle {
	public static void main(String args[])
	{
		int age=20;
		if(age<18)
			System.out.println("mineur");
		else if(age<70)
			System.out.println("majeur");
		else
			System.out.println("senior");
		int jour=2;
		switch (jour) {
		case 1: {
			
			System.out.println("lundi");
			break;
		}
		case 2:
			{System.out.println("mardi");
			break;
			}
			
		case 3:
		{
			System.out.println("mardi");
			break;
		}	
		default:
			throw new IllegalArgumentException("Unexpected value: " + jour);
		}
		
	}

}
