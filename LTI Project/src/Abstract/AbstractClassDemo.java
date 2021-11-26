package Abstract;

public class AbstractClassDemo {

	public static void main(String[] args) {
		Dog rocky=new Dog();
		rocky.sound();
		rocky.classInfo("dog");
		System.out.println("===================================");
		 System.out.println("creating lion class obj");
         Lion simba=new Lion();
         simba.sound();
         simba.classInfo("lion");

	}

}
abstract class Animal
{
	int legs=4;
	abstract void sound();
	
	void classInfo(String type)
	{
		System.out.println("I belong to "+type+" family");
	}
}
class Dog extends Animal{
	void sound()
	{
		System.out.println("Woof Woof");
		System.out.println("I have "+legs+" legs");
	}
}
class Lion extends Animal{
	void sound()
	{
		System.out.println("Roarrr");
		System.out.println("I have "+legs+" legs");
	}
}