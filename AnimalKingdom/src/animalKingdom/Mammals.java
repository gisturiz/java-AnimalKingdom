package animalKingdom;

public class Mammals extends AbstractAnimal
{
    int uniqueNumber;
    String name;
    int yearDiscover;

    public Mammals(int uniqueNumber, String name, int yearDiscover)
    {
        this.uniqueNumber = uniqueNumber;
        this.name = name;
        this.yearDiscover = yearDiscover;
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