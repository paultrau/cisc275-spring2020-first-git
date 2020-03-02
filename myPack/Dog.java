package myPack;

public class Dog extends Animal
{
	public Dog(String s, int l)
	{
		super(l,s);
	}
	
	public String toString()
	{
		String returnThis = "(" + name +"," +legs+")";
		return returnThis;
	}
}