package generalRecap;

public class Camion extends Vehicule {
	int charge;
	double vitesseActuelle;

	@Override
	public void calculerPuissance() {
		// TODO Auto-generated method stub
		double puissance=(vitesseActuelle*charge)/6;
		System.out.println(puissance);

	}

	public Camion(double prix, String marque, String couleur, int charge, double vitesseActuelle) {
		super(prix, marque, couleur);
		this.charge = charge;
		this.vitesseActuelle = vitesseActuelle;
	}

	@Override
	public String toString() {
		return "Camion [charge=" + charge + ", vitesseActuelle=" + vitesseActuelle + ", getPrix()=" + getPrix()
				+ ", getMarque()=" + getMarque() + ", getCouleur()=" + getCouleur() + "]";
	}

}
