
class Document {
    private final int numero;
    @SuppressWarnings("FieldMayBeFinal")
    private String titre;

    public Document(int numero, String titre) {
        this.numero = numero;
        this.titre = titre;
    }

    public int getNumero() {
        return numero;
    }

    public String getTitre() {
        return titre;
    }

    @Override
    public String toString() {
        return "Document[Numéro=" + numero + ", Titre=\"" + titre + "\"]";
    }
}
