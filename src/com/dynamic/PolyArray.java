package com.dynamic;

public class PolyArray {
    public static void main(String[] args) {
        /*Person [] personArray= {new Person() ,new Student(),
                new Student(),new Teacher(),new Teacher()};
        personArray[3].setName("syq");
        personArray[3].setAge(3);
        personArray[3].say();

        ((Teacher)personArray[3]).teach();*/

        Person [] personArray = new Person[5];
        personArray[0] = new Person("1号人",11);
        personArray[1] = new Teacher("2号老师",23,8888);
        personArray[2] = new Teacher("3号老师",33,12000);
        personArray[3] = new Student("1号学生",8,66);
        personArray[4] = new Student("2号学生",19,90);

        for (int i = 0; i < personArray.length; i++) {
            if(personArray[i] instanceof Teacher){
                ((Teacher)personArray[i]).teach();
            }else if(personArray[i] instanceof Student){
                ((Student)personArray[i]).study();
            }else{
                System.out.println("类型为Person 没有专属方法");
            }
        }



    }
}
