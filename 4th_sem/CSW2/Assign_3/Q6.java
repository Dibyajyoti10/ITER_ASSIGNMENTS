class Animal {
    private String name;
    private String color;
    private String type;
    Animal(String name, String color, String type) {
        this.name = name;
        this.color = color;
        this.type = type;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + (name != null ? name.hashCode() : 0);
        hash = 31 * hash + (color != null ? color.hashCode() : 0);
        hash = 31 * hash + (type != null ? type.hashCode() : 0);
        return hash;
    }
    @Override
    public String toString() {
        return "Name: " + name + ", Color: " + color + ", Type: " + type;
    }
}

public class Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Animal dog = new Animal("Dog", "Brown", "Pet");
	        Animal cat = new Animal("Cat", "White", "Pet");
	        Animal tiger = new Animal("Tiger", "Orange", "Wild");

	        // Print hash codes
	        System.out.println("Hash code for Dog: " + dog.hashCode());
	        System.out.println("Hash code for Cat: " + cat.hashCode());
	        System.out.println("Hash code for Tiger: " + tiger.hashCode());
	}

}
