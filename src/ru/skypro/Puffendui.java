package ru.skypro;

public class Puffendui extends Hogwards implements Comparable<Puffendui> {
    // Студенты Пуффендуя трудолюбивы, верны, честны.
    private int hardWork;
    private int loyalty;
    private int honesty;

    public Puffendui(String name, int magicPower, int magicMove, int hardWork, int loyalty, int honesty) {
        super(name, magicPower, magicMove);
        this.hardWork = hardWork;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    @Override
    public String toString() {
        return "Пуффендуя {" +
                "Трудолюбие = " + hardWork +
                ", Верность = " + loyalty +
                ", Честность = " + honesty +
                '}';
    }

    @Override
    public int compareTo(Puffendui o) {
        int result;
        result = Integer.compare(hardWork, o.hardWork);
        return result;
    }
}
