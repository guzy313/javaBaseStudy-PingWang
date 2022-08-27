package com.polymorphic;

public class Master {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //喂食方法-喂狗
    public void feed(Animal animal,Food food){
        System.out.println(this.name+"给"+animal.getName()+"喂"+food.getName());
    }
//    //喂食方法-喂猫
//    public void feed(Cat cat,Fish fish){
//        System.out.println(this.name+"给"+cat.getName()+"喂"+fish.getName());
//    }


}
