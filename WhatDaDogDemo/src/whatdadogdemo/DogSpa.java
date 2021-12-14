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
public class DogSpa {
    private int telephoneNumber;
    private String address;

    public DogSpa() {
    }
 
    public DogSpa(int telephoneNumber, String address) {
        this.telephoneNumber = telephoneNumber;
        this.address = address;
    }

    public int getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(int telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    public void groom(DaDog DaDog){
        System.out.println("Grooming " + DaDog.getName());
        DaDog.setGroomed(true);
    }

    @Override
    public String toString() {
        return "DogSpa{" + "telephoneNumber=" + telephoneNumber + ", address=" + address + '}';
    }

    
    
    
    
    
}

