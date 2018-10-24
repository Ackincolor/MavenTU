package com.Ackincolor;

public class ServiceRandomTest implements MyRandom{
    private int number;
    public ServiceRandomTest(int number)
    {
        this.number = number;
    }

    @Override
    public int getNumber(Utilisateur user) {
        return this.number;
    }
}
