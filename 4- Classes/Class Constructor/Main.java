
public class Main {

  public static void main(String[] args) {

	Fruit obj1 = new Fruit("Orange");
    obj1.eat();
	
	Fruit obj2 = new Fruit("Apple");
	obj2.peel();
    obj2.eat();
	
  }
  
}


class Fruit {
	
	public String name;
	public boolean peeled = false;

	// Fruit Constructor
	public Fruit(String name){
		this.name = name;
	}
	
	public void peel(){
		this.peeled = true;
		System.out.println("Peeled the " + " " + this.name);
	}

	public void eat(){
		if(this.peeled){System.out.println("Ate the " + this.name);}
		else{System.out.println("Please peel the " + this.name + " first");}
	}

}


/*
Please peel the Orange first
Peeled the  Apple
Please peel the Apple first
*/