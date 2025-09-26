package com.codegym.lesson03.pass_by_reference_and_pass_by_value.pass_by_reference;

public class students {
   int id;
   String name;
   public students(int id, String name){
    this.id = id;
    this.name = name;
   }
   @Override
   public String toString() {
    return "students [id=" + id + ", name=" + name + "]";
   }

   
}
