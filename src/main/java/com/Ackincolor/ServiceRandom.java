package com.Ackincolor;

import java.util.Random;

public class ServiceRandom implements MyRandom {
    public ServiceRandom()
    {

    }

    @Override
    public int getNumber(Utilisateur user) {
        Random rand = new Random();
        return rand.nextInt(user.getDiffpls()-user.getDiffmoins()) + user.getDiffmoins();
    }
}
