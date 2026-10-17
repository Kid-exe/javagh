package tn.esprit.gestionzoo.entities;

public class terrestrial extends animal{
    protected int nbrlegs;
    public terrestrial(String family,String name,int age,boolean isMammal,int nbrlegs){
        super(family, name, age, isMammal);
        this.nbrlegs=nbrlegs;
    }

    @Override
    public String toString(){
        return super.toString()
                +",Nombre de pattes:"+nbrlegs;
    }
}
