public class Main {
    public static void main(String[] args) {
       Dancer dancer=new Dancer("Aijana","ballerina","Swans");
        System.out.println("1.");
        System.out.println(dancer+"\n");
        dancer.learn();
        dancer.walk();
        dancer.eat();
        dancer.dance();
        Programmer pro=new Programmer("Narbutai","Java-developer","Apple");
        System.out.println("2.");
        System.out.println(pro);
        pro.learn();
        pro.walk();
        pro.eat();
        pro.coding();
        Singer singer=new Singer("Тилль Линдеман","вокалист","Rammstein");
     System.out.println("3.");
     System.out.println(singer);
     singer.learn();
     singer.walk();
     singer.eat();
     singer.singing();
    }
}