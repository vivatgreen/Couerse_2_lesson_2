package ru.skypro;

public class Cogtewrancy extends Hogwards implements Comparable<Cogtewrancy> {

    private int clever;
    private int wise;
    private int witty;
    private int creativity;

    public Cogtewrancy (String name, int magicPower, int magicMove, int clever, int wise, int witty, int creativity) {
        super(name, magicPower, magicMove);
        this.clever = clever;
        this.wise = wise;
        this.witty = witty;
        this.creativity = creativity;
    }

    @Override
    public String toString() {
        return "Когтевранц {" +
                "Ум = " + clever +
                ", Мудрость = " + wise +
                ", Остроумие = " + witty +
                ", Творчество = " + creativity +
                '}';
    }

    @Override
    public int compareTo(Cogtewrancy o) {
        int result;
        result = Integer.compare(clever, o.clever);
        return result;
    }
}
