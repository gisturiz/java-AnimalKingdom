package animalKingdom;

public abstract class AbstractAnimal
{

    int uniqueNumber;
    String name;
    int yearDiscover;

    public AbstractAnimal(int uniqueNumber, String name, int yearDiscover)
    {
        this.uniqueNumber = uniqueNumber;
        this.name = name;
        this.yearDiscover = yearDiscover;
    }

    public abstract String move();
    public abstract String breath();
    public abstract String reproduce();

    public int getYear()
    {
        return yearDiscover;
    }

}