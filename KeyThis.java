package New;

public class KeyThis {
    public static void main(String[] args) {
        Human human1 = new Human();
        human1.setName("Olga");
        human1.setAge(23);
        human1.getInfo();

    }

}

class Human {
    String name;
    int age;

    public void setName(String name){
        this.name = name;   //ключове слово this - щоб звернутись до елемента класса
    }

    public void setAge(int age){
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public void getInfo(){
        System.out.println(name + ", " + age);
    }


}
