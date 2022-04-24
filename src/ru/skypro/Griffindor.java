package ru.skypro;

import java.util.Objects;

public class Griffindor extends Hogwards implements Comparable<Griffindor> {

    private int nobility;
    private int honour;
    private int bravery;

    public Griffindor(String name, int magicPower, int magicMove, int nobility, int honour, int bravery) {
        super(name, magicPower, magicMove);
        this.nobility = nobility;
        this.honour = honour;
        this.bravery = bravery;
    }

    @Override
    public String toString() {
        return "Гриффиндорцам {" +
                "благородство = " + nobility +
                ", честь = " + honour +
                ", храбрость = " + bravery +
                '}';
    }


    @Override
    public int compareTo(Griffindor o) {
        int result;
        result = Integer.compare(bravery, o.bravery);
        return result;
    }
}