package com.my.thread_;

/**
 * @author Gzy
 * @version 1.0
 */
public class DeadLock {
    public static void main(String[] args){
        Tdlk tdlk1 = new Tdlk(true);
        tdlk1.setName("T1");
        Tdlk tdlk2 = new Tdlk(false);
        tdlk2.setName("T2");
        tdlk1.start();
        tdlk2.start();

        //守护线程
        new Thread(new Runnable() {
            @Override
            public void run() {
                int count = 0;
                while (true){
                    count ++;
                   try {
                       System.out.println("守护线程say:"+tdlk1.getName()+"status-"+tdlk1.getState()+count);
                       System.out.println("守护线程say:"+tdlk2.getName()+"status-"+tdlk2.getState()+count);
                       Thread.sleep(2000);
                       if(tdlk1.getState() == Thread.State.TERMINATED && tdlk2.getState() == Thread.State.TERMINATED){
                           System.out.println("工作线程结束,守护线程倒计时5秒退出");
                           for (int i = 5; i > 0; i--) {
                               System.out.println(i);
                                Thread.sleep(1000);
                           }
                           System.out.println("守护线程退出成功");
                           break;
                       }
                   }catch(InterruptedException e){
                       e.printStackTrace();
                   }
                }
            }
        }).start();

    }
}

class Tdlk extends Thread{
    static Object object1 = new Object();
    static Object object2 = new Object();
    boolean flag;


    public Tdlk(boolean flag) {
        this.flag = flag;
    }

    @Override
    public void run() {

        if(flag){
            synchronized(object1){
                System.out.println(Thread.currentThread().getName()+"进入1");
                System.out.println(Thread.currentThread().getName()+"status:"+Thread.currentThread().getState());
                synchronized(object2){
                    System.out.println(Thread.currentThread().getName()+"进入2");
                    System.out.println(Thread.currentThread().getName()+"status:"+Thread.currentThread().getState());
                }
            }
        }else{
            synchronized(object2){
                System.out.println(Thread.currentThread().getName()+"进入3");
                System.out.println(Thread.currentThread().getName()+"status:"+Thread.currentThread().getState());
                synchronized(object1){
                    System.out.println(Thread.currentThread().getName()+"进入4");
                    System.out.println(Thread.currentThread().getName()+"status:"+Thread.currentThread().getState());
                }
            }
        }


    }



}
