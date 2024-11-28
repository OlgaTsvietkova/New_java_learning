package New;

public class Constructor {
    public static void main(String[] args) {
        Humans h1 = new Humans("Olga", 33);
        Humans h2 = new Humans("Nick", 27);
        h1.printNumberOfPeople();
        h2.printNumberOfPeople();
        Humans h3 = new Humans("Lena", 40);
        h3.printNumberOfPeople();

        System.out.println(h1);

    }
}


class Humans {

    private String name;
    private int age;
    //public static String description;
    private static int countPeople;

/*   public Humans(){
        this("Olga",12);
    }
    public Humans(String name) {
        System.out.println("Hello from 2nd constructor");
        this.name = name;    } */

    public Humans(String name, int age){
        this.name = name;
        this.age = age;
        countPeople++;
    }

    public String toString(){
        return name + "," + age;
    }

    public void setName (String name){ this.name = name;}
    public void setAge (int age) {this.age = age;}
    public void getAllFields(){
        System.out.println(name + ", " + age);
    }
    public void printNumberOfPeople(){
        System.out.println("Number of people is " + countPeople);
    }


}
