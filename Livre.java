import java.util.Scanner;
// Définition de la classe Livre
public class Livre {
    // Attributs de la classe
    private String titre;
    private String auteur;
    private double prix;
    // Constructeur par défaut
    public Livre() {
        this.titre = "";
        this.auteur = "";
        this.prix = 0.0; }
    // Constructeur surchargé
    public Livre(String titre, String auteur, double prix) {
        this.titre = titre;
        this.auteur = auteur;
        this.prix = prix;}
    // Getters
    public String getTitre() { return titre; }
    public String getAuteur() {return auteur; }
    public double getPrix() {return prix;}
    // Setters
    public void setTitre(String titre) { this.titre = titre; }
    public void setAuteur(String auteur) {this.auteur = auteur; }
    public void setPrix(double prix) {this.prix = prix;}
    // afficher les informations du livre
    public void afficher() {
    System.out.println("Titre : " + titre);
        System.out.println("Auteur : " + auteur);
     System.out.println("Prix : " + prix + " DH");}
     public static void main(String[] args) {
        // Saisie des informations par l'utilisateur
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Entrez le titre du livre:");
            String titre = scanner.nextLine();
            System.out.print("Entrez l'auteur du livre: ");
            String auteur = scanner.nextLine();
            System.out.print("Entrez le prix du livre:");
            double prix = scanner.nextDouble();
            Livre monLivre = new Livre(titre, auteur, prix);
            System.out.println("\nLes informations du livre sont : ");
            monLivre.afficher();}}}
