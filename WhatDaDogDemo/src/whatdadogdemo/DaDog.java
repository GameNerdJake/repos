/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package whatdadogdemo;

/**
 *
 * @author jevans
 */
public class DaDog {

    private String name;
    private int age;
    private boolean groomed = false;
    private static int dogsCreated;

    public DaDog(String name, int age) {
        this.name = name;
        this.age = age;
        dogsCreated+= 1;
    }

    public DaDog(String name) {
        this.name = name;
        dogsCreated+= 1;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isGroomed() {
        return groomed;
    }

    public void setGroomed(boolean groomed) {
        this.groomed = groomed;
    }

    @Override
    public String toString() {
        return "DaDog{" + "name=" + name + ", age=" + age + '}';
    }
    

    
    
    
}
