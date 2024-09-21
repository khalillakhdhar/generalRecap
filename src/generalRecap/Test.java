package generalRecap;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Utilisateur u1=new Utilisateur("user1", "username1", "email1", "azerty");
		System.out.println(u1.toString());
		Employee em1=new Employee("khalil", "lakhdhar","user@gmail.com", "pass123", "formateur", 3200);
		System.out.println(em1.toString()); // polymorphysme => toString est prédéfinie
		//Vehicule v1=new Vehicule(); interdit car vehicule abstract
		em1.getNom();
		//abstraction
		Camion c=new Camion(90000, "toyota", "noir", 20000, 80);
		System.out.println(c.toString());
		c.calculerPuissance();

	}



}
