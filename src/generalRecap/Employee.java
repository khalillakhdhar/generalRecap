package generalRecap;

public class Employee extends Utilisateur {
private String grade;
private double salaire;
public String getGrade() {
	return grade;
}
public void setGrade(String grade) {
	this.grade = grade;
}
public double getSalaire() {
	return salaire;
}
public void setSalaire(double salaire) {
	this.salaire = salaire;
}
public Employee(String nom, String prenom, String email, String password, String grade, double salaire) {
	super(nom, prenom, email, password);
	this.grade = grade;
	this.salaire = salaire;
}
@Override
public String toString() {
	return "Employee [grade=" + grade + ", salaire=" + salaire + ", toString()=" + super.toString() + "]";
}


}
