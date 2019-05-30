package animalKingdom;

public class Mammals extends AbstractAnimal
{

    public Mammals(int uniqueNumber, String name, int yearDiscover)
    {
        super(uniqueNumber, name, yearDiscover);
    
    }

    @Override
    public String move()
    {
        return "Walk";
    }

    @Override
    public String breath()
    {
        return "Lungs";
    }

    @Override
    public String reproduce()
    {
        return "Live Birth";
    }

    @Override
    public String toString()
    {
        return "Mammals{" +
                "name= " + name +
                ", number= " + uniqueNumber +
                ", Year Discovered= " + yearDiscover +
                '}';
    }
}