package com.dabney;


class Computer extends Player {


    public int rollRandomNumber() {
        return (int) (Math.round( Math.random() * 2 ));
    }

}
