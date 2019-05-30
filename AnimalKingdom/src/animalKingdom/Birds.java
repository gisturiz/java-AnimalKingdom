package animalKingdom;

public class Birds extends AbstractAnimal
{
    int uniqueNumber;
    String name;
    int yearDiscover;

    public Birds(int uniqueNumber, String name, int yearDiscover)
    {
        this.uniqueNumber = uniqueNumber;
        this.name = name;
        this.yearDiscover = yearDiscover;
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