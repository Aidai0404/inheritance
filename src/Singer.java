public class Singer extends Person{
    String bandName;

    public Singer(String name, String designation, String bandName) {
        super(name, designation);
        this.bandName = bandName;
    }

    @Override
    public String toString() {
        return "Singer: " +name+
                "\ndesignatiom: "+designation+
                "\nbandName: " + bandName;
    }

    @Override
    public void learn() {
        System.out.println("\nSinger's learning");
    }

    @Override
    public void walk() {
        System.out.println("Singer's walking");
    }

    @Override
    public void eat() {
        System.out.println("Singer's eating");
    }
    public void singing(){
        System.out.println("Singer's singing");
    }
}
