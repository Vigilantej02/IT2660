// forgive me if I don't write out every method that's standard (i.e. gets/sets) This has been very frustrating.
public class Character
{
    String fullName;
    int age;
    Character()
    {
        fullName = "John Doe";
        age = 0;
    }
    Character(String n, int a)
    {
        fullName = n;
        age = a;
    }
    public void deepCopy(Character c2)
    {
        fullName = c2.fullName;
        age = c2.age;
    }
    public String toString()
    {
        return "This characters Name is: \n" + fullName + "\n" + "This characters age is: \n" + age + "\n";
    }
}
