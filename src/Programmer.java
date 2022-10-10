public class Programmer extends Person {
    String companyName;
    public Programmer(String name, String designation,String companyName) {
        super(name, designation);
        this.companyName=companyName;
    }

    @Override
    public String toString() {
        return "Programmer: " +name+
                "\ndesignation: "+designation+
                "\ncompanyName: " + companyName;
    }

    @Override
    public void learn() {
        System.out.println("\nProgrammer's learning");
    }

    @Override
    public void walk() {
        System.out.println("Programmer's walking");
    }

    @Override
    public void eat() {
        System.out.println("Programmer's eating");
    }
    public void coding(){
        System.out.println("Programmer's coding\n");
    }
}
