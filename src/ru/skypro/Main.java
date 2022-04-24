package ru.skypro;

public class Main {
    public static void main(String[] s) {
        Main dambldor = new Main();

        // факультет Гриффиндор.
        Griffindor potter = new Griffindor("Гарри Поттер",95,98, 94, 97, 96);
        dambldor.showInfo(potter);
        Griffindor germiona = new Griffindor("Гермиона Грейнджер", 88,87, 91, 90, 89);
        dambldor.showInfo(germiona);
        Griffindor ron = new Griffindor("Рон Уизли", 85,82, 84, 83, 86);
        dambldor.showInfo(ron);
        System.out.println();
        System.out.println("========================================================");
        System.out.println();

        // факультет Пуффендуй.
        Puffendui sahary = new Puffendui("Захария Смит", 78, 76, 74, 75, 77);
        dambldor.showInfo(sahary);
        Puffendui sedric = new Puffendui("Седрик Диггори",68, 65, 72, 71, 66);
        dambldor.showInfo(sedric);
        Puffendui djastin = new Puffendui("Джастин Финч-Флетчли", 65, 62, 60, 73, 69);
        dambldor.showInfo(djastin);
        System.out.println();
        System.out.println("========================================================");
        System.out.println();

        // факультете Когтевран.
        Cogtewrancy chjou = new Cogtewrancy("Чжоу Чанг",59, 61, 59, 77, 65, 64);
        dambldor.showInfo(chjou);
        Cogtewrancy padma = new Cogtewrancy("Падма Патил", 58, 60, 77, 64, 61, 59);
        dambldor.showInfo(padma);
        Cogtewrancy marcus = new Cogtewrancy("Маркус Белби", 51, 47, 57, 59, 60, 49);
        dambldor.showInfo(marcus);
        System.out.println();
        System.out.println("========================================================");
        System.out.println();

        // факультет Слизерин.
        Sliserin draco = new Sliserin("Драко Малфой", 89, 85, 74, 85, 79, 81, 91);
        dambldor.showInfo(draco);
        Sliserin grahem = new Sliserin("Грэхэм Монтегю", 71, 69, 66, 67, 65, 64, 62);
        dambldor.showInfo(grahem);
        Sliserin gregory = new Sliserin("Грегори Гойл",59, 61, 60, 57, 59, 52, 56);
        dambldor.showInfo(gregory);
        System.out.println();
        System.out.println("========================================================");
        System.out.println();

        switch (potter.compareTo(germiona)){
            case 1 -> System.out.println(potter.getName() + " храбрее, чем " + germiona.getName());
            case 0 -> System.out.println(potter.getName() + " и " + germiona.getName() + " храбры одинаково");
            case -1 -> System.out.println(potter.getName() + " не храбрее, чем " + germiona.getName());
            default -> System.out.println("Аномалия!");
        }

        switch (sahary.compareTo(djastin)){
            case 1 -> System.out.println(sahary.getName() + " трудолюбивее, чем " + djastin.getName());
            case 0 -> System.out.println(sahary.getName() + " и " + djastin.getName() + " трудолюбивее одинаково");
            case -1 -> System.out.println(sahary.getName() + " не трудолюбивее, чем " + djastin.getName());
            default -> System.out.println("Аномалия!");
        }

        switch (chjou.compareTo(marcus)){
            case 1 -> System.out.println(chjou.getName() + " умнее, чем " + marcus.getName());
            case 0 -> System.out.println(chjou.getName() + " и " + marcus.getName() + " умны одинаково");
            case -1 -> System.out.println(chjou.getName() + " не умнее, чем " + marcus.getName());
            default -> System.out.println("Аномалия!");
        }

        switch (draco.compareTo(gregory)){
            case 1 -> System.out.println(draco.getName() + " хитрее, чем " + gregory.getName());
            case 0 -> System.out.println(draco.getName() + " и " + gregory.getName() + " хитры одинаково");
            case -1 -> System.out.println(draco.getName() + " не хитрее, чем " + gregory.getName());
            default -> System.out.println("Аномалия!");
        }
        System.out.println();
        System.out.println("========================================================");
        System.out.println();

        dambldor.compareStudents(sahary, draco);
        dambldor.compareStudents(germiona, draco);

    }

    public void showInfo(Hogwards hogwards){
        System.out.println("Имя = " + hogwards.getName() + ", " +
                "Колдовство = " + hogwards.getMagicMove() + ", "+
                "Ерансгрессировать = " + hogwards.getMagicPower()+ ", " +
                "Факультет = " + hogwards);

    }

    public void compareStudents(Hogwards s1, Hogwards s2){
        if ( s1.getMagicMove() > s2.getMagicMove() ) {
            System.out.println(s1.getName() + " обладает большей мощностью магии, чем  " + s2.getName());
        } else {
            System.out.println(s1.getName() + " обладает меньшей или равной мощностью магии, чем  " + s2.getName());
        }
    }
}
