package ru.skypro;

public class Main {
    public static void main(String[] s) {
        Main dambldor = new Main();

        // Гарри Поттер, Гермиона Грейнджер и Рон Уизли учатся на факультете Гриффиндор.
        Griffindor potter = new Griffindor("Гарри Поттер",100,100, 100, 100, 100);
        dambldor.showInfo(potter);
        Griffindor germiona = new Griffindor("Гермиона Грейнджер", 90,90, 90, 90, 90);
        dambldor.showInfo(germiona);
        Griffindor ron = new Griffindor("Рон Уизли", 80,80, 80, 80, 80);
        dambldor.showInfo(ron);
        System.out.println("**************************");

        // На факультет Пуффендуй учатся Захария Смит, Седрик Диггори, Джастин Финч-Флетчли.
        Puffendui sahary = new Puffendui("Захария Смит", 60, 55, 60, 50, 80);
        dambldor.showInfo(sahary);
        Puffendui sedric = new Puffendui("Седрик Диггори",70, 50, 70, 70, 50);
        dambldor.showInfo(sedric);
        Puffendui djastin = new Puffendui("Джастин Финч-Флетчли", 40, 45, 40, 70, 70);
        dambldor.showInfo(djastin);
        System.out.println("**************************");

        // На факультете Когтевран учится Чжоу Чанг, Падма Патил и Маркус Белби.
        Cogtewrancy chjou = new Cogtewrancy("Чжоу Чанг",50, 60, 50, 70, 60, 60);
        dambldor.showInfo(chjou);
        Cogtewrancy padma = new Cogtewrancy("Падма Патил", 60, 60, 70, 40, 50, 50);
        dambldor.showInfo(padma);
        Cogtewrancy marcus = new Cogtewrancy("Маркус Белби", 40, 30, 60, 40, 40, 30);
        dambldor.showInfo(marcus);
        System.out.println("**************************");

        // Драко Малфой, Грэхэм Монтегю, Грегори Гойл учатся на Слизерине.
        Sliserin draco = new Sliserin("Драко Малфой", 85, 85, 70, 85, 75, 80, 90);
        dambldor.showInfo(draco);
        Sliserin grahem = new Sliserin("Грэхэм Монтегю", 60, 60, 60, 60, 60, 60, 60);
        dambldor.showInfo(grahem);
        Sliserin gregory = new Sliserin("Грегори Гойл",50, 50, 50, 55, 55, 55, 55);
        dambldor.showInfo(gregory);
        System.out.println("**************************");

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
        System.out.println("**************************");

        dambldor.compareStudents(sahary, draco);
        dambldor.compareStudents(germiona, draco);

    }

    public void showInfo(Hogwards hogvards){
        System.out.println("Имя = " + hogvards.getName() + ", " +
                "Колдовство = " + hogvards.getMagicMove() + ", "+
                "Ерансгрессировать = " + hogvards.getMagicPower()+ ", " +
                "Факультет = " + hogvards);

    }

    public void compareStudents(Hogwards s1, Hogwards s2){
        if ( s1.getMagicMove() > s2.getMagicMove() ) {
            System.out.println(s1.getName() + " обладает большей мощностью магии, чем  " + s2.getName());
        } else {
            System.out.println(s1.getName() + " обладает меньшей или равной мощностью магии, чем  " + s2.getName());
        }
    }
}
