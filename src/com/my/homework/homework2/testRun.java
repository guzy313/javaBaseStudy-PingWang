package com.my.homework.homework2;

public class testRun {
    public static void main(String[] args) {
         /*
        5.设计父类—员工类。子类:工人类,农民类,教师类,科学家类,服务生类。
        (1)其中工人,农民,服务生只有基本工资
        (2)教师除基本工资外,还有课酬(元/天)(3)科学家除基本工资外,还有年终奖
        (4)编写一个测试类,将各种类型的员工的全年工资打印出来

         */

        Employee[] employees = new Employee[5];
        employees[0] = new Worker("worker1",100);
        employees[1] = new Farmer("farmer1",70);
        employees[2] = new Waiter("waiter1",100);
        employees[3] = new Teacher("teacher1",500,200);
        employees[4] = new Scientist("scientist",300,20000);


        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i].getName()+"全年收入:"+employees[i].annualSalary());
        }

        System.out.println("----------------第5题结束----------------------");

        /*
        6.在父类和子类中通过this和super都可以调用哪些属性和方法，假定Grand .Father和Son在同一个包
        class Grand{
            String name="AA";
            private int age=100;
            public void g1(){
            }
        }

        class Father extends Grand{
            String id="001";
            private double score;
            public void f1(){
                //super可以访问哪些成员(属性和方法)?
                属性:name
                方法: g1()
                //this可以访问哪些成员?
                 id,socore,
                 f1();
            }
        }
        class Son extends Father{
            String name="BB";
            pubic void g1();
            private void show(){
                //super可以访问哪些成员(属性和方法)?
                属性:name,id
                方法: g1(),f1()
                //this可以访问哪些成员?
                属性:name,id,
                方法:f1(),g1(),show();
            }
        }
         */


        System.out.println("----------------第6题结束----------------------");


        /*
        7.写出程序结果
        class Test{
            String name = "Rose";
            Test(){
                System.out.println("Test");
            }
            Test(String name){
                this.name = name;
            }
        }


        class Demo extends Test{
            String name="Jack";

            Demo() {
                super();
                System.out.println("Demo");
            }
            Demo(String s){
                super(s);
            }
            public void test({
                System.out.println(super.name);
                System.out.println(this.name);
            }
            public static void main(String[] args){
                new Demo().test();
                new Demo("john").test();
            }
        }

        //答题-
          输出:
            Test
            Demo
            Rose
            Jack

            john
            Jack
         */
        System.out.println("----------------第7题结束----------------------");


        System.out.println("第8题 每月执行未做");
        System.out.println("----------------第8题结束----------------------");

        System.out.println("第9题 类Point,LabeledPoint");
        System.out.println("----------------第9题结束----------------------");

        Doctor doctor1 = new Doctor("医生1",111,"doctor",'男',20000);
        Doctor doctor2 = new Doctor("医生1",111,"doctor",'男',20000);
        Doctor doctor11 = doctor1;
        Doctor doctor22 = new Doctor("医生22",111,"doctor",'男',20000);
        System.out.println("doctor1.equals(doctor2):"+(doctor1.equals(doctor2)));
        System.out.println("doctor1.equals(doctor11):"+(doctor1.equals(doctor11)));
        System.out.println("doctor2.equals(doctor2):"+(doctor2.equals(doctor22)));


        System.out.println("----------------第10题结束----------------------");

        /*
        11.现有Person类，里面有方法run、eat,Student类继承了Person类，并重写了run方法，
        自定义了study方法,试写出对象向上转型和向下转型的代码，并写出各自都可以调用哪些方法,并写出方法输出什么?
            class Person {
                public void run(){
                    System.out.println("person run");

                }
                public void eat(){
                    System.out.println("person eat");
                }
            }
            class Student extends Person {
                public void run(){
                    System.out.println("student run");
                }
                public void study(){
                    System.out.println("student study..");
                }

            }

            答题:
                student 可以调用: run(student下) eat(person下) study(student下);
                Person 可以调用:run eat (person下)

                Person person = new Student();
                person.run(); -----student run
                person.eat(); -----person eat
                向下转型:
                Student person_stu = (Student) person;
                可以调用3个方法 student run student study..  person eat
                向上转型
                Student student =  new Student();
                Person person_stu = (Person) student;
                可以调用2个方法 person run  person eat
         */
        System.out.println("----------------第11题结束----------------------");

        /*
            12.说出==和equals的区别

            答题: == : 基本类型比较值 引用类型比较 是否是同一个地址（同一个对象）
                 equals : 引用类型用 未重写的情况下 使用Object类中的equals 比较是否为同一个地址（同一个对象）
         */

        System.out.println("----------------第12题结束----------------------");

        System.out.println("13题在subject13包内");
        System.out.println("----------------第13题结束----------------------");

        /*

        14题
        答题:输出顺序如下
         我是A类  --A类无参构造
         hahah我是B类的有参构造  --B类有参构造
         我是c类的有参构造 --C类有参构造
         我是c类的无参构造 --C类无参构造
         */
        System.out.println("----------------第14题结束----------------------");

        /*
            15.什么是多态,多态具体体现有哪些?(可举例说明)
            答题:
              动态绑定
              父类向下转型 子类向上转型
              属性从编译类型开始找
              成员方法从运行类型开始找

         */
        System.out.println("----------------第15题结束----------------------");

        /*
            16. java的动态绑定机制是什么?
            答题:
               属性从编译类型开始找
              成员方法从运行类型开始找
        */


    }
}
