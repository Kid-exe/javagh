package tn.esprit.gestionzoo.entities;

public class pernguin extends aquatic{
    protected float swimmingdepth;
    public pernguin(String family,String name,int age,boolean isMammal,String habitat,float swimmingdepth){
        super(family, name, age, isMammal, habitat);
        this.swimmingdepth=swimmingdepth;
    }

    @Override
    public String toString(){
        return super.toString()
                +",Swimmingdepth:"+swimmingdepth;
    }
}
