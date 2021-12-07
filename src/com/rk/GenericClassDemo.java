
package com.rk;

public class GenericClassDemo {

    public static void main(String[] args) {
        
        // Demo 1
        System.out.println("***Demo 1****");
        MyGeneric<String> kota = new MyGeneric<String>();
        kota.push("Medan");
        kota.push("Yogya");
        kota.push("Semarang");
        
        //tampilkan data
        while(!kota.isEmpty()){
            String item = kota.pop();
            System.out.println(item);
        }
        
        // Demo 2
        System.out.println("***Demo 2****");
        MyGeneric<MyEntry<Integer,String>> buah = new MyGeneric<>();
        buah.push(new MyEntry<Integer,String>(3,"Mangga"));
        buah.push(new MyEntry<Integer,String>(4,"Rambutan"));
        buah.push(new MyEntry<Integer,String>(5,"Pisang"));
        buah.push(new MyEntry<Integer,String>(6,"Anggur"));
        buah.push(new MyEntry<Integer,String>(7,"Sirsak"));
        
        //tampilkan data
        while(!buah.isEmpty()){            
            System.out.println(buah.pop());
        } 
    }
}
