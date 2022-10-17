
public class Main {

  public static void main(String[] args) {

	Fruit obj1 = new Fruit();
	obj1.name = "Orange";
    obj1.eat();
	
	Fruit obj2 = new Fruit();
	obj2.name = "Apple";
	obj2.peel();
    obj2.eat();
	
  }
  
}

class Fruit {
	
	public String name;
	public boolean peeled = false;

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
Output:
Please peel the Orange first
Peeled the  Apple
Ate the  Apple
*/



