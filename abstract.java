// heritage 

// Classe de base
public class Vehicule {
    public String marque;
    public String modele;
    public int annee;
    public String typeLocomotion;
    public String type;

    public Vehicule(String marque, String modele, int annee, String typeLocomotion, String type) {
        this.marque = marque;
        this.modele = modele;
        this.annee = annee;
        this.typeLocomotion = typeLocomotion;
        this.type = type;
    }

    public void afficherInfos() {
        System.out.println("Marque: " + marque);
        System.out.println("Modèle: " + modele);
        System.out.println("Année: " + annee);
        System.out.println("Type de locomotion: " + typeLocomotion);
        System.out.println("Type: " + type);
    }
}


// Classe dérivée Voiture
public class Voiture extends Vehicule {
    public String typeMoteur;

    public Voiture(String marque, String modele, int annee, String typeMoteur) {
        super(marque, modele, annee, "Roulant", "Voiture");
        this.typeMoteur = typeMoteur;
    }

    @Override
    public void afficherInfos() {
        super.afficherInfos();
        System.out.println("Type de moteur: " + typeMoteur);
    }
}

// Classe dérivée Camion
public class Camion extends Vehicule {
    public double capaciteChargement;

    public Camion(String marque, String modele, int annee, double capaciteChargement) {
        super(marque, modele, annee, "Roulant", "Camion");
        this.capaciteChargement = capaciteChargement;
    }

    @Override
    public void afficherInfos() {
        super.afficherInfos();
        System.out.println("Capacité de chargement: " + capaciteChargement + " tonnes");
    }
}
// classe abstraite

// une classe abstraite contient au moins une methode abstraite 
// une methode declaree  et n'a d'actions = une methode abstraite 

// contrat de service 
public abstract void demarrer () ; 


class Vehicule {

    String nom; 
    String marque ; 

    public Vehicule (String nom, String marque){
        this.nom = nom; 
        this.marque= marque; 
    }

    public void demarrer(){}
    public void avancer(){}

}


// classe abstraite 

abstract class vehicule {

    String nom ; 
    String marque ; 

    public Vehicule (String nom, String marque){

        this.nom = nom; 
        this.marque = marque; 

    }

    public abstract void demarrer(); 
    public void avancer(){}                ; 
}

// classe fille definit le corps de la methode demarrer une methode 
// abstraite

class Voiture extends Vehicule {
    public void activerAirBag() {}; 
    
    @Override
    public void demarrer() {} ; 

}



class Moto extends Vehicule {

    public void mettreLaBequille() {}; 
    
    @Override
    public void demarrer() {} ; 

}