package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.animal;
import tn.esprit.gestionzoo.entities.zoo;
import tn.esprit.gestionzoo.entities.aquatic;
import tn.esprit.gestionzoo.entities.terrestrial;
import tn.esprit.gestionzoo.entities.dolphin;
import tn.esprit.gestionzoo.entities.pernguin;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        animal lion=new animal("felidae","simba",5,true);
        animal tigre = new animal("Felidae", "Tigrou", 4, true);
        animal serpent = new animal("Pythonidae", "Kaa", 3, false);
        zoo myZoo=new zoo("tn.esprit.gestionzoo.entities.zoo de tunis","tunis");
        zoo zoo2 = new zoo("Zoo de Sousse", "Sousse");
        aquatic aqua=new aquatic("Poissons", "Nemo", 2, false, "océan");
        dolphin dop=new dolphin("Delphinidae", "Flipper", 8, true, "mer", 35.5f);
        terrestrial ter=new terrestrial("Felidae", "Simba", 5, true, 4);
        pernguin pen=new pernguin("Spheniscidae", "Pingu", 4, false, "océan", 20.0f);

       /**for (int i=0;i<24;i++){
           animal an=new animal("famille"+i,"tn.esprit.gestionzoo.entities.animal"+i,2,true);
           boolean result = myZoo.addAnimal(an);
           //System.out.println("Animal " + i + " : " + result);
       }
       myZoo.addAnimal(tigre);

       System.out.println("----------------index:"+myZoo.search(tigre));

       myZoo.affan();
       System.out.println("-----------------Nombre d'animaux : " + myZoo.getNbanimals());

       myZoo.remove(tigre);
       System.out.println("-----------------Nombre d'animaux : " + myZoo.getNbanimals());
       myZoo.affan();
        if(myZoo.full()){
            System.out.println("m3abi");
        }
        else{
            System.out.println("mezel");
        }
        zoo2.addAnimal(serpent);
        zoo res=myZoo.compare(myZoo,zoo2);
        if (res != null) {
            System.out.println("Le tn.esprit.gestionzoo.entities.zoo avec le plus d'animaux est : "
                    + res.getName());
        } else {
            System.out.println("Les deux zoos ont le même nombre d'animaux.");
        }

        //myZoo.displayZoo();

        //System.out.println(myZoo);
        //System.out.println(lion);**/
        System.out.println(aqua);
        System.out.println(ter);
        System.out.println(dop);
        System.out.println(pen);
        System.out.println("----------------------------------");
        aqua.swim();
        dop.swim();
        pen.swim();
    }
}