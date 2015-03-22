/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Animal{

   public void eat(){
      System.out.println("Animals eat");
   }
}

class Dog extends Animal{

   public void move(){
      super.eat(); // invokes the super class method
      System.out.println("Dogs eat meat");
   }
}

