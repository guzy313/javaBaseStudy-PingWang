package com.my.enum_;

/**
 * @author Gzy
 * @version 1.0
 */
public class Enumeration03 {
    public static void main(String[] args) {
        //Music01.CLSSICMUSIC.playing();

        System.out.println(Fenum.XXX);
        /*
        for (Week week:Week.values()) {
            System.out.println(week.getName()+"\t"+ week.getNum());
        }
        */


        /*
        Season03 spring = Season03.SPRING;
        System.out.println(spring);
        System.out.println(spring.name());
        System.out.println(spring.ordinal());
        Season03[] values = Season03.values();
        for (Season03 season:values) {

        }*/
        /*
        int[] nums = {1,2,9};
        for (int i = 0; i < nums.length; i++) {
            System.out.println("fori i = "+i);
        }

        for (int i:nums) {
            System.out.println("foreach i = "+i);
        }*/
        /*
        Season03 season03 = Season03.valueOf("AUTUMN");
        System.out.println(season03);

        System.out.println(Season03.SPRING.compareTo(Season03.WINTER));
            */




    }
}

interface Playing01{
    public void playing();
}
enum Music01 implements Playing01{
    CLSSICMUSIC;


    @Override
    public void playing() {
        System.out.println("播放音乐01");
    }
}


enum Season03{
    SPRING("春天","温暖"),
    SUMMER("夏天","炎热"),
    AUTUMN("秋天","凉爽"),
    WINTER("冬天","寒冷");
    private String name;
    private String desc;

    Season03(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }



    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }

    @Override
    public String toString() {
        return "Season03{" +
                "name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
}

enum Fenum{
    YYY,XXX,SSS
}