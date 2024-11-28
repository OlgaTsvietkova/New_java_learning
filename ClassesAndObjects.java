package New;

import javax.swing.*;

public class ClassesAndObjects {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setName("Olga");
        person1.setAge(10);
        //System.out.println("Output from main method is: " + person1.getName());
        //System.out.println("Output from main method is: " + person1.getAge());
        //person1.speak();

        }
}

class Person {
    private String name;
    private int age;
    //Setter for name
    public void setName(String userName){
        if (userName.isEmpty()){
            System.out.println("Please enter your name");
        } else {
        name = userName;}
    }
    //Getter for name
    public String getName(){
        return name;
    }
    //Setter for age
    public void setAge(int userAge){
        if (userAge<0){
            System.out.println("Age can't be less then zero!");
        } else {
        age = userAge;}
    }
    //Getter for age
    public int getAge(){
        return age;
    }

      int calculateYearToRetirement(){
        int years = 65-age;
        return years;
    }

    void speak(){
        //for(int i = 0; i<3; i++)
        {
        System.out.println("My name is "+ name + ", and my age is: "+ age); }}


    void sayHello(){
        System.out.println("Hello!");  }


}
