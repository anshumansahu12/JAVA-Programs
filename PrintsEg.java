class Scanning extends Thread {
    public void run() {
        for(int i=1; i<=4; i++) {
            System.out.println("Scanning The Paper: ");
        }
    }
};
class Printing extends Thread {
    public void run(){
        for(int i=1; i<=3; i++) {
            System.out.println("Printing The Paper: ");
        }
    }
};
class MyPrinter implements Runnable {
    public void run() {
        System.out.println("Printer Is Running Eficiently");

    }
};

class PrintsEg {
    public static void main(String args[]) {
        Scanning s1=new Scanning();
        Printing p1=new Printing();
        s1.start();
        p1.start();
        MyPrinter m1=new MyPrinter();
        Thread obj=new Thread(m1);
        obj.start();
    }
};
