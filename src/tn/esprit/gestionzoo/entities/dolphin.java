package tn.esprit.gestionzoo.entities;

public class dolphin extends aquatic{
    protected float swimmingspeed;
    public dolphin(String family,String name,int age,boolean isMammal,String habitat,float swimmingspeed){
        super(family, name, age, isMammal, habitat);
        this.swimmingspeed=swimmingspeed;
    }

    public String toString(){
        return super.toString()
                +",Swimmingspeed:"+swimmingspeed;
    }

    @Override
    public void swim() {
        System.out.println("This dolphin is swimming.");
    }

}
