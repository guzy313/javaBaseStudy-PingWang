package com.my.homework.homework2.subject13;

public class subjectRun {
    public static void main(String[] args) {
        Person[] people = new Person[4];
        people[0] = new Student("学生1",'男',25,"21");
        people[1] = new Student("学生2",'女',18,"11");
        people[2] = new Teacher("老师1",'男',32,10);
        people[3] = new Teacher("老师2",'女',22,1);

        people = sort(people);

        for (int i = 0; i < people.length; i++) {
            people[i].getInfo();
            System.out.println("----------------------");
        }

        System.out.println("----------------第13题结束----------------------");




    }

    public static Person[] sort(Person[] people){
        for (int i = people.length - 1; i > 0 ; i--) {
            for (int j = 0; j < i ; j++) {
                if(people[j+1].getAge() > people[j].getAge()){
                    Person person = people[j+1];
                    people[j+1] = people[j];
                    people[j] = person;
                }
            }
        }

        return people;
    }
}
