package generalRecap;

public abstract class Vehicule {
	private double prix;
	private String marque;
	private String couleur;
	
	public double getPrix() {
		return prix;
	}
	public void setPrix(double prix) {
		this.prix = prix;
	}
	public String getMarque() {
		return marque;
	}
	public void setMarque(String marque) {
		this.marque = marque;
	}
	public String getCouleur() {
		return couleur;
	}
	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}
	public abstract void calculerPuissance();
	public Vehicule() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Vehicule(double prix, String marque, String couleur) {
		super();
		this.prix = prix;
		this.marque = marque;
		this.couleur = couleur;
	}

}
