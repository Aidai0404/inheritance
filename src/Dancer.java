public class Dancer extends Person {
    String groupname;
    public Dancer(String name, String designation,String groupname) {
        super(name, designation);
        this.groupname=groupname;
    }

    @Override
    public String toString() {
        return "Dancer:" + name+
                "\ndesignation:"+designation+
                "\ngroupname:" + groupname;
    }

    @Override
    public void learn() {
        System.out.println("Dancer's learning");
    }

    @Override
    public void walk() {
        System.out.println("Dancer's walking");
    }

    @Override
    public void eat() {
        System.out.println("Dancer's eating");
    }
    public void dance(){
        System.out.println("Dancer's dancing");
    }

}
