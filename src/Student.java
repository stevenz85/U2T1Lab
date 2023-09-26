public class Student {


    private String name;


    private int age;


    private String favSubject;


    public Student(String n, int a, String f) {
        name = n;
        age = a;
        favSubject = f;
    }

    public void introduce() {
        System.out.println("Hello! My name is " + name + ", and I am " + age + " years old.");
        System.out.println("My favorite subject is " + favSubject + ".");
    }


    public void school() {
        if (age < 5) {
            System.out.println("I don't go to school.");
        } else if (age < 11) {
            System.out.println("I go to elementary school.");
        } else if (age < 14){
            System.out.println("I go to middle school.");
        } else if (age < 18){
            System.out.println("I go to high school.");
        } else {
            System.out.println("I graduated from school already");
        }
    }
}

