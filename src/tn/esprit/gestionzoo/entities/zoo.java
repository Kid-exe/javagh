package tn.esprit.gestionzoo.entities;

public class zoo {

    animal[] animals;
    private String name;
    private String city;
    private final int nbrCages=25;
    private int nbanimals;

    public int getNbanimals() {
        return nbanimals;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        if (name != null && !name.isEmpty()) {
            this.name = name;
        }
    }

    public zoo(String name, String city) {
        if (name != null && !name.isEmpty()) {
            this.name = name;
        } else {
            this.name = "Zoo sans nom";
        }

        this.city = city;
        animals = new animal[nbrCages];
        nbanimals = 0;
    }
    public void displayZoo(){
        System.out.println("nom du tn.esprit.gestionzoo.entities.zoo:"+name);
        System.out.println("city:"+city);
        System.out.println("nombres de cage:"+nbrCages);
    }

    @Override
    public String toString() {

        return "Nom du tn.esprit.gestionzoo.entities.zoo : " + name
                + ", Ville : " + city
                + ", Nombre de cages : " + nbrCages;
    }
    public boolean addAnimal(animal Animal){
        if (!full()) {
            if ( search(Animal) == -1) {
                animals[nbanimals] = Animal;
                nbanimals++;
                return true;
            }
        }
        return false;
    }

    public void affan(){
        int i=0;
        while(i<nbanimals){
            System.out.println(animals[i].getName());
            i++;
        }
    }

    public int search(animal an){
        int t=-1;
        int i=0;
        while(t==-1 && i<nbanimals){
            if (animals[i].getName().equals(an.getName())){
                t=i;
            }
            else {
                i++;
            }
        }
        return t;
    }

    public boolean remove(animal an){
        int i=search(an);
        if(i==-1){
            return false;
        }
        for(int n=i;n<nbanimals-1;n++){
            animals[n]=animals[n+1];
        }
        animals[nbanimals-1]=null;
        nbanimals--;
        return true;
    }

    public boolean full(){
        return nbanimals>=nbrCages;
    }
    public zoo compare(zoo z1,zoo z2){
        if(z1.nbanimals>z2.nbanimals){
            return z1;
        } else if (z1.nbanimals< z2.nbanimals) {
            return z2;
        }
        return null;
    }
}
