package enums;

public enum Jour {

    LUNDI("Lundi"),
    MARDI("Mardi"),
    MERCREDI("Mercredi"),
    JEUDI("Jeudi"),
    VENDREDI("Vendredi"),
    SAMEDI("Samedi"),
    DIMANCHE("Dimanche");

    private String nom;

    private Jour(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }
}
