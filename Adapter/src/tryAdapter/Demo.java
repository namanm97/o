public class Demo {
	public static void main(String args[])
	{
		Item i1=new Item("cycle",10,2500,new GST());
		i1.display();
		Item i2=new Item("cycle",10,2500,new MauriAdapter());
		i2.display();
	}
}