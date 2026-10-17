package tn.esprit.gestionzoo.entities;

public class animal {
    protected String family;
    protected String name;
    protected int age;
    protected boolean isMammal;

    public animal() {
    }

    public String getName() {
        return name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
            if (age>0){
                this.age=age;
            }
    }
    public animal(String family, String name, int age, boolean isMammal) {
        this.family=family;
        this.name=name;
        if(age>0) {
            this.age = age;
        }
        else {
            this.age=1;
        }
        this.isMammal=isMammal;
    }

    public String toString() {

        return "Famille : " + family
                + ", Nom : " + name
                + ", Age : " + age
                + ", Mammifère : " + isMammal;
    }
}
