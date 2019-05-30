package animalKingdom;

import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
     	Mammals panda = new Mammals(1, "Panda", 1869);
     	Mammals zebra = new Mammals(2, "Zebra", 1778); 
     	Mammals koala = new Mammals(3, "Koala", 1816); 
     	Mammals sloth = new Mammals(4, "Sloth", 1804); 
     	Mammals armadillo = new Mammals(5, "Armadillo", 1758); 
     	Mammals racoon = new Mammals(6, "Racoon", 1758); 
     	Mammals bigfoot = new Mammals(7, "Bigfoot", 2021);

     	Birds pigeon = new Birds(8, "Pigeon", 1837);
     	Birds peacock = new Birds(9, "Peacock", 1821);
     	Birds toucan = new Birds(10, "Toucan", 1758);
     	Birds parrot = new Birds(11, "Parrot", 1824);
     	Birds swan = new Birds(12, "Swan", 1758);

     	Fish salmon = new Fish(13, "Salmon", 1758);
     	Fish catfish = new Fish(14, "Catfish", 1817);
     	Fish perch = new Fish(15, "Perch", 1758);

     	ArrayList<AbstractAnimal> myList = new ArrayList<AbstractAnimal>();
     	myList.add(panda);
     	myList.add(zebra);
     	myList.add(koala);
     	myList.add(sloth);
     	myList.add(armadillo);
     	myList.add(racoon);
     	myList.add(bigfoot);
     	myList.add(pigeon);
     	myList.add(peacock);
     	myList.add(toucan);
     	myList.add(parrot);
     	myList.add(swan);
     	myList.add(salmon);
     	myList.add(catfish);
     	myList.add(perch);

     	System.out.println("*** Untouched List ***");
     	System.out.println(myList.toString());

    }
}