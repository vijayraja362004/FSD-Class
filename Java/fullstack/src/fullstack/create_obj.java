package fullstack;

public class create_obj {
	    String name;
	    int age;
	    public create_obj (String name, int age) {
	        this.name = name;
	        this.age = age;
	    }
    public static void main(String[] args) {
        create_obj obj = new create_obj ("John", 30);
        System.out.println("Name: " + obj.name);
        System.out.println(" Age: " + obj.age);

    }
}
