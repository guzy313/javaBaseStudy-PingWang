package com.my;

public class Sub extends Base{

    // 构造器
    public Sub() {
        this("12");
        System.out.println("Sub()...");
    }
    // 构造器
    public Sub(String name) {
        super(111);
        System.out.println("有参Sub()...");
    }



    //子类方法
    public void sayOk(){
        //非私有的属性和方法可以在子类直接访问
        System.out.println(n1+n2+n3);
        test100();
        test200();
        test300();

    }

}
