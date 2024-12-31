import java.time.LocalDate;
import java.util.Scanner;
public class Employe {
    //Attributs de l'EMPLOYE
    private int matricule;
    private String nom;
    private String prenom;
    private int anneeNaissance;
    private int anneeEmbauche;
    private double salaire;
    // Constructeur par défaut
    public Employe(){
        this.matricule = 0;
     this.nom = "";
     this.prenom = "";
    this.anneeNaissance = 0;
        this.anneeEmbauche = 0;
     this.salaire = 0.0;
    }
    //Constructeur surchargé
    public Employe(int matricule,String nom,String prenom,int anneeNaissance,int anneeEmbauche,double salaire) 
    { this.matricule = matricule;
    this.nom = nom;
    this.prenom = prenom;
     this.anneeNaissance = anneeNaissance;
        this.anneeEmbauche = anneeEmbauche;
    this.salaire = salaire;
    }
    //getters
    public int getMatricule() { return matricule;}
    public String getNom() { return nom;}
    public String getPrenom() {return prenom; }
    public int getAnneeNaissance() {return anneeNaissance;}
    public int getAnneeEmbauche() {return anneeEmbauche;}
    public double getSalaire() {return salaire; }
    //setters
    public void setMatricule(int matricule) { this.matricule=matricule;}
    public void setNom(String nom) {this.nom=nom;}
    public void setPrenom(String prenom) { this.prenom=prenom; }
    public void setAnneeNaissance(int anneeNaissance) {this.anneeNaissance = anneeNaissance;}
    public void setAnneeEmbauche(int anneeEmbauche) {this.anneeEmbauche = anneeEmbauche;}
    public void setSalaire(double salaire) {this.salaire = salaire;}
    //l'ancienneté
    public int getAnciennete() { int currentYear = LocalDate.now().getYear();return currentYear-anneeEmbauche; }
    //l'âge de l'EMPLOYE
    public int getAge() { int currentYear = LocalDate.now().getYear();return currentYear-anneeNaissance; }
    //augmenter le salaire
    public void AugmentationDuSalaire() {
        int anciennete = getAnciennete();
        if (anciennete<5) {
            salaire += salaire*0.02; //Augmentation de 2%
        } else if (anciennete<10) { salaire+=salaire*0.05; //Augmentation de 5%
        } else {salaire+=salaire*0.10;}//Augmentationde10%
}
//afficher les informations de l'EMPLOYE
public void AfficherEmploye() {
 System.out.println("Matricule : " + matricule);
 System.out.println("Nom : " + nom);
 System.out.println("Prénom : " + prenom);
 System.out.println("Année de naissance : " + anneeNaissance);
 System.out.println("Année d'embauche : " + anneeEmbauche);
 System.out.println("Salaire : " + salaire + " DH"); 
 System.out.println("Âge : " + getAge() + " ans");
 System.out.println("Ancienneté : " + getAnciennete() + " ans");
    }
  
    public static void main(String[] args) {
 // Saisie des informations de l'EMPLOYE
        try (Scanner scanner = new Scanner(System.in)) {
        System.out.print("le matricule de l'EMPLOYE : ");
            int matricule = scanner.nextInt();
              scanner.nextLine(); 
                System.out.print("le nom de l'EMPLOYE : ");
            String nom = scanner.nextLine();
             System.out.print(" le prénom de l'EMPLOYE : ");
            String prenom = scanner.nextLine();
            System.out.print("l'année de naissance de l'EMPLOYE : ");
             int anneeNaissance = scanner.nextInt();
            System.out.print(" l'année d'embauche de l'EMPLOYE : ");
             int anneeEmbauche = scanner.nextInt();
            System.out.print("le salaire de l'EMPLOYE :");
             double salaire = scanner.nextDouble();
    //Création d'un objet Employe
             Employe employe = new Employe(matricule, nom, prenom, anneeNaissance, anneeEmbauche, salaire);
  //des informations de l'EMPLOYE avant augmentation
                System.out.println("\nInformations de l'EMPLOYE avant augmentation :");
                employe.AfficherEmploye();
    //Augmentation du salaire
                 employe.AugmentationDuSalaire();
    //des informations de l'EMPLOYE après augmentation
                 System.out.println("\nInformations de l'EMPLOYE après augmentation de salaire :");
                  employe.AfficherEmploye();}}}
