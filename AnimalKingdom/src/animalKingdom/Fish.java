package animalKingdom;

public class Fish extends AbstractAnimal
{
    int uniqueNumber;
    String name;
    int yearDiscover;

    public Fish(int uniqueNumber, String name, int yearDiscover)
    {
        this.uniqueNumber = uniqueNumber;
        this.name = name;
        this.yearDiscover = yearDiscover;
    }

    @Override
    public String move()
    {
        return "Swim";
    }

    @Override
    public String breath()
    {
        return "Gills";
    }

    @Override
    public String reproduce()
    {
        return "Eggs";
    }

    @Override
    public String toString()
    {
        return "Fish{" +
                "name= " + name +
                ", number= " + uniqueNumber +
                ", Year Discovered= " + yearDiscover +
                '}';
    }
}