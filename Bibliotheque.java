import java.util.ArrayList;
 //Q1: definitions les classes Document, Livre et Dictionnaire 
//Class Document
class Document{
    private final int numero;
  private final String titre;
    public Document(int numero, String titre) {
        this.numero = numero;
        this.titre = titre;}
 public int getNumero(){return numero; }
public String getTitre(){return titre; }
  @Override
public String toString(){return "Document[Numéro=" + numero + ", Titre=\"" + titre + "\"]";}}
// Classe Livre
class Livre extends Document {
    private final String auteur;
    @SuppressWarnings("FieldMayBeFinal")
    private int nombreDePages;
 public Livre(int numero, String titre, String auteur, int nombreDePages) {
    super(numero, titre);
      this.auteur = auteur;
     this.nombreDePages = nombreDePages; }
    public String getAuteur() {  return auteur; }
    @Override
    public String toString() {
        return "Livre[Numéro=" + getNumero()+",Titre=\""+getTitre() +"\", Auteur=\""+auteur+"\",Pages="+nombreDePages+"]";
    }}

//Classe Dictionnaire
class Dictionnaire extends Document {
    @SuppressWarnings("FieldMayBeFinal")
    private String langue;
    @SuppressWarnings("FieldMayBeFinal")
    private int nombreDeTomes;
    public Dictionnaire(int numero,String titre,String langue, int nombreDeTomes) {
        super(numero, titre);
        this.langue = langue;
        this.nombreDeTomes = nombreDeTomes; }
    public Dictionnaire(int numero, String titre) {
        super(numero, titre);
    }
    @Override
    public String toString() {
        return "Dictionnaire[Numéro="+getNumero()+",Titre=\""+ getTitre()+"\",Langue=\""+langue+"\", Tomes="+nombreDeTomes+"]";
     }}
//Classe ListeDeDocuments
class ListeDeDocuments {
    @SuppressWarnings("FieldMayBeFinal")
    private ArrayList<Document> documents;
    public ListeDeDocuments() {
        documents = new ArrayList<>();}
    public void ajouterDocument(Document doc) { documents.add(doc);}
 public void tousLesAuteurs() {
        for(Document doc:documents) {
            if (doc instanceof Livre livre) {
                System.out.println("Numéro: " + doc.getNumero() + ", Auteur: " + livre.getAuteur());
            } } }
    public void tousLesDocuments() {
        for(Document doc: documents) {
            System.out.println(doc);}
        }}
//Class Bibliotheque
public class Bibliotheque {
    public static void main(String[]args) {
        //Q2:Teste les classes dans la classe Bibliotheque
        Livre livre1 = new Livre(1, "Les Misérables", "Victor Hugo", 1232);
        Livre livre2 = new Livre(2, "Le Petit Prince", "Antoine de Saint-Exupéry", 96);
        Dictionnaire dictionnaire1 = new Dictionnaire(3, "Dictionnaire Larousse", "Français", 2);
        System.out.println(livre1);
        System.out.println(livre2);
        System.out.println(dictionnaire1);
        //Q3:Ajout des documents à ListeDeDocuments
        ListeDeDocuments liste = new ListeDeDocuments();
        liste.ajouterDocument(livre1);
        liste.ajouterDocument(livre2);
        liste.ajouterDocument(dictionnaire1);
        //Q4:Affichage tous les auteurs
        System.out.println("\nListe des auteurs:");
        liste.tousLesAuteurs();
        //Q5:Affichage tous les documents
        System.out.println("\nListe des documents:");
        liste.tousLesDocuments();
        //Q6:Teste ListeDeDocuments ajouté dans Bibliotheque .
    }}
