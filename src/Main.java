public class Main {
    public static void main(String[] args) {
        var dog = 8.0;
        System.out.println(dog);
        dog = dog + 4;
        System.out.println(dog);
        dog = dog - 3.5;
        System.out.println(dog);
        var cat = 3.5;
        System.out.println(cat);
        cat = cat + 4;
        System.out.println(cat);
        cat = cat - 1.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);
        paper = paper + 4;
        System.out.println(paper);
        paper = paper - 7639;
        System.out.println(paper);
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

var theFirstBoxerWeight = 78.2;
        System.out.println("Вес первого боксера " + theFirstBoxerWeight + "кг!");
var theSecondBoxerWeight = 82.7;
        System.out.println("Вес второго боксера " + theSecondBoxerWeight + "кг!");
var totalWeght = (theFirstBoxerWeight + theSecondBoxerWeight);
        System.out.println("Общий вес " + totalWeght + "кг!" );
        var differenceWeight = (theFirstBoxerWeight - theSecondBoxerWeight);
        System.out.println("Разница веса бойцов " + differenceWeight + "кг!");
        var differeneWeight1 = (theSecondBoxerWeight - theFirstBoxerWeight);
        System.out.println("Разница веса бойцов " + differeneWeight1 + "кг!" ); // Вычитание из большего меньшее
        var differenceWeight2 = (theSecondBoxerWeight % theFirstBoxerWeight);
        System.out.println("Разница веса бойцов " + differenceWeight2 + "кг!"); // Остаток от деления

var openingHours = 640;
        System.out.println("Работы поделено между сотрудниками " + openingHours + " часов.");
var workingHours = 8;
        System.out.println("Каждый сотрудник посвящает работе " + workingHours + " часов");
var totalEmployees = (openingHours / workingHours);
        System.out.println("Всего работников в компании " + totalEmployees + " человек!");
var manRunning = 94;
var totalEmployees1 = (totalEmployees + manRunning);
        System.out.println("Всего работников в компании " + totalEmployees1 + " человек!");
        var hoursOfWorkPerPerson = (openingHours / totalEmployees1);
        System.out.println("Если в компании работает " + totalEmployees1 + " человек, то всего " + hoursOfWorkPerPerson + " часов работы может быть поделено между сотрудниками" );


    }
}