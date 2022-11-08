public class Main {
    public static void main(String[] args) {
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println ("Переменная dog " + dog);
        System.out.println ("Переменная cat " + cat);
        System.out.println ("Переменная paper " + paper);
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println ("Новое значение переменной dog " + dog);
        System.out.println ("Новое значение переменной cat " + cat);
        System.out.println ("Новое значение переменной paper " + paper);
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println ("Новое значение переменной dog " + dog);
        System.out.println ("Новое значение переменной cat " + cat);
        System.out.println ("Новое значение переменной paper " + paper);

        var friend = 19;
        System.out.println ("Значение переменной friend " + friend);
        friend = friend + 2;
        System.out.println ("Новое значение переменной friend " + friend);
        friend = friend / 7;
        System.out.println ("Новое значение переменной friend " + friend);
        var frog = 3.5;
        System.out.println ("Значение переменной frog " + frog);
        frog = frog * 10;
        System.out.println ("Новое значение переменной frog " + frog);
        frog = frog / 3.5;
        System.out.println ("Новое значение переменной frog " + frog);
        frog = frog + 4;
        System.out.println ("Новое значение переменной frog " + frog);

        var boxerKhabib = 78.2;
        var boxerMcGregor = 82.7;
        System.out.println ("Вес Хабиба " + boxerKhabib + " кг");
        System.out.println ("Вес МакГрегора " + boxerMcGregor + " кг");
        var boxersTotalWeight = boxerKhabib + boxerMcGregor;
        System.out.println ("Общий вес бойцов " + boxersTotalWeight + " кг");
        var weightDifference = boxerMcGregor - boxerKhabib;
        System.out.println ("Разница в весе бойцов " + weightDifference + " кг");
        weightDifference = boxerMcGregor % boxerKhabib;
        System.out.println ("Разница в весе бойцов " + weightDifference + " кг");

        var workingTime = 640;
        var shiftDuration = 8;
        System.out.println ("Поделено между сотрудниками – " + workingTime + " часов");
        System.out.println ("Длительность смены – " + shiftDuration + " часов");
        var amountWorkers = workingTime / shiftDuration;
        System.out.println ("Всего сотрудников в компании – " + amountWorkers + " человек");
        amountWorkers = amountWorkers + 94;
        workingTime = shiftDuration * amountWorkers;
        System.out.println ("Если в компании работает " + amountWorkers + " человек,то всего " + workingTime + " часов работы может быть поделено между сотрудниками");
    }
}