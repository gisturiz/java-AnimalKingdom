package animalKingdom;

public class Birds extends AbstractAnimal
{
    public Birds(int uniqueNumber, String name, int yearDiscover)
    {
        super(uniqueNumber, name, yearDiscover);
    
    }

    @Override
    public String move()
    {
        return "Fly";
    }

    @Override
    public String breath()
    {
        return "Lungs";
    }

    @Override
    public String reproduce()
    {
        return "Eggs";
    }

    @Override
    public String toString()
    {
        return "Birds{" +
                "name= " + name +
                ", number= " + uniqueNumber +
                ", Year Discovered= " + yearDiscover +
                '}';
    }
}