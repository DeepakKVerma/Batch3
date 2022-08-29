package com.training.inner;

class ComputerClass {
    double price;
    class Processor{

        double getCache(){
            return 7.8;
        }
    }
    // nested protected class
    protected class RAM{
        double getClockSpeed(){
            return 5.9;
        }
    }
}

public class InnerClassDemo2 {
    public static void main(String[] args) {
        // create object of Outer class CPU
        ComputerClass cpu = new ComputerClass();

        // Processor using outer class
        ComputerClass.Processor processor = cpu.new Processor();

        // RAM using outer class CPU
        ComputerClass.RAM ram = cpu.new RAM();

        System.out.println("Processor Cache = " + processor.getCache());
        System.out.println("RAM Clock speed = " + ram.getClockSpeed());
    }
}