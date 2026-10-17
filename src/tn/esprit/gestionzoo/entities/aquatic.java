package tn.esprit.gestionzoo.entities;

public class aquatic extends animal{
    protected String habitat;
    public aquatic(String family,String name,int age, boolean isMammal,String habitat){
        super(family, name, age, isMammal);
        this.habitat=habitat;
    }

    @Override
    public String toString(){
        return super.toString()
                +"Habitat:"+habitat;
    }

    public void swim() {
        System.out.println("This aquatic animal is swimming.");
    }
}
