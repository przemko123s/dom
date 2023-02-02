package lekcja7;

public class Student extends Person implements Profitable{
    private double scholarship;
    private double pocketMoney;

    public Student(String name, String surName, double scholarship, double pocketMoney) {
        super(name, surName);
        this.scholarship = scholarship;
        this.pocketMoney = pocketMoney;
    }


    public double getTotalIncome() {
        return scholarship + pocketMoney;
    }
}