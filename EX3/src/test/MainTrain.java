package test;

import test.Q3.AbstractFactory;

public class MainTrain {
	
	public static class A{
		static int count=0;
		public A(){
			count++;
		}
	}
	
	public static class B extends A{}
	public static class C extends B{}
	public static class Employee{
		@SuppressWarnings("unused")
		private String name;
		public void setName(String name){
			this.name=name;
		}
	}
	
public static void main(String[] args) {
	GenericFactory<A> factory=new GenericFactory<A>();
	factory.insertProduct("a", A.class);
	factory.insertProduct("b", B.class);
	factory.insertProduct("c", C.class);
	A a=factory.getNewProduct("a");
	factory.getNewProduct("a");
	if(A.count!=2)
		System.out.println("failure getting the true number of instances");
	if(!a.getClass().equals(A.class))
		System.out.println("failure creating type A");
	if(!factory.getNewProduct("b").getClass().equals(B.class))
		System.out.println("failure creating type B");
	if(!factory.getNewProduct("c").getClass().equals(C.class))
		System.out.println("failure creating type C");
	//Goblin error=new Goblin(...); // cannot create goblins without the builder
	// note: the following code checks certain compile errors...
	new Goblin.GoblinBuilder("zoot","green").withSize(500).withIq((byte)40).build();
	Q3 q3=new Q3();
	AbstractFactory af=q3.new AbstractFactory1();
	if(!af.createA().get().equals("a1"))
		System.out.println("wrong implementation for AbstractFactory1 createA()"); // -5
	if(!af.createB().get().equals("b1"))
		System.out.println("wrong implementation for AbstractFactory1 createB()"); // -5
	af=q3.new AbstractFactory2();
	if(!af.createA().get().equals("a2"))
		System.out.println("wrong implementation for AbstractFactory2 createA()"); // -5
	if(!af.createB().get().equals("b2"))
		System.out.println("wrong implementation for AbstractFactory2 createB()"); // -5
	}
}