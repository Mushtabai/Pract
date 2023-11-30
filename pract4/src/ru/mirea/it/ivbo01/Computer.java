package ru.mirea.it.ivbo01;

import java.util.Scanner;

public class Computer {
    public Memory memory = new Memory();
    public Monitor monitor = new Monitor();
    public Processor processor = new Processor();
    Marks Comp;
    public Computer(Marks computer)
    {
         this.Comp = computer;
    }
    public static void main(String args[]){


        Computer Comp = new Computer(Marks.HUAWEI);

        Comp.memory.setText("Сохраняем в информацию в память компьютера");
        Comp.monitor.PrintI((Comp.processor.Mul(3,4)));
        Comp.monitor.PrintS(Comp.memory.getText());
    }
}
