package animalKingdom;

public class Fish extends AbstractAnimal
{

    public Fish(int uniqueNumber, String name, int yearDiscover)
    {
        super(uniqueNumber, name, yearDiscover);
    
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