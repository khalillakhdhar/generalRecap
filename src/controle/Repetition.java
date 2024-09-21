package controle;

import java.util.ArrayList;
import java.util.List;

public class Repetition {
public static void main(String args[])
{
	
int f=5;
int fact=1;
for(int i=2;i<=f;i++)
{
// for(compteur=initialisation; condition ;incrémentation)
	fact*=i; // fact=fact*i;
	
}
System.out.println("la factoriel est: "+fact);
List<String> fruits = new ArrayList<String>();
fruits.add("pomme");
fruits.add("orange");
fruits.add("banane");
for(String fruit: fruits)
{
	System.out.println(fruit);
}
List<String> voitures=new ArrayList<String>();
voitures.add("BMW");
voitures.add("VOLVO");
voitures.add("MERCEDES");
voitures.forEach(car->{
	System.out.println(car.toLowerCase());
});
}

}

