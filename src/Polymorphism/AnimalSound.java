package Polymorphism;

class AnimalSound {
	
	public void sound()
	{
		System.out.println("Animal Sound");
	}
}
class dog extends AnimalSound
{
	@Override
	public void sound()
	{
		System.out.println("Dog Barks");
	}
}
class cat extends AnimalSound
{
	@Override
	public void sound()
	{
		System.out.println("Cat Meows");
	}
}