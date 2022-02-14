package person;
public class Person {
    // Attributes
    public String name;
    public int age;
    public String address;
    public String dob;   

    public String getPersonInfo(){
        // Some logic here
        return "PersonInfo";
    }
    
    public void work(){
        System.out.println("Inside work method");
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Student s1 = new Student();
        s1.work();
        s1.name = "Josh";
        s1.age = 25;
    }
}