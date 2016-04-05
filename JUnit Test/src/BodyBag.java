
public class BodyBag 
{
	private Person[] personArr;
	private int count;
	public BodyBag(int maxSize)
	{
		personArr = new Person[maxSize];
		count = 0;
	}
	public void add(Person person)
	{
		//deep copy
		personArr[count++] = new Person(person);
		//shallow copy
		personArr[count++] = person;
	}
	public Person findById(int id)
	{
		int i;
		for(i = 0; i < count; i++)
			if(personArr[i].getId() == id)
				break;
		if(i == count)
			return null;
		else
			return personArr[i];
	}
	public Person removeByID(int id)
	{
		int i = 0;
		for(i = 0; i < count; i++)
			if(personArr[i].getId() == id)
				break;
		if(i == count)
			return null;
		else
		{
			Person person = personArr[i];
			for(int k = i; k < count; k++)
				personArr[k] = personArr[k + 1];
			personArr[count--] = null;
			return person;
		}
		
	}
}
