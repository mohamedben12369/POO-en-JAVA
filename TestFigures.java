import java.util.ArrayList;
import java.util.List;
//Class Figure
abstract class Figure{
    private static final List<Figure> instances = new ArrayList<>(); //Stockage toutes les instances de Figure et sous-classes
    private final int abscisse;
    private final int ordonnee;
    private final int couleur;
    public Figure(int abscisse, int ordonnee, int couleur) {
        this.abscisse = abscisse;
        this.ordonnee = ordonnee;
        this.couleur = couleur;
        //Ajout chaque instance cree au vecteur
        instances.add(this); }
public int getAbscisse(){return abscisse; }
    public int getOrdonnee(){return ordonnee; }
    public int getCouleur(){return couleur;}
    public static List<Figure> getInstances() {
return new ArrayList<>(instances); //une copie pour eviter des modifications non désirées
    }
    @Override
    public String toString(){
     return String.format("%s[abscisse=%d,ordonnee=%d,couleur=%d]",getClass().getSimpleName(),abscisse,ordonnee,couleur);
}}
//Classe Carre
class Carre extends Figure{
    private final int cote;
 public Carre(int abscisse, int ordonnee, int couleur, int cote){
    super(abscisse, ordonnee, couleur);
    this.cote = cote;
    }
    public int getCote(){return cote;}
     @Override
    public String toString() {
        return String.format("Carre[abscisse=%d, ordonnee=%d, couleur=%d, cote=%d]", getAbscisse(), getOrdonnee(), getCouleur(), cote);
    }}
//Classe Rectangle
class Rectangle extends Figure {
    private final int longueur;
 private final int largeur;
    public Rectangle(int abscisse, int ordonnee, int couleur, int longueur, int largeur) {
        super(abscisse,ordonnee,couleur);
this.longueur=longueur;
this.largeur=largeur;
    }
    public int getLongueur() { return longueur; }
    public int getLargeur() { return largeur;}
    @Override
    public String toString() {
        return String.format("Rectangle[abscisse=%d, ordonnee=%d, couleur=%d, longueur=%d, largeur=%d]", getAbscisse(), getOrdonnee(), getCouleur(), longueur, largeur);
    }
}
//Class principale pour teste
public class TestFigures {
    public static void main(String[] args) {
//Création des instances
             @SuppressWarnings("unused")
               Rectangle rectangle1;
 rectangle1=new Rectangle(5,6,300,30,40);
                @SuppressWarnings("unused")
Carre carre;
       carre= new Carre(5, 5, 300,5);
        // Affichage des instances spécifiques
        System.out.println("Instances de Carre:");
 for (Figure figure:Figure.getInstances())
        {if (figure instanceof Carre) {
         System.out.println(figure);
        }
        }
        System.out.println("\nInstances de Rectangle:");
        for (Figure figure : Figure.getInstances())
        {
  if (figure instanceof Rectangle) {System.out.println(figure);}
 }
 System.out.println("\nToutes les instances de Figure:");
 for (Figure figure :Figure.getInstances()) {System.out.println(figure);}
    }
}
