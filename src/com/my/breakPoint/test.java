package com.my.breakPoint;

import org.omg.CORBA.portable.ApplicationException;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class test {


    public static void main(String[] args) throws Exception{

        //如果endtime在本周 则不计算第二周
        //

        int countPeriod = 0;

        String startTimePeriod="",endTimePeriod="";//当前周期开始结束时间  --周期
        String startTimeFinal="",endTimeFinal="";//本周期开始(周几)对应的年月日-以下为计算过程 以及本周期结束.... --填报
        String  startTime= "2022-3-1",endTime="2022-3-7";
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
        String startPeriod = "星期三",endPeriod = "星期六" ;//开始周期 +结束周期

        Date startTimeDate = sdf1.parse(startTime);//任务开始时间
        String startTimeWeek = getWeek(startTimeDate);

        //计算周期开始日期(周几) 与任务开始日期(几几年几月几号)差的天数  -目的 用任务开始日期算出 本周期第一天的日期
        int startpastday = getWeekNum(getWeek(sdf1.parse(startTime))) - getWeekNum(startPeriod) ;

        //计算周期开始日期(周几) 与周期结束日期(周几)差的天数
        int endpastday =  getWeekNum(endPeriod) - getWeekNum(startPeriod);

        int betweenDay = daysBetween(sdf1.parse(startTime),sdf1.parse(endTime));//计算结束日期和开始日期差多少天
        System.out.println(betweenDay);



        startTimeFinal = getDayBefore(startTime,startpastday);
        endTimeFinal = getDayAfter(startTimeFinal,endpastday);
        System.out.println("startTimeFinal填报开始"+startTimeFinal);
        System.out.println("endTimeFinal填报结束"+endTimeFinal);

        if(betweenDay <= 7){
            //计算本周日日期
            int weekendPastday = getWeekNum("星期天") - getWeekNum(getWeek(sdf1.parse(startTime)));
            String weekendThis = getDayAfter(startTime,weekendPastday);
            System.out.println("本周日"+weekendThis);
            if((sdf1.parse(endTime)).before(sdf1.parse(weekendThis))){//如果任务结束日期在本周末之前
                if((sdf1.parse(endTime)).before(sdf1.parse(endTimeFinal))){//如果任务结束日期在本周周期结束日期之前
                    endTimePeriod = endTime;//本周期任务结束时间= 任务周期结束日期
                }else{
                    endTimePeriod = endTimeFinal;//本周期任务结束时间= 本周周期结束日期
                }
            }else{//如果任务结束日期在本周末之后
                endTimePeriod = endTimeFinal;//本周期任务结束时间= 本周周期结束日期
            }
        }else{





        }



    }
    /**
     * 获得指定日期的后一天
     * @param specifiedDay,n
     * @return
     */
    public static String getDayAfter(String specifiedDay,int n){
        Calendar c = Calendar.getInstance();
        Date date=null;
        try {
            date = new SimpleDateFormat("yy-MM-dd").parse(specifiedDay);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        c.setTime(date);
        int day=c.get(Calendar.DATE);
        c.set(Calendar.DATE,day+n);
        String dayAfter=new SimpleDateFormat("yyyy-MM-dd").format(c.getTime());
        return dayAfter;
    }

    /**
     * 获得指定日期的前n天
     * @param specifiedDay,n
     * @return
     */
    public static String getDayBefore(String specifiedDay,int n){
        Calendar c = Calendar.getInstance();
        Date date=null;
        try {
            date = new SimpleDateFormat("yy-MM-dd").parse(specifiedDay);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        c.setTime(date);
        int day=c.get(Calendar.DATE);
        c.set(Calendar.DATE,day - n);
        String dayBefore=new SimpleDateFormat("yyyy-MM-dd").format(c.getTime());
        return dayBefore;
    }


    //判断星期先后用
    public static int getWeekNum(String n){
        char x = '0';
        if(n.length() == 3){
            x = n.charAt(2);
        }else if(n.length() == 2){
            x = n.charAt(1);
        }else{
            //throw new ApplicationException("星期长度不正确");
        }

        switch (x){
            case '一':
                return 1;
            case '二':
                return 2;
            case '三':
                return 3;
            case '四':
                return 4;
            case '五':
                return 5;
            case '六':
                return 6;
            case '天':
                return 7;
            case '日':
                return 7;
            case '七':
                return 7;
            default:
                return -1;
        }
    }

    public static String getWeek(Date date){

        SimpleDateFormat sdf = new SimpleDateFormat("EEEE");

        String week = sdf.format(date);

        return week;

    }



    /**
     * 计算两个日期之间相差的天数
     * @param smdate 较小的时间
     * @param bdate 较大的时间
     * @return 相差天数
     * @throws ParseException
     */
    public static int daysBetween(Date smdate,Date bdate) throws ParseException
    {
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        smdate=sdf.parse(sdf.format(smdate));
        bdate=sdf.parse(sdf.format(bdate));
        Calendar cal = Calendar.getInstance();
        cal.setTime(smdate);
        long time1 = cal.getTimeInMillis();
        cal.setTime(bdate);
        long time2 = cal.getTimeInMillis();
        long between_days=(time2-time1)/(1000*3600*24);

        return Integer.parseInt(String.valueOf(between_days));
    }

}
