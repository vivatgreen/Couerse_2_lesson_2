package ru.skypro;

public class Sliserin extends Hogwards implements Comparable<Sliserin> {
    // Всем ученикам Слизерина присущи хитрость, решительность, амбициозность, находчивость и жажда власти
    private int cunning;
    private int decisiveness;
    private int ambitiousness;
    private int resourcefulness;
    private int lustPower;

    public Sliserin(String name, int magicPower, int magicMove, int cunning, int decisiveness, int ambitiousness, int resourcefulness, int lustPower) {
        super(name, magicPower, magicMove);
        this.cunning = cunning;
        this.decisiveness = decisiveness;
        this.ambitiousness = ambitiousness;
        this.resourcefulness = resourcefulness;
        this.lustPower = lustPower;
    }

    @Override
    public String toString() {
        return "Слизерина {" +
                "Хитрость = " + cunning +
                ", Решительность = " + decisiveness +
                ", Амбтциодность = " + ambitiousness +
                ", Находчивость = " + resourcefulness +
                ", Власть = " + lustPower +
                '}';
    }

    @Override
    public int compareTo(Sliserin o) {
        int result;
        result = Integer.compare(cunning, o.cunning);
        return result;
    }
}
